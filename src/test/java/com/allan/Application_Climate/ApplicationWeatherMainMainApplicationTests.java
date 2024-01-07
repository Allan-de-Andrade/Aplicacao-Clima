package com.allan.Application_Climate;

import com.allan.Application_Climate.models.weather_models.WeatherMain;
import com.allan.Application_Climate.models.weather_models.Main;
import com.allan.Application_Climate.services.WeatherService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationWeatherMainMainApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	WeatherService weatherService;
	@Test
	public void shouldReturnWeatherMainWithCorrectDataUsingCoordinates(){
		WeatherMain weatherMain = new WeatherMain();
		Main main = new Main();
		main.setTemperature(18.76);

		weatherMain.setMain(main);
		weatherMain.setCity("Caruaru");

		WeatherMain weatherMain1 = weatherService.findWeatherWithCoordenates(-35.9636,-8.2833);
		Assertions.assertEquals(weatherMain.getCity(),weatherMain1.getCity());
		Assertions.assertEquals(weatherMain.getMain().getTemperature(),weatherMain1.getMain().getTemperature());
	}
}
