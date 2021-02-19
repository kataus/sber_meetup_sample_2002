package ru.itvitality.meetup.sample2.model2;

import java.util.Date;

public class FarmGoatMilk implements Milk {
    public void drink() {
    }

    @Override
    public void eat() {

    }

    public boolean isSpecificConditionViolated() {
        return true;
    }

    @Override
    public Date bestBefore() {
        return null;
    }
}
