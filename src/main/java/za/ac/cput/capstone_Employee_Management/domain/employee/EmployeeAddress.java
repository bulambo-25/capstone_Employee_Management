package za.ac.cput.capstone_Employee_Management.domain.employee;

public class EmployeeAddress
{
    private String employeeId;
    private String addressTypeId;


    public EmployeeAddress(Builder builder)
    {
        this.employeeId=builder.employeeId;
        this.addressTypeId=builder.addressTypeId;

    }
    public String getEmployeeId() {
        return employeeId;
    }

    public String getAddressTypeId() {
        return addressTypeId;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "employeeId='" + employeeId + '\'' +
                ", addressTypeId='" + addressTypeId +
                '}';
    }

    public static class Builder
    {
        private String employeeId;
        private String addressTypeId;


        public Builder setEmployeeId(String employeeId) {
            this.employeeId =employeeId;
            return this;
        }

        public Builder setAddressTypeId(String addressTypeId) {
            this.addressTypeId= addressTypeId;
            return this;
        }


        public Builder cody(EmployeeAddress employeeAddress)
        {
            this.employeeId=employeeAddress.getEmployeeId();
            this.addressTypeId=employeeAddress.addressTypeId;


            return this;
        }
        public EmployeeAddress Build()
        {
            return new EmployeeAddress (this);
        }
    }


}
