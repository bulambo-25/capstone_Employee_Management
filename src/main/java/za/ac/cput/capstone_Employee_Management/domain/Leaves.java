

package za.ac.cput.capstone_Employee_Management.domain;

import com.sun.istack.Builder;
import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
LEAVES.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */
    @Entity
    public class Leaves {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long leaveId;
        @NotNull
        private Long daysOfLeave;
        protected Leaves() {

        }
        public Leaves(Builder builder)
        {
            this.leaveId=builder.leaveId;
            this.daysOfLeave=builder.daysOfLeave;
        }

        public Long getDaysOfLeave() {

            return daysOfLeave;
        }

        public Long getLeaveId() {

            return leaveId;
        }



        @Override
        public String toString() {
            return "Leave{" +
                    "leaveId=" + leaveId +
                    ", daysOfLeave=" + daysOfLeave +
                    '}';
        }

        public static class Builder
        {
            private Long leaveId;
            private Long daysOfLeave;

            public Builder setLeaveId(Long leaveId) {
                this.leaveId = leaveId;
                return  this;
            }

            public Builder  setDaysOfLeave(Long daysOfLeave) {
                this.daysOfLeave = daysOfLeave;
                return  this;
            }

            public Builder copy(Leaves leave)
            {
                this.leaveId=leave.leaveId;
                this.daysOfLeave=leave.daysOfLeave;


                return this;
            }
            public Leaves build()
            {
                return new Leaves(this);
            }
        }


    }

