package com.allan.Application_Climate.models.weather_models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Wind {
    @JsonProperty("speed")
    private Double windSpeed;

    @JsonProperty("deg")
    private Double degressWind;

    @JsonProperty("gust")
    private Double gustWind;
}
