package br.com.alexandrepetraglia.worldweather.infrastructure.gateway;

import br.com.alexandrepetraglia.worldweather.infrastructure.gateway.response.OpenWeatherResponse;

public interface FindWeatherOpenWeatherGateway {

    public OpenWeatherResponse findWeather(final String cityName);

}
