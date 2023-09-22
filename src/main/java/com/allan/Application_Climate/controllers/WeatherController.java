package com.allan.Application_Climate.controllers;

import com.allan.Application_Climate.models.weather_models.WeatherMain;
import com.allan.Application_Climate.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/climate")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("home")
    public String home(){
        return "WeatherPage";
    }

    @GetMapping("/find")
    public ModelAndView findWeatherWithCity(@RequestParam(name = "city")String city){
        ModelAndView page = new ModelAndView("WeatherPage");
        WeatherMain  weatherMain = weatherService.findWeatherCity(city);
        Optional verifyIsPresent = Optional.of(weatherMain);

        if(verifyIsPresent.isPresent()) {
            page.addObject("weather",weatherMain);
            return page;
        }

        else {
            page.addObject("error", "Could not find the climate of this city,try again");
            return page;
        }
    }

    @GetMapping("/findwithcoordenates")
    public ModelAndView findWeatherWithCoordentes(@RequestParam(name = "lat")Double latitude,@RequestParam(name="lon") Double longitude){
        ModelAndView page = new ModelAndView("WeatherPage");
        WeatherMain  weatherMain = weatherService.findWeatherWithCoordenates(longitude,latitude);
        Optional verifyIsPresent = Optional.of(weatherMain);

        if(verifyIsPresent.isPresent()) {
            page.addObject("weather",weatherMain);
            return page;
        }
        else {
            page.addObject("error", "Could not find the climate with this coordenates,try again");
            return page;
        }
    }
}
