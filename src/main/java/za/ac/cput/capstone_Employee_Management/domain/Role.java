package za.ac.cput.capstone_Employee_Management.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

/*
Role.java
Author Reanetsi Sholoko
Student Number 218160402
 */



@Entity
@Data
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;
    @NotNull
    private String roleName;
    @NotNull
    private String roleDesc;
    protected Role() {

    }
    public Role(Role.Builder builder)
    {
        this.roleId=builder.roleId;
        this.roleName=builder.roleName;
        this.roleDesc=builder.roleDesc;
    }

    public String getRoleName() {

        return roleName;
    }

    public Long getRoleId() {

        return roleId;
    }
    public String getRoleDesc() {

        return roleDesc;
    }


    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName=" + roleName +
                ", roleDesc=" + roleDesc +

                '}';
    }

    public static class Builder
    {
        private Long roleId;
        private String roleName;
        private String roleDesc;

        public Role.Builder setRoleId(Long roleId) {
            this.roleId = roleId;
            return  this;
        }

        public Role.Builder setRoleName(String roleName) {
            this.roleName = roleName;
            return  this;
        }
        public Role.Builder setRoleDesc(String roleDesc) {
            this.roleDesc= roleDesc;
            return  this;
        }

        public Role.Builder copy(Role role)
        {
            this.roleId=role.roleId;
            this.roleName=role.roleName;
            this.roleDesc=role.roleDesc;


            return this;
        }
        public Role build()
        {
            return new Role(this);
        }
    }

}

