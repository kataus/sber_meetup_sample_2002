package ru.itvitality.meetup.sample.manager;

import ru.itvitality.meetup.sample.extractors.Extractor;
import ru.itvitality.meetup.sample.loader.Loader;
import ru.itvitality.meetup.sample.model.Region;

public interface ExtractorsManager {
    Extractor getExtractor( Region region );
}
