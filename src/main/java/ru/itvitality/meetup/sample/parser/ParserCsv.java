package ru.itvitality.meetup.sample.parser;

import ru.itvitality.meetup.sample.model.milk.CowMilk;
import ru.itvitality.meetup.sample.model.milk.Milk;

import java.util.ArrayList;
import java.util.List;

public class ParserCsv implements Parser{
    @Override
    public List<Milk> parse( String rawData){
        List<Milk> result = new ArrayList<>();
        /*  десериализация response в result с помощью Jackson (или GSON, на ваш вкус) */
        return result;
    }
}
