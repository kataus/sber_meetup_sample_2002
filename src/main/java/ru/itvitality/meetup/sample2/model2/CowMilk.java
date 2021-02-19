package ru.itvitality.meetup.sample2.model2;

import java.util.Date;

public class CowMilk implements Milk {
    @Override
    public void drink() {
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isSpecificConditionViolated() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Date bestBefore() {
        return null;
    }
}
