package com.company;

public class Main {

    public static void main(String[] args) {
            Bird bird1 = new Eagle("Long", false, "Brown", "Steppe");
            bird1.Show();
            bird1.fly();
            Bird bird2 = new Eagle("Long", false, "Brown", "Longtail");
            bird2.Show();
            bird2.fly();
            Bird bird3 = new Swallow("Short", true, "White","Ukraine");
            bird3.Show();
            bird3.fly();
            Bird bird4 = new Penguin("Short", true, true, "USA");
            bird4.Show();;
            bird4.fly();
            Bird bird5 = new Chicken("Short", true, false , "red");
            bird5.Show();
            bird5.fly();

        }
    }

