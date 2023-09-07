package com.allan.Application_Climate.services;

import com.allan.Application_Climate.models.WeatherMain;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    final String API_KEY = "d89ea6b6cb81a57791e40ba92381098e";

    public WeatherMain findWeatherCity(String city){
        String api_url = "https://api.openweathermap.org/data/2.5/weather?units=metric&lang=pt_br&q=" + city + "&appid=" + API_KEY;
        WeatherMain weatherMain = new RestTemplate().getForObject(api_url, WeatherMain.class);
        return weatherMain;
    }
}
