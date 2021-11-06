package br.com.alexandrepetraglia.worldweather.core.usecase.impl;

import br.com.alexandrepetraglia.worldweather.core.domain.Weather;
import br.com.alexandrepetraglia.worldweather.core.port.FindWeatherPort;
import br.com.alexandrepetraglia.worldweather.core.usecase.FindWeatherUseCase;

import javax.inject.Inject;


public class FindWeatherUseCaseImpl implements FindWeatherUseCase {

    @Inject
    FindWeatherPort findWeatherPort;

    @Override
    public Weather execute(String cityName) {

        return findWeatherPort.execute(cityName);
    }

}
