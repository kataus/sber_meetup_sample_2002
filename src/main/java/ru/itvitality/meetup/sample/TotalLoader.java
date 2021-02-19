package ru.itvitality.meetup.sample;

import ru.itvitality.meetup.sample.manager.ExtractorsManager;
import ru.itvitality.meetup.sample.manager.ExtractorsManagerFactory;
import ru.itvitality.meetup.sample.model.milk.CowMilk;
import ru.itvitality.meetup.sample.model.Region;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TotalLoader {
    public void loadAll() {
        List<CowMilk> milks = new ArrayList<>();
        ExtractorsManager extractorsManager =
                ExtractorsManagerFactory
                        .buildExctractorManager( "extractors.csv" );
        for ( Region region : Region.values() ) {
            Optional.ofNullable( extractorsManager.getExtractor( region ) )
                    .ifPresent( extractor ->
                            milks.addAll( extractor.loadData() ) );
        }
    }
}
