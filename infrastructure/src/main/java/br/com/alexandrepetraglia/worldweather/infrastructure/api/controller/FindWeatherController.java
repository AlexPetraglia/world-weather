package br.com.alexandrepetraglia.worldweather.infrastructure.api.controller;

import br.com.alexandrepetraglia.worldweather.core.domain.Weather;
import br.com.alexandrepetraglia.worldweather.core.usecase.FindWeatherUseCase;
import br.com.alexandrepetraglia.worldweather.infrastructure.api.response.WeatherResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/weather")
public class FindWeatherController {

    FindWeatherUseCase findWeatherUseCase;

    public FindWeatherController(FindWeatherUseCase findWeatherUseCase) {
        this.findWeatherUseCase = findWeatherUseCase;
    }

    @GetMapping("/")
    public Weather findWeather(@RequestParam("city") final String cityName) {
        System.out.println("Buscando clima para a cidade: " + cityName);
        Weather weather = findWeatherUseCase.execute(cityName);

        return weather;
    }

}
