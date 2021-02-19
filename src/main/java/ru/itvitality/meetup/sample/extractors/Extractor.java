package ru.itvitality.meetup.sample.extractors;

import ru.itvitality.meetup.sample.model.milk.CowMilk;

import java.util.List;

public interface Extractor {
    List<CowMilk> loadData();
}
