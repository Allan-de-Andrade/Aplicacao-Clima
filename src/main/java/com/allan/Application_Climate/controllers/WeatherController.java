package com.allan.Application_Climate.controllers;

import com.allan.Application_Climate.models.WeatherMain;
import com.allan.Application_Climate.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/climate")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/find")
    public ModelAndView findWeatherCity(@RequestParam(name = "city")String city){
        ModelAndView page = new ModelAndView("MainPage");
        WeatherMain weatherMain = weatherService.findWeatherCity(city);
        page.addObject("weather",weatherMain);

        return page;
    }
}
