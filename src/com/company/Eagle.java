package com.company;

public class Eagle extends FlyingBird
{
    public String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Eagle(String feathers, boolean layEggs, String colorWings, String kind) {
        super(feathers, layEggs, colorWings);
        this.kind = kind;
    }


    @java.lang.Override
    public void fly()
    {
        System.out.println("Can fly");
    }



    @Override
    public void Show() {
        System.out.println("Eagle = feathers: " + feathers + "; layEggs: " + layEggs + "; colorWings: " + colorWings + "; kind: " + kind);
    }


}