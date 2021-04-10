package com.company;

public class Employee {
    public String employee;

    public Employee(String employee) {
        this.employee = employee;
    }

    protected Employee() {
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void Show() {
    }

    interface Pay {

        void calculatePay();
    }
}
