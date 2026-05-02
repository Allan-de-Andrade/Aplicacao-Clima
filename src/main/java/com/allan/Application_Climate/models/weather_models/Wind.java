package com.allan.Application_Climate.models.weather_models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {
    @JsonProperty("speed")
    private Double windSpeed;

    @JsonProperty("deg")
    private Double degressWind;

    @JsonProperty("gust")
    private Double gustWind;

    public Double getWindSpeed() {
        return this.windSpeed;
    }

    public Double getDegressWind() {
        return this.degressWind;
    }

    public Double getGustWind() {
        return this.gustWind;
    }

    @JsonProperty("speed")
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("deg")
    public void setDegressWind(Double degressWind) {
        this.degressWind = degressWind;
    }

    @JsonProperty("gust")
    public void setGustWind(Double gustWind) {
        this.gustWind = gustWind;
    }
}
