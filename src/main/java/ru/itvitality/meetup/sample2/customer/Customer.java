package ru.itvitality.meetup.sample2.customer;

import ru.itvitality.meetup.sample2.model.Milk;

import java.util.Date;

public class Customer {
    public void drinkMilk( Milk milk ) {
        if ( milk.bestBefore().after( new Date() ) ) {
            milk.drink();
        } else {
            // выкинуть
        }
    }
}
