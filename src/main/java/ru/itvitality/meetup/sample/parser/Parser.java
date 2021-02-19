package ru.itvitality.meetup.sample.parser;

import ru.itvitality.meetup.sample.model.milk.CowMilk;
import ru.itvitality.meetup.sample.model.milk.Milk;

import java.util.List;

public interface Parser {
    List<Milk> parse( String rawData );
}
