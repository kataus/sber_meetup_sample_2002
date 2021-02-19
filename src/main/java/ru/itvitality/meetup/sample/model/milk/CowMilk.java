package ru.itvitality.meetup.sample.model.milk;

import ru.itvitality.meetup.sample.model.Animal;

import java.math.BigDecimal;

public class CowMilk implements AnimalMilk {
    public void process(){

    }

    @Override
    public BigDecimal fat() {
        return null;
    }

    @Override
    public Animal producer() {
        return null;
    }
}
