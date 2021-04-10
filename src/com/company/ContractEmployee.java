package com.company;

public class ContractEmployee extends Employee implements Employee.Pay{
    private String federalTaxldmember;
    private int pay2;
    private int salary2;

    public ContractEmployee(String federalTaxldmember) {
        this.federalTaxldmember = federalTaxldmember;
    }

    public ContractEmployee(String employee, String federalTaxldmember, int pay2, int salary2) {
        super(employee);
        this.federalTaxldmember = federalTaxldmember;
        this.pay2 = pay2;
        this.salary2 = salary2;
    }

    public String getFederalTaxldmember() {
        return federalTaxldmember;
    }

    public void setFederalTaxldmember(String federalTaxldmember) {
        this.federalTaxldmember = federalTaxldmember;
    }

    @Override
    public void calculatePay() {
        System.out.println("Salary: " + salary2);

    }

    @Override
    public String toString() {
        return "ContractEmployee{" + "Employee='" + employee + '\'' +  "federalTaxldmember='" + federalTaxldmember + '\'' + ", pay2=" + pay2 + ", salary2=" + salary2 + '}';
    }

    public void Show() {
        calculatePay();
        System.out.println( "ContractEmployee{" + "Employee='" + employee + '\'' +  "federalTaxldmember='" + federalTaxldmember + '\'' + ", pay2=" + pay2 + ", salary2=" + salary2 + '}');
    }

}
