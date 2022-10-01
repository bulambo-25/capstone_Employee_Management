/*EmployeeLeave.java
 Entity for EmployeeLeave
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */

package za.ac.cput.capstone_Employee_Management.domain.employee;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

/*
EMPLOYEELEAVE.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */
@Entity
@IdClass(EmployeeLeave.EmployeeLeaveID.class)
public class EmployeeLeave  {
    @Id
    @NotNull

    private Long employeeId,leaveId;



    protected EmployeeLeave() {

    }
    private EmployeeLeave(Builder builder)
    {
        this.employeeId=builder.employeeId;
        this.leaveId=builder.leaveId;

    }
    public Long getEmployeeId() {
        return employeeId;
    }


    public Long getLeaveId() {
        return leaveId;
    }

    @Override
    public String toString() {
        return "EmployeeLeave{" +
                "employeeId='" + employeeId + '\'' +
                ", leaveId='" + leaveId + '\'' +
                '}';
    }



    public static class EmployeeLeaveID implements Serializable {
        private Long employeeId ;
        private Long leaveId;

        public EmployeeLeaveID(Long employeeId, Long leaveId) {
            this.employeeId = employeeId;
            this.leaveId = leaveId;
        }

        public Long getEmployeeId() {
            return employeeId;
        }

        public Long getLeaveId() {
            return leaveId;
        }

        protected EmployeeLeaveID() {
        }
    }

    public static class Builder {
        private Long employeeId;
        private Long leaveId;


        public Builder setEmployeeId(Long employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setLeaveId(Long leaveId) {
            this.leaveId = leaveId;
            return this;
        }



        public Builder copy(EmployeeLeave empl) {
            this.employeeId = empl.employeeId;
            this.leaveId = empl.leaveId;

            return this;
        }

        public EmployeeLeave build() {
            return new EmployeeLeave(this);
        }
    }
}

