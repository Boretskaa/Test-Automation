package com.company;

public class SalariedEmployee extends Employee implements Employee.Pay {
    private String socialSecurityNumber;
    private int pay1;
    private int salary;
    private int hour;



    public SalariedEmployee(String employee, String socialSecurityNumber, int pay1, int hour) {
        super(employee);
        this.socialSecurityNumber = socialSecurityNumber;
        this.pay1 = pay1;
        this.hour = hour;
    }

    public int getPay1() {
        return pay1;
    }

    public void setPay1(int pay1) {
        this.pay1 = pay1;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public void calculatePay() {
        salary = pay1*hour;
    }



    public void Show() {
        calculatePay();
        System.out.println("SalariedEmployee {" + " Employee = '" + employee + " Salary = '" + salary  + '\'' + " socialSecurityNumber = '" + socialSecurityNumber + '\'' + ", pay1 = " + pay1 + ", hour = " + hour + '}');
    }
}
