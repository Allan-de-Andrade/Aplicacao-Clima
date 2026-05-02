package com.allan.Application_Climate.models.weather_models;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    public Double getTemperature() {
        return this.temperature;
    }

    public Double getTemperatureMax() {
        return this.temperatureMax;
    }

    public Double getTemperatureMin() {
        return this.temperatureMin;
    }

    public Double getTemperatureFeels() {
        return this.temperatureFeels;
    }

    public Double getPressure() {
        return this.pressure;
    }

    public Double getHumidity() {
        return this.humidity;
    }

    @JsonProperty("temp")
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("temp_max")
    public void setTemperatureMax(Double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    @JsonProperty("temp_min")
    public void setTemperatureMin(Double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    @JsonProperty("feels_like")
    public void setTemperatureFeels(Double temperatureFeels) {
        this.temperatureFeels = temperatureFeels;
    }

    @JsonProperty("pressure")
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("humidity")
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }
}
