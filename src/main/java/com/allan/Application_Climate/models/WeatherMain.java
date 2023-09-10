package com.allan.Application_Climate.models;

import com.allan.Application_Climate.models.weather_classes.Coord;
import com.allan.Application_Climate.models.weather_classes.Main;
import com.allan.Application_Climate.models.weather_classes.Weather;
import com.allan.Application_Climate.models.weather_classes.Wind;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
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
}
