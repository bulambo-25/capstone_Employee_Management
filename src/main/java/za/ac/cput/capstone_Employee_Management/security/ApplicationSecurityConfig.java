package za.ac.cput.capstone_Employee_Management.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;
import static za.ac.cput.capstone_Employee_Management.security.ApplicationUserPermission.*;
import static za.ac.cput.capstone_Employee_Management.security.ApplicationUserRole.*;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig  {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity
                .csrf().disable()
                .authorizeHttpRequests((authz) -> {
                            try {
                                authz
                                        .antMatchers("/","index.html")
                                        .permitAll()
                                        //.antMatchers("/employee-management/employee/save").hasRole(ADMIN.name())

                                        .antMatchers(HttpMethod.POST,"/employee-management/**").hasAnyAuthority(EMPLOYEE_SAVE.getPermission())
                                        .antMatchers(HttpMethod.DELETE,"/employee-management/**").hasAuthority(EMPLOYEE_DELETE.getPermission())
                                        .antMatchers(HttpMethod.PUT,"/employee-management/**").hasAuthority(EMPLOYEE_EDIT.getPermission())
                                        .antMatchers(HttpMethod.GET,"/employee-management/**").hasAnyRole(ADMIN.name(), EMP.name(), MANAGER.name())
                                        .anyRequest()
                                        .authenticated()
                                        .and()
                                        .formLogin().usernameParameter("username").passwordParameter("password");
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                )
                .httpBasic(withDefaults());

        return httpSecurity.build();
    }
}
