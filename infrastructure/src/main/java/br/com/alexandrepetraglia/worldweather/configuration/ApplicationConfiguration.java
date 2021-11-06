package br.com.alexandrepetraglia.worldweather.configuration;

import br.com.alexandrepetraglia.worldweather.core.port.FindWeatherPort;
import br.com.alexandrepetraglia.worldweather.core.usecase.FindWeatherUseCase;
import br.com.alexandrepetraglia.worldweather.core.usecase.impl.FindWeatherUseCaseImpl;
import br.com.alexandrepetraglia.worldweather.infrastructure.adapter.FindWeatherAdapter;
import br.com.alexandrepetraglia.worldweather.infrastructure.gateway.FindWeatherOpenWeatherGateway;
import br.com.alexandrepetraglia.worldweather.infrastructure.gateway.impl.FindWeatherOpenWeatherGatewayImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public FindWeatherUseCase createFindWeatherUseCase() {
        return new FindWeatherUseCaseImpl();
    }

    @Bean
    public FindWeatherPort createFindWeatherPort() {
        return new FindWeatherAdapter();
    }

    @Bean
    public FindWeatherOpenWeatherGateway createFindWeatherOpenWeatherGateway() {
        return new FindWeatherOpenWeatherGatewayImpl();
    }

}
