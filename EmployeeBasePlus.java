package com.company;

public class EmployeeBasePlus extends EmployeeCommission {
    private double baseSalary;
    public EmployeeBasePlus(String firstName, String lastName, int id, double sales, double rate, double salary) {
        super(firstName, lastName, id, sales, rate);
        this.setBaseSalary(salary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        if(salary >= 0.0){
            this.baseSalary = salary;
        }else
            throw new IllegalArgumentException("Base salary >0.0");
    }


    @Override
    public double gain()                                                   {
        return getBaseSalary() + super.gain();
    }




    @Override
    public String toString()
    {
        return String.format( "%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary() );
    }




}
