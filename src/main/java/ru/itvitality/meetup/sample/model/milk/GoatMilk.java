package ru.itvitality.meetup.sample.model.milk;

import ru.itvitality.meetup.sample.model.Animal;

import java.math.BigDecimal;
import java.util.Date;

public class GoatMilk implements AnimalMilk{
    @Override
    public BigDecimal fat() {
        return null;
    }

    @Override
    public Animal producer() {
        return null;
    }

    @Override
    public void process() {

    }

    @Override
    public Date bestBefore() {
        return null;
    }
}
