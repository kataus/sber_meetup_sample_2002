package ru.itvitality.meetup.sample.loader;

import ru.itvitality.meetup.sample.model.Region;

public interface Loader {
    String loadData( Region region );

}
