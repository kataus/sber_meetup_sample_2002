package ru.itvitality.meetup.sample3.model2;

import java.util.Date;

public class FarmGoatMilk implements AnimalMilk, FarmProduction {
    public void drink() {
    }


    public boolean isSpecificConditionViolated() {
        return true;
    }

    @Override
    public Date bestBefore() {
        return null;
    }
}
