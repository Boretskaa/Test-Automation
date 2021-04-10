package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        Employee employee1 = new SalariedEmployee("fgh", "fgh", 500, 5);
        employee1.Show();
        Employee employee2 = new SalariedEmployee("ert", "dfj", 800, 8);
        employee2.Show();
        Employee employee3 = new ContractEmployee("rtu", "uer", 700, 8300);
        employee3.Show();
        Employee employee4 = new ContractEmployee("poe", "wcb", 800, 8235);
        employee4.Show();

        ArrayList<Integer> employees = new ArrayList<Integer>();
        employees.add(500 * 5);
        employees.add(800 * 8);
        employees.add(8300);
        employees.add(8235);

        Collections.sort(employees);
        for (int counter : employees) {
            System.out.println(counter);


        }
    }
}
