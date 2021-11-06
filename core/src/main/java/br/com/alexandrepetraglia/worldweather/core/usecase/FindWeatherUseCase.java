package br.com.alexandrepetraglia.worldweather.core.usecase;

import br.com.alexandrepetraglia.worldweather.core.domain.Weather;

public interface FindWeatherUseCase {

    public Weather execute(final String cityName);

}
