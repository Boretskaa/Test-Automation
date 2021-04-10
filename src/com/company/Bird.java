package com.company;

public abstract class Bird
{
    public String feathers;
    public boolean layEggs;

    protected Bird() {
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public Bird(String feathers) {
        this.feathers = feathers;
    }

    public Bird(String feathers, boolean layEggs) {
        this.layEggs = layEggs;
    }


    public abstract void fly();
    public abstract void Show();


}
