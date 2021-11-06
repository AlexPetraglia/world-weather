package br.com.alexandrepetraglia.worldweather.infrastructure.util;

import br.com.alexandrepetraglia.worldweather.core.domain.Temperature;
import br.com.alexandrepetraglia.worldweather.core.domain.Weather;
import br.com.alexandrepetraglia.worldweather.infrastructure.gateway.response.OpenWeatherResponse;

public class Response2Domain {

    public static Weather toWeather(OpenWeatherResponse openWeatherResponse) {
        Temperature.Builder temperatureBuilder = new Temperature.Builder()
                .withTemperature(openWeatherResponse.getMain().getTemp())
                .withMinTemperature(openWeatherResponse.getMain().getTempMin())
                .withMaxTemperature(openWeatherResponse.getMain().getTempMax())
                .withFeelsLike(openWeatherResponse.getMain().getFeelsLike())
                .withPressure(openWeatherResponse.getMain().getPressure())
                .withHumidity(openWeatherResponse.getMain().getHumidity());

        Weather.Builder weatherBuilder = new Weather.Builder()
                .withWeather(openWeatherResponse.getWeather().get(0).getMain())
                .withDescription(openWeatherResponse.getWeather().get(0).getDescription())
                .withWeatherDate(openWeatherResponse.getDt())
                .withCityId(openWeatherResponse.getId())
                .withCityName(openWeatherResponse.getName())
                .withCoord(openWeatherResponse.getCoord().getLat(), openWeatherResponse.getCoord().getLon())
                .withTemperature(temperatureBuilder.build())
                .withWind(openWeatherResponse.getWind().getSpeed(), openWeatherResponse.getWind().getDeg());

        return weatherBuilder.build();
    }

}
