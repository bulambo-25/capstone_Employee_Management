package za.ac.cput.capstone_Employee_Management.domain;

public class AddressType
{
    private String addressTypeId;
    private String streetName;
    private String postalCode;
    private String areaName;
    private String city;


    public AddressType(Builder builder) {
        this.addressTypeId =builder.addressTypeId;
        this.streetName =builder.streetName;
        this.postalCode =builder.postalCode;
        this.areaName =builder.areaName;
        this.city = builder.city;
    }

    public String getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(String addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        private String addressTypeId;
        private String streetName;
        private String postalCode;
        private String areaName;
        private String city;
        public Builder setAddressTypeId(String addressTypeId) {
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
