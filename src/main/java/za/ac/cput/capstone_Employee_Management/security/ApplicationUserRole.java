package za.ac.cput.capstone_Employee_Management.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static za.ac.cput.capstone_Employee_Management.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {

    ADMIN(Sets.newHashSet(EMPLOYEE_SAVE,EMPLOYEE_VIEW,EMPLOYEE_DELETE)),
    EMP(Sets.newHashSet(
            EMPLOYEE_EDIT, EMPLOYEE_VIEW
                 ));

    private final Set<ApplicationUserPermission> userPermissions;

    ApplicationUserRole(Set<ApplicationUserPermission> userPermissions) {
        this.userPermissions = userPermissions;
    }

    public Set<ApplicationUserPermission> getUserPermissions() {
        return userPermissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions= getUserPermissions().stream().map(userPermissions-> new SimpleGrantedAuthority(userPermissions.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return permissions;

    }
}

