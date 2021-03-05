package com.company;

public class EmployeeCommission extends Employee{
    private double sales;
    private double  rate;


    public EmployeeCommission(String firstName, String lastName, int id, double sales, double rate) {
        super(firstName, lastName, id);
        this.setRate(rate);
        this.setSales(sales);


    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        if(sales >= 0.0){
            this.sales = sales;
        }else
            throw new IllegalArgumentException("gross sales > 0.0");

    }


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate > 0.0 && rate < 1.0) {
            this.rate = rate;
        } else
            throw new IllegalArgumentException("Commission rat > 0 and < 1.0");

    }

    @Override
    public double gain(){
        return getSales()*getRate();
    }

    @Override
    public String toString(){
        return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f","commission employee", super.toString(), "gross sales", getSales(), "commission rate", getRate() );
    }


}
