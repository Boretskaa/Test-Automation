package com.company;

public abstract class NonFlyingBird extends Bird
{
    public boolean swim;

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public NonFlyingBird(String feathers, boolean layEggs, boolean swim) {
        super(feathers, layEggs);
        this.swim = swim;
    }

    public abstract void Show();

}