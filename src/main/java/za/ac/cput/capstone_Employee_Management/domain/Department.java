package za.ac.cput.capstone_Employee_Management.domain;

/*
Employee-management-system.java
Department.java
Author: Martinez Safari 219325332
Date: 22/09/2022
 */


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Department")
public class Department implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_ID")
    private Long deptId;
    @Column(name = "department_Name")
    private String deptName;
    @Column(name = "department_Description")
    private String deptDesc;

    protected Department(){}

    private Department(Builder builder){
        this.deptId= builder.deptId;
        this.deptName= builder.deptName;
        this.deptDesc= builder.deptDesc;


    }
    public Long getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getDeptDesc() {
        return deptDesc;
    }
    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptDesc='" + deptDesc + '\'' +
                '}';
    }
    public static class Builder{
        private String deptName, deptDesc;
        private Long deptId;

        public Builder setDeptId(Long deptId) {
            this.deptId = deptId;
            return this;
        }

        public Builder setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }

        public Builder setDeptDesc(String deptDesc) {
            this.deptDesc = deptDesc;
            return this;
        }
        public Builder copy(Department department){
            this.deptId= department.deptId;
            this.deptName= department.deptName;
            this.deptDesc= department.deptDesc;
            return this;
        }
        public Department build(){

            return new Department(this);
        }

    }



}