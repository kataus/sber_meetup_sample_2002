package ru.itvitality.meetup.sample.model;

import lombok.Data;
import lombok.Getter;
import ru.itvitality.meetup.sample.model.load.LoadFormat;
import ru.itvitality.meetup.sample.model.load.LoadTransport;

@Getter
public enum Region {
    R_01("01", "Ант-Морпорк", "", LoadTransport.HTTPS, LoadFormat.JSON );

    Region( String code, String name, String url, LoadTransport loadTransport, LoadFormat loadFormat ) {
        this.code = code;
        this.name = name;
        this.url = url;
        this.loadTransport = loadTransport;
        this.loadFormat = loadFormat;
    }

    private String code;
    private String name;
    private String url;
    private LoadTransport loadTransport;
    private LoadFormat loadFormat;


}
