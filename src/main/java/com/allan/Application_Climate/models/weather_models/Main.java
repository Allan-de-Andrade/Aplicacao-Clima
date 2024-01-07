package com.allan.Application_Climate.models.weather_models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Main {

    @JsonProperty("temp")
    private Double temperature;

    @JsonProperty("temp_max")
    private Double temperatureMax;

    @JsonProperty("temp_min")
    private Double temperatureMin;

    @JsonProperty("feels_like")
    private Double temperatureFeels;

    @JsonProperty("pressure")
    private Double pressure;

    @JsonProperty("humidity")
    private Double humidity;
}
