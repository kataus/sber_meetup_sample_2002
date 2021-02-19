package ru.itvitality.meetup.sample.bigloaders;

import ru.itvitality.meetup.sample.model.milk.CowMilk;
import ru.itvitality.meetup.sample.model.Region;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class DataLoaderXML_FTP {
    public List<CowMilk> getData( Region region ) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri( URI.create(region.getUrl()))
                .build();
        /* Настройка ssl */
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
        List<CowMilk> result = new ArrayList<>();
        /*  десериализация response в result с помощью Jackson (или GSON, на ваш вкус) */
        return result;
    }
}
