package com.company;

public class Penguin extends NonFlyingBird
{
    private String common;

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public Penguin(String feathers, boolean layEggs, boolean swim, String common) {
        super(feathers, layEggs, swim);
        this.common = common;
    }


    @java.lang.Override
    public void fly()
    {
        System.out.println("Can't fly");
    }

    @Override
    public void Show() {
        System.out.println("feathers: " + feathers + "; layEggs: " + layEggs + "; swim: " + swim + "; common: " + common);
    }
}