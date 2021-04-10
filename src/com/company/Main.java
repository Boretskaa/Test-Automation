package com.company;

import java.util.Scanner;

class  Person {
    private String name;
    private int year;

    public Person() {
    }

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        int age = 2021 - getYear();
        System.out.print("Age: ");
        return age;
    }

    @Override
    public String toString()
    {
        return ("Name: " + this.getName() + " Year of birth: " + this.getYear()) + " Age: " + getAge();
    }

    static void changeName(Person p){
        p.setName("Alice");
    }

}
public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Vita",2002);
        System.out.println(person1.toString());
        Person person2 = new Person("Marta",1999);
        System.out.println(person2.toString());
        Person person3 = new Person("Tanya",1974);
        System.out.println(person3.toString());
        Person person4 = new Person("Roma",2001);
        System.out.println(person4.toString());
        Person person5 = new Person("Seva",2001);
        System.out.println(person5.toString());
        Person.changeName(person1);
        System.out.println(person1.toString());
    }
}
