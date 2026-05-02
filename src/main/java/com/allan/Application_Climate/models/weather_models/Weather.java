package com.allan.Application_Climate.models.weather_models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
    @JsonProperty("main")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("icon")
    private String icon;

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIcon() {
        return this.icon;
    }

    @JsonProperty("main")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }
}
