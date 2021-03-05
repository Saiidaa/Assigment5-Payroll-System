package com.company;

public class EmployeeHourly extends Employee {
    private double hours;
    private double salary;

    public EmployeeHourly(String firstName, String lastName, int id, double hours, double salary) {
        super(firstName, lastName, id);
        this.setHours(hours);
        this.setSalary(salary);

    }

    public double getSalary() {
        return salary;

    }


    public void setSalary(double HSalary) {
        if (HSalary >= 0.0) {
            this.hours = HSalary;

        } else throw new IllegalArgumentException("HourLY Wage must be >=1.5");



    }
    public double getHours() {
        return hours;
    }

    public void setHours(double hourWorked) {
        if(hourWorked >= 0.0){
            this.hours = hourWorked;
        }else
            throw new IllegalArgumentException("hour must be <=40 ");


    }
    @Override

    public double gain() {
        if (getHours() <= 40) {
            return getSalary() * getHours();
        }

        else { return getSalary()*getHours()+(getHours()-40)*getSalary()*1.5;

        }


    }

    @Override
    public String toString()
    {
        return String.format("\"hourly employee: %s\\n%s: $%,.2f; %s: %,.2f\", super.toString(), \"hourly wage\" , getWage(), \"hours worked\", getHours() ");

    }

}


