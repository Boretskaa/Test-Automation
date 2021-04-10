package com.company;

import jdk.dynalink.linker.ConversionComparator;

import java.util.*;

class Pillow
{
    private int id;
    private int age;
    private double length;
    private boolean convenient;

    private static Map<Integer, Pillow> allPillows;
    private static int countId = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean getConvenient() {
        return convenient;
    }

    public void setConvenient(boolean convenient) {
        this.convenient = convenient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pillow pillow = (Pillow) o;
        return id == pillow.id && age == pillow.age && length == pillow.length && convenient == pillow.convenient;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, length, convenient);
    }

    public Pillow(int id, int age, double length, boolean convenient) {
        if (allPillows == null){
            allPillows = new HashMap<>();
        }

        this.id = id;
        this.age = age;
        this.length = length;
        this.convenient = convenient;

        if (!hasPillow()){
            countId++;
            this.id = countId;
            allPillows.put(id, this);
        }
    }

    private boolean hasPillow(){
        for (Pillow pillow : allPillows.values()){
            if (pillow.equals(this) && pillow.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pillow{" +
                "id=" + id +
                ", age=" + age +
                ", length=" + length +
                ", width=" + convenient +
                '}';
    }

    public static List<Pillow> getAllPillows(){
        return new ArrayList<>(allPillows.values());
    }

    public static List<Pillow> getAllPillows(boolean convenient){
        List<Pillow> listAllPillows = new ArrayList<>();
        for (Pillow pillow : allPillows.values()){
            if (pillow.convenient == convenient){
                listAllPillows.add(pillow);
            }
        }
        return listAllPillows;
    }

    public static int getHowManyPillows(){
        return allPillows.size();
    }

    public static int getHowManyPillows(boolean convenient){
        return getAllPillows(convenient).size();
    }

    public static int getAllAgePillows(){
        int countAge = 0;
        for (Pillow pillow : allPillows.values()){
            countAge += pillow.age;
        }
        return countAge;
    }

    public static int getAllAgePillows(boolean convenient){
        int countAge = 0;
        for (Pillow pillow : getAllPillows(convenient)){
            countAge += pillow.age;
        }
        return countAge;
    }


}

public class Main {

    public static void main(String[] args) {
        new Pillow(001, 1, 1.25,true);
        new Pillow(002, 2, 1.5,false);
        new Pillow(003, 2, 1.75,true);


        System.out.println("All pillows:");
        Pillow.getAllPillows().forEach(System.out::println);
        System.out.println("All pillows : convenient");
        Pillow.getAllPillows(true).forEach(System.out::println);
        System.out.println("All pillows : no convenient");
        Pillow.getAllPillows(false).forEach(System.out::println);
        System.out.println("================================================");
        System.out.println("       Total pillows: " + Pillow.getHowManyPillows());
        System.out.println("  Total pillows convenient: " + Pillow.getHowManyPillows(true));
        System.out.println("Total pillows no convenient: " + Pillow.getHowManyPillows(false));
        System.out.println("================================================");
        System.out.println("       The total age of all pillows: " + Pillow.getAllAgePillows());
        System.out.println("  The total age of all pillows convenient: " + Pillow.getAllAgePillows(true));
        System.out.println("общий возраст всех пользователей FEMALE: " + Pillow.getAllAgePillows(false));
        System.out.println("================================================");

    }
}
