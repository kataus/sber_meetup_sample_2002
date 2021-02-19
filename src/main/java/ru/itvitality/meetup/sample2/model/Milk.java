package ru.itvitality.meetup.sample2.model;

import ru.itvitality.meetup.sample2.exception.FillBadException;

import java.util.Date;

public class Milk {
    public Date bestBefore(){
        // do smth
        return null;
    }

    public void drink(){
        if (bestBefore().before( new Date() )){
            throw new FillBadException();
        }
        // do smth else
    }
}
