package com.allan.Application_Climate.models.weather_models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Coord implements Serializable {

    @JsonProperty("lat")
    private Double lat;

    @JsonProperty("lon")
    private Double lon;

    public Double getLat() {
        return this.lat;
    }

    public Double getLon() {
        return this.lon;
    }

    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public void setLon(Double lon) {
        this.lon = lon;
    }
}
