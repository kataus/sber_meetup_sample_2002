package ru.itvitality.meetup.sample2.model2;

import java.util.Date;

public class BirdMilk implements Milk {


    public void eat() {
    }

    @Override
    public boolean isSpecificConditionViolated() {
        return false;
    }

    @Override
    public Date bestBefore() {
        return null;
    }

    @Override
    public void drink() {

    }
}
