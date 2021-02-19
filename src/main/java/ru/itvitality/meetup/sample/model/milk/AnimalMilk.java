package ru.itvitality.meetup.sample.model.milk;

import ru.itvitality.meetup.sample.model.Animal;

import java.math.BigDecimal;

public interface AnimalMilk extends Milk {
    BigDecimal fat();
    Animal producer();
}
