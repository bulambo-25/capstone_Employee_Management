package za.ac.cput.capstone_Employee_Management.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.SEQUENCE;
/*
EmployeeAddressAPI.java
AUTHOR Mutamba Prince Bulambo
Student Number 220177767
Date April 11 2022
 */
@Entity
public class Gender {

    @Id
    @SequenceGenerator(name ="EmployeeGenderId_Sequence",sequenceName = "ORACLE_DB_SEQ_ID",
            allocationSize = 2,initialValue = 2023456590)
    @GeneratedValue(strategy = SEQUENCE ,generator = "EmployeeGenderId_Sequence")
    private Long genderId;
    @NotNull
    private String genderType;
    private String description;

    public void setEmtp(String emtp) {
        this.emtp = emtp;
    }

    public String emtp;

    public Gender(Builder builder)
    {
        this.genderId=builder.genderId;
        this.genderType=builder.genderType;
        this.description=builder.description;
    }

    public Gender() {

    }

    public Long getGenderId() {
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
        private Long genderId;
        private String genderType;
        private String description;

        public Builder setGenderId(Long genderId) {
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
