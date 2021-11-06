package br.com.alexandrepetraglia.worldweather.core.domain;

import java.sql.Timestamp;

public class Weather {

    private Integer cityId;
    private String cityName;
    private String weather;
    private String description;
    private Integer weatherDate;
    private Coord coord;
    private Temperature temperature;
    private Wind wind;

    public static class Builder {
        private Integer cityId;
        private String cityName;
        private String weather;
        private String description;
        private Integer weatherDate;
        private Coord coord;
        private Temperature temperature;
        private Wind wind;

        public Builder withCityId(final Integer cityId) {
            this.cityId = cityId;
            return this;
        }

        public Builder withCityName(final String cityName) {
            this.cityName = cityName;
            return this;
        }

        public Builder withWeather(final String weather) {
            this.weather = weather;
            return this;
        }

        public Builder withDescription(final String description) {
            this.description = description;
            return this;
        }

        public Builder withWeatherDate(final Integer weatherDate) {
            this.weatherDate = weatherDate;
            return this;
        }

        public Builder withCoord(final Double latitude, final Double longitude) {
            this.coord = new Coord(latitude, longitude);
            return this;
        }

        public Builder withTemperature(final Temperature temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder withWind(final Double speed, final Integer directionDegree) {
            this.wind = new Wind(speed, directionDegree);
            return this;
        }

        public Weather build() {
            return new Weather(this);
        }

    }

    private Weather(Builder builder) {
        this.cityId = builder.cityId;
        this.cityName = builder.cityName;
        this.weather = builder.weather;
        this.description = builder.description;
        this.weatherDate = builder.weatherDate;
        this.coord = builder.coord;
        this.wind = builder.wind;
        this.temperature = builder.temperature;
    }

    public Integer getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public String getWeather() {
        return weather;
    }

    public String getDescription() {
        return description;
    }

    public Integer getWeatherDate() {
        return weatherDate;
    }

    public Coord getCoord() {
        return coord;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public Wind getWind() {
        return wind;
    }
}
