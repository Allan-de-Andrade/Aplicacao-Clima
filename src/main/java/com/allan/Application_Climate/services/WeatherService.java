package com.allan.Application_Climate.services;

import com.allan.Application_Climate.models.WeatherMain;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class WeatherService {

    final String API_KEY = "d89ea6b6cb81a57791e40ba92381098e";

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
            String api_url = "https://api.openweathermap.org/data/2.5/weather?units=metric&lat=" + latitude + "&lon=" + longitude + "&appid=" + API_KEY;
            WeatherMain weatherMain = new RestTemplate().getForObject(api_url, WeatherMain.class);
            return weatherMain;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
