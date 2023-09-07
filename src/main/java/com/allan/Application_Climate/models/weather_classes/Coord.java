package com.allan.Application_Climate.models.weather_classes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Coord implements Serializable{

    @JsonProperty("lat")
    private Double lat;

    @JsonProperty("lon")
    private Double  lon;
}
