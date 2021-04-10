package com.company;

public class Chicken extends NonFlyingBird
{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chicken(String feathers, boolean layEggs, boolean swim, String color) {
        super(feathers, layEggs, swim);
        this.color = color;
    }


    @java.lang.Override
    public void fly()
    {
        System.out.println("Can't fly");
    }

    @Override
    public void Show() {
        System.out.println("feathers: " + feathers + "; layEggs: " + layEggs + "; swim: " + swim + "; color: " + color);
    }
}