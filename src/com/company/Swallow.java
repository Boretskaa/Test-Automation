package com.company;

public class Swallow extends  FlyingBird
{
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Swallow(String feathers, boolean layEggs, String colorWings, String country) {
        super(feathers, layEggs, colorWings);
        this.country = country;
    }

    @java.lang.Override
    public void fly()
    {
        System.out.println("Can fly");
    }


    @Override
    public void Show() {
        System.out.println("feathers: " + feathers + "; layEggs: " + layEggs + "; colorWings: " + colorWings + "; country: " + country);
    }
}