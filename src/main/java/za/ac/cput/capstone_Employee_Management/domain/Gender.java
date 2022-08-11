package za.ac.cput.capstone_Employee_Management.domain;

public class Gender {

    private String genderId;
    private String genderType;
    private String description;

    public Gender(Builder builder)
    {
        this.genderId=builder.genderId;
        this.genderType=builder.genderType;
        this.description=builder.description;
    }
    public String getGenderId() {
        return genderId;
    }

    public String getGenderType() {
        return genderType;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", genderType='" + genderType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder
    {
        private String genderId;
        private String genderType;
        private String description;

        public Builder setGenderId(String genderId) {
            this.genderId =genderId;
            return this;
        }

        public Builder setGenderType(String genderType) {
            this.genderType = genderType;
            return this;
        }

        public Builder setDescription(String description) {
            this.description= description;
            return this;
        }

        public Builder cody(Gender gender)
        {
            this.genderId=gender.genderId;
            this.genderType=gender.genderType;
            this.description=gender.description;

            return this;
        }
        public Gender  Build()
        {
            return new Gender (this);
        }
    }

}
