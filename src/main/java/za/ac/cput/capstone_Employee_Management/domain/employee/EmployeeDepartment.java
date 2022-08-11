package za.ac.cput.capstone_Employee_Management.domain.employee;

/*
Employee-management-system.java
EmployeeDepartment.java
Author: Martinez Safari 219325332
Date: 07/04/2022
 */

public class EmployeeDepartment {
    private String employeeId;
    private String deptId;

    private EmployeeDepartment() {
    }

    private EmployeeDepartment(Builder builder) {
        this.employeeId = builder.employeeId;
        this.deptId = builder.deptId;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "employeeId='" + employeeId + '\'' +
                ", deptId='" + deptId + '\'' +
                '}';
    }

    public static class Builder {
        private String employeeId;
        private String deptId;

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }

        public Builder copy(EmployeeDepartment employeeDepartment) {
            this.employeeId = employeeDepartment.employeeId;
            this.deptId = employeeDepartment.deptId;
            return this;
        }

        public EmployeeDepartment build() {
            return new EmployeeDepartment(this);
        }
    }
}