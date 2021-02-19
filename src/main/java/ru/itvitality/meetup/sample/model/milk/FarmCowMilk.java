package ru.itvitality.meetup.sample.model.milk;

import ru.itvitality.meetup.sample.model.Animal;

import java.math.BigDecimal;
import java.util.Date;

public class FarmCowMilk implements AnimalMilk, CraftProduction{

    @Override
    public void process(){
        if (isSoured()){
            throw new RuntimeException("Молоко скисло");
        }
        //..
    }

    @Override
    public Date bestBefore() {
        return null;
    }

    @Override
    public boolean isSoured() {
        return false;
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
