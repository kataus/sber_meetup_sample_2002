package ru.itvitality.meetup.sample.loader;

import lombok.AccessLevel;
import lombok.Getter;
import ru.itvitality.meetup.sample.model.Region;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LoaderHttps implements Loader {

    @Override
    public String loadData( Region region ) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri( URI.create( region.getUrl() ) )
                .build();
        /* Настройка ssl */
        HttpResponse<String> response =
                null;
        try {
            response = client.send( request, HttpResponse.BodyHandlers.ofString() );
        } catch ( Exception e ) {
            throw new RuntimeException();
        }
        return response.body();
    }
}
