package com.company;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a);
        } else {
            System.out.print("Input a again: ");
            a = scanner.nextInt();
        }

        System.out.print("Input b: ");
        int b= scanner.nextInt();
        if (b > 0) {
            System.out.println(b);
        } else {
            System.out.print("Input b again: ");
            b = scanner.nextInt();
        }

        System.out.print("Input c: ");
        int c = scanner.nextInt();
        if (c > 0) {
            System.out.println(c);
        } else {
            System.out.print("Input c again: ");
            c = scanner.nextInt();
        }

        System.out.print("Input x: ");
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println(x);
        } else {
            System.out.print("Input x again: ");
            x = scanner.nextInt();
        }

        System.out.print("Input y: ");
        int y = scanner.nextInt();
        if (y > 0) {
            System.out.println(y);
        } else {
            System.out.print("Input y again: ");
            y = scanner.nextInt();
        }

        if (((x>=a) && (y>=b)) || ((x>=a) && (y>=c)) || ((x>=c) && (y>=b)))
        {
            System.out.print("The brick will fit");
        }
        else
        {
            System.out.print("The brick will not fit");
        }

    }
}
