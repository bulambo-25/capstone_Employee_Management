package za.ac.cput.capstone_Employee_Management.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static za.ac.cput.capstone_Employee_Management.security.ApplicationUserRole.ADMIN;
import static za.ac.cput.capstone_Employee_Management.security.ApplicationUserRole.EMP;

@Configuration
public class User {
    private final PasswordEncoder passwordEncoder;

    public User(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    protected UserDetailsService getUserDetailsService(){
        UserDetails Admin= org.springframework.security.core.userdetails.User.builder()
                .username("Farai")
                .password(passwordEncoder.encode("1234"))
                //.roles(ADMIN.name())
                .authorities(ADMIN.getGrantedAuthorities())
                .build();

        UserDetails Employee= org.springframework.security.core.userdetails.User.builder()
                .username("Dray")
                .password(passwordEncoder.encode("0987"))
                .authorities(EMP.getGrantedAuthorities())
                //.roles(EMPLOYEE.name())
                .build();

        return new InMemoryUserDetailsManager(Admin,Employee);
    }

}
