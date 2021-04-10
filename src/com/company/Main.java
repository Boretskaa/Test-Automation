package com.company;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //обчислити площу і периметр
        System.out.print("Input radius: ");
        double r = sc.nextDouble();
	    double square;
	    double perimeter;
	    square = Math.PI*(r*r);
        System.out.println("Square: " + square);
        perimeter = 2*Math.PI*r;
        System.out.println("Perimeter: " + perimeter);

        //як звати, де живеш, вивести всю інформацію
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("Where are you live, "+ name + "?");
        String address = in.nextLine();
        System.out.println("Your name is "+ name + ". You live in " + address + ".");

        //
        double c1, c2, c3;
        //ціна за одну хвилину
        System.out.println("Enter the cost of a call in country 1: ");
        double country1 = sc.nextDouble();
        System.out.println("Enter the cost of a call in country 2: ");
        double country2 = sc.nextDouble();
        System.out.println("Enter the cost of a call in country 3: ");
        double country3 = sc.nextDouble();
        System.out.println("Enter the duration of 1 call: ");
        double t1 = sc.nextDouble();
        System.out.println("Enter the duration of 2 call: ");
        double t2 = sc.nextDouble();
        System.out.println("Enter the duration of 3 call: ");
        double t3 = sc.nextDouble();
        System.out.println("Enter the duration of 3 call: ");
        c1 = t1 * country1;
        System.out.println("The cost of a call to country 1: " + c1);
        c2 = t2 * country2;
        System.out.println("The cost of a call to country 2: " + c2);
        c3 = t3 * country3;
        System.out.println("The cost of a call to country 1: " + c3);
        double c;
        c = c1+c2+c3;
        System.out.println("The cost of all calls: " + c);






    }
}
