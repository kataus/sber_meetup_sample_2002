package ru.itvitality.meetup.sample2.model;

import ru.itvitality.meetup.sample2.exception.FillBadException;

import java.util.Date;

public class FarmMilk {
    public Date bestBefore(){
        // do smth
        return null;
    }

    public void drink(){
        if (bestBefore().before( new Date() ) && isSpecificConditionViolated() ){
            throw new FillBadException();
        }
        // do smth else
    }

    public void checkSpecificCondition(){
        // do smth else
    }

    public boolean isSpecificConditionViolated(){
        return true;
    }
}
