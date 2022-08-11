/*EmployeeLeave.java
 Entity for EmployeeLeave
 Author: Kululo Mangcunyana (219387117)
 Date: 10 April 2022
 */

package za.ac.cput.capstone_Employee_Management.domain.employee;

public class EmployeeLeave {
    private String employeeId;
    private String  leaveId;

    private EmployeeLeave(){}

    private EmployeeLeave(Builder builder){
        this.employeeId= builder.employeeId;
        this.leaveId= builder.leaveId;

    }
    public String getemployeeId() {
        return employeeId;
    }
    public void setemployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getleaveId() {
        return leaveId;
    }

    public void setleaveId(String leaveId) {
        this.leaveId = leaveId;
    }



    @Override
    public String toString() {
        return "EmployeeLeave{" +
                "employeeId='" + employeeId + '\'' +
                ",leaveId='" + leaveId+
                '}';
    }
    public static class Builder{

        private String employeeId;
        private String leaveId;



        public Builder setemployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }


        public  Builder setleaveId(String leaveId) {
            this.leaveId= leaveId;
            return this;
        }


        public Builder copy(EmployeeLeave employeeLeave) {
            this.employeeId = employeeLeave.employeeId;
            this.leaveId = employeeLeave.leaveId;

            return this;
        }
        public EmployeeLeave build(){
            return new EmployeeLeave(this);
        }
    }
}



