package ru.itvitality.meetup.sample2.model2;

import java.math.BigDecimal;
import java.util.Date;

public interface Milk {
    boolean isSpecificConditionViolated();

    Date bestBefore();
    void drink();
    void eat();
}
