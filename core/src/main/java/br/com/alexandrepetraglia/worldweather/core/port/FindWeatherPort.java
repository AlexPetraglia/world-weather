package br.com.alexandrepetraglia.worldweather.core.port;

import br.com.alexandrepetraglia.worldweather.core.domain.Weather;

public interface FindWeatherPort {

    public Weather execute(final String cityName);

}
