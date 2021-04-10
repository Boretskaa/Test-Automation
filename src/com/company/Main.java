package com.company;
import java.util.Scanner;


interface IDivNumbers {
    double div(double x, double y);
}

public class Main {

    public static void main(String[] args) {
        IDivNumbers ref;
        ref = (x, y) -> {
            try {
                if (y==0)
                    throw new ArithmeticException("Exception: divide by zero.");
                return x/y;
            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                return 0.0;
            }
        };

        double res = ref.div(5, 0);
        System.out.println("res = " + res);

    }
}





