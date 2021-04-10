package com.company;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //прочитати 2 числа double, чи належать діапазону [-5;5]
        System.out.println("Input n1: ");
        double n1 = sc.nextDouble();
        System.out.println("Input n2: ");
        double n2 = sc.nextDouble();
        System.out.println("Input n3: ");
        double n3 = sc.nextDouble();
        if ((n1 >= -5) && (n1 <=5) && (n2 >= -5) && (n2 <=5) && (n3 >= -5) && (n3 <=5))
        {
            System.out.println("Yes!");
        }
        else
        {
            System.out.println("No!");
        }

        //прочитайте 3 цілих числа і запишіть max, min
        System.out.println("Input n1: ");
        int a1 = sc.nextInt();
        System.out.println("Input n2: ");
        int a2 = sc.nextInt();
        System.out.println("Input n3: ");
        int a3 = sc.nextInt();
        int max;
        if ((a1 > a2) && (a1 > a3))
        {
            max = a1;
            System.out.println("Max: " + max);
        }
        if ((a2 > a1) && (a2 > a3))
        {
            max = a2;
            System.out.println("Max: " + max);
        }
        if ((a3 > a1) && (a3 > a2))
        {
            max = a3;
            System.out.println("Max: " + max);
        }
        int min;
        if ((a1 < a2) && (a1 < a3))
        {
            min = a1;
            System.out.println("Min: " + min);
        }
        if ((a2 < a1) && (a2 < a3))
        {
            min = a2;
            System.out.println("Min: " + min);
        }
        if ((a3 < a1) && (a3 < a2))
        {
            min = a3;
            System.out.println("Min: " + min);
        }

    }
}
