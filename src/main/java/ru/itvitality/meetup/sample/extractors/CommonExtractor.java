package ru.itvitality.meetup.sample.extractors;

import ru.itvitality.meetup.sample.loader.Loader;
import ru.itvitality.meetup.sample.model.milk.CowMilk;
import ru.itvitality.meetup.sample.model.Region;
import ru.itvitality.meetup.sample.parser.Parser;

import java.util.List;

public class CommonExtractor implements Extractor {
    private final Loader loader;
    private final Parser parser;
    private final Region region;

    public CommonExtractor( Loader loader,
                            Parser parser,
                            Region region ) {
        this.loader = loader;
        this.parser = parser;
        this.region = region;
    }

    @Override
    public List<CowMilk> loadData(){
        return parser.parse( loader.loadData( region ));
    }

}
