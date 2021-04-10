package com.company;

public abstract class FlyingBird extends Bird
{
    public String colorWings;

    public FlyingBird() {
    }

    public String getColorWings() {
        return colorWings;
    }

    public void setColorWings(String colorWings) {
        this.colorWings = colorWings;
    }

    public FlyingBird(String feathers,boolean layEggs, String colorWings) {
        super(feathers, layEggs);
        this.colorWings = colorWings;
    }

    public abstract void Show();

}
