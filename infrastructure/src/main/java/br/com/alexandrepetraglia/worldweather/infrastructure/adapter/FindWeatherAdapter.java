package br.com.alexandrepetraglia.worldweather.infrastructure.adapter;

import br.com.alexandrepetraglia.worldweather.core.domain.Weather;
import br.com.alexandrepetraglia.worldweather.core.port.FindWeatherPort;
import br.com.alexandrepetraglia.worldweather.infrastructure.gateway.FindWeatherOpenWeatherGateway;
import br.com.alexandrepetraglia.worldweather.infrastructure.gateway.response.OpenWeatherResponse;
import br.com.alexandrepetraglia.worldweather.infrastructure.util.Response2Domain;

import javax.inject.Inject;

public class FindWeatherAdapter implements FindWeatherPort {

    @Inject
    FindWeatherOpenWeatherGateway findWeatherOpenWeatherGateway;

    @Override
    public Weather execute(String cityName) {
        OpenWeatherResponse openWeatherResponse = findWeatherOpenWeatherGateway.findWeather(cityName);
        return Response2Domain.toWeather(openWeatherResponse);
    }
}
