package ru.itvitality.meetup.sample.model.v1;

import ru.itvitality.meetup.sample.model.Animal;
import ru.itvitality.meetup.sample.model.milk.AnimalMilk;
import ru.itvitality.meetup.sample.model.milk.CraftProduction;

import java.math.BigDecimal;
import java.util.Date;

public class FarmCowMilk {
    public void process() {
        if ( isSoured() ) {
            throw new RuntimeException( "Молоко скисло" );
        }
        //..
    }

    private boolean isSoured() {
        return false;
    }
}
