package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //З'ясувати, чи входить цифра 3 в запис числа n2
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        int  b;
        boolean l = false;
        int n1;
        n1 = n*n;
        String s = String.valueOf(n1);
        System.out.println("n^2: " + s);
        int index1 = s.indexOf('3');
        if (index1 == -1)
        {
            System.out.println("No!");
        }
        else
        {
            System.out.println("Yes!");
        }

        //поміняти порядок цифр числа n на зворотний
        String s1 = String.valueOf(n);
        String result = s1.substring(s1.length()-1);

        for (int i = s1.length() - 2; i >= 0; i--)
        {
            result = result.concat(s1.substring(i, i+1));
        }
        System.out.println("The reverse order " + result);

        //переставте першу і останню цифри числа n
        String s2;
        s2 = s1.substring(s1.length()-1)+s1.substring(1, s1.length()-1)+s1.substring(0, 1);
        System.out.println("Permutation of the first and last digit of the number " + s2);

        //приписати по одиниці в початок і кінець запису числа n

        int i = 1;
        String i1 = String.valueOf(i);
        System.out.println("1 from the beginning and end " + i1 + s1 + i1);
    }
}
