package com.company;

import java.io.Serializable;

public class EmployeeSalaried extends Employee {
    private double wSalary;

    public EmployeeSalaried(String firstName, String lastName, int id, double salary) {
        super(firstName, lastName, id);

        this.setWSalary(salary);
    }
    public double getWSalary(){
        return wSalary;
    }
    public Serializable setWSalary(double salary){
        if (salary >= 0.0 ){
            this.wSalary = salary;
        }
        else {
            throw new IllegalArgumentException("Weekly Salary  >= 0.0");

        }



        @Override
        public String toString(){
            return String.format("Salaried Employee: %s\n%s: $%,.2f", super.toString(), "weekly salary" , getWSalary());
        }

    }

    @Override
    public double gain() {
        return getWSalary();
    }
}
