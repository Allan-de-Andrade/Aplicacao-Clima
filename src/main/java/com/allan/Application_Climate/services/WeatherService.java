package com.allan.Application_Climate.services;

import com.allan.Application_Climate.models.weather_models.WeatherMain;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

        @Value("${api_key}")
         String API_KEY;

    public WeatherMain findWeatherCity(String city){
        try{
            String api_url = "https://api.openweathermap.org/data/2.5/weather?units=metric&q=" + city + "&appid=" + API_KEY;
            WeatherMain weatherMain = new RestTemplate().getForObject(api_url, WeatherMain.class);
            return weatherMain;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public WeatherMain findWeatherWithCoordenates(Double longitude,Double latitude){

        try {
            String api_url = "https://api.openweathermap.org/data/2.5/weather?units=metric&lat=" + latitude + "&lon="+ longitude + "&appid=" + API_KEY;
            WeatherMain weatherMain = new RestTemplate().getForObject(api_url,WeatherMain.class);
            return weatherMain;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
