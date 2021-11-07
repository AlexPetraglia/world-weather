package br.com.alexandrepetraglia.worldweather.infrastructure.gateway.impl;

import br.com.alexandrepetraglia.worldweather.infrastructure.gateway.FindWeatherOpenWeatherGateway;
import br.com.alexandrepetraglia.worldweather.infrastructure.gateway.response.OpenWeatherResponse;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;

public class FindWeatherOpenWeatherGatewayImpl implements FindWeatherOpenWeatherGateway {

    UncheckedObjectMapper uncheckedObjectMapper = new UncheckedObjectMapper();

    //URI = https://api.openweathermap.org/data/2.5/weather?q=london&appid=9c5e43c94aacb7b0da04ec69fd50e95f
    private final String apiHost = "https://api.openweathermap.org/data/2.5/weather";
    private final String apiKey = "";

    public OpenWeatherResponse findWeather(final String cityName) {
        try {
            final String urlParameters = String.format("?q=%s&appid=%s", cityName, apiKey);
            final String url = apiHost + urlParameters;

            HttpRequest httpRequest = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();

            OpenWeatherResponse openWeatherResponse = HttpClient.newHttpClient()
                    .sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenApply(uncheckedObjectMapper::readValue)
                    .get();

            return openWeatherResponse;
        } catch (URISyntaxException uriSyntaxException) {
            throw new RuntimeException("Erro ao construir URI integração Sinapse.", uriSyntaxException);
        } catch (InterruptedException | ExecutionException exception) {
            throw new RuntimeException("Erro de integração com Sinapse.", exception);
        }
    }

    private class UncheckedObjectMapper extends com.fasterxml.jackson.databind.ObjectMapper {
        OpenWeatherResponse readValue(String content) {
            try {
                return this.readValue(content, new TypeReference<OpenWeatherResponse>() {
                });
            } catch (IOException ioe) {
                throw new CompletionException(ioe);
            }
        }
    }
}
