package za.ac.cput.capstone_Employee_Management.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.SEQUENCE;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
@Entity
public class AddressType
{
    @Id
    @SequenceGenerator(name ="EmployeeGenderId_Sequence",sequenceName = "ORACLE_DB_SEQ_ID",
            allocationSize = 2,initialValue = 323456590)
    @GeneratedValue(strategy = SEQUENCE ,generator = "EmployeeGenderId_Sequence")
    private Long  addressTypeId;
    @NotNull
    private String streetName;
    @NotNull
    private String postalCode;
    @NotNull
    private String areaName;
    @NotNull
    private String city;

    public AddressType() {

    }


    public Long getAddressTypeId() {
        return addressTypeId;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getCity() {
        return city;
    }

    public AddressType(Builder builder) {
        this.addressTypeId =builder.addressTypeId;
        this.streetName =builder.streetName;
        this.postalCode =builder.postalCode;
        this.areaName =builder.areaName;
        this.city = builder.city;
    }


    @Override
    public String toString() {
        return "AddressType{" +
                "addressTypeId='" + addressTypeId + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", areaName='" + areaName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    public static class Builder{
        private Long addressTypeId;
        private String streetName;
        private String postalCode;
        private String areaName;
        private String city;

        public Builder setAddressTypeId(Long addressTypeId) {
            this.addressTypeId = addressTypeId;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setAreaName(String areaName) {
            this.areaName = areaName;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }
        public Builder copy(AddressType addressType) {
            this.addressTypeId =addressType.addressTypeId;
            this.streetName =addressType.streetName;
            this.postalCode =addressType.postalCode;
            this.areaName =addressType.areaName;
            this.city = addressType.city;
            return this;

        }
        public AddressType build() {
            return new AddressType(this);
        }
    }
}
