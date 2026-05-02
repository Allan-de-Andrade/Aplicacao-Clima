package com.allan.Application_Climate.models.weather_models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherMain {
    @JsonProperty("coord")
    private Coord coord;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("weather")
    private List<Weather> weatherList;

    @JsonProperty("wind")
    private Wind wind;

    @JsonProperty("name")
    private String city;

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public Coord getCoord() {
        return this.coord;
    }

    public Main getMain() {
        return this.main;
    }

    public Wind getWind() {
        return this.wind;
    }

    public String getCity() {
        return this.city;
    }

    @JsonProperty("coord")
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    @JsonProperty("main")
    public void setMain(Main main) {
        this.main = main;
    }

    @JsonProperty("weather")
    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonProperty("name")
    public void setCity(String city) {
        this.city = city;
    }
}
