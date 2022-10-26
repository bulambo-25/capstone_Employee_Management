package za.ac.cput.capstone_Employee_Management.domain.employee;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@IdClass(EmployeeRole.EmployeeRoleID.class)
public class EmployeeRole {
    @Id
    @NotNull

    private Long employeeId, roleId;


    protected EmployeeRole() {

    }

    private EmployeeRole(EmployeeRole.Builder builder) {
        this.employeeId = builder.employeeId;
        this.roleId = builder.roleId;

    }

    public Long getEmployeeId() {
        return employeeId;
    }


    public Long getRoleId() {
        return roleId;
    }

    @Override
    public String toString() {
        return "EmployeeLeave{" +
                "employeeId='" + employeeId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }


    public static class EmployeeRoleID implements Serializable {
        private Long employeeId;
        private Long roleId;

        public EmployeeRoleID(Long employeeId, Long roleId) {
            this.employeeId = employeeId;
            this.roleId = roleId;
        }

        public Long getEmployeeId() {
            return employeeId;
        }

        public Long getRoleId() {
            return roleId;
        }

        protected EmployeeRoleID() {
        }
    }

    public static class Builder {
        private Long employeeId;
        private Long roleId;


        public EmployeeRole.Builder setEmployeeId(Long employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeRole.Builder setRoleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }


        public EmployeeRole.Builder copy(EmployeeRole emplr) {
            this.employeeId = emplr.employeeId;
            this.roleId = emplr.roleId;

            return this;
        }

        public EmployeeRole build() {
            return new EmployeeRole(this);
        }
    }
}