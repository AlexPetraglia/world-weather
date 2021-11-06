package br.com.alexandrepetraglia.worldweather.core.domain;

public class Temperature {

    private Double temperature;
    private Double feelsLike;
    private Double maxTemperature;
    private Double minTemperature;
    private Integer pressure;
    private Integer humidity;

    public final static class Builder {
        private Double temperature;
        private Double feelsLike;
        private Double maxTemperature;
        private Double minTemperature;
        private Integer pressure;
        private Integer humidity;

        public Builder withTemperature(final Double temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder withMinTemperature(final Double minTemperature) {
            this.minTemperature = minTemperature;
            return this;
        }

        public Builder withMaxTemperature(final Double maxTemperature) {
            this.maxTemperature = maxTemperature;
            return this;
        }

        public Builder withFeelsLike(final Double feelsLike){
            this.feelsLike = feelsLike;
            return this;
        }

        public Builder withPressure(final Integer pressure) {
            this.pressure = pressure;
            return this;
        }

        public Builder withHumidity(final Integer humidity) {
            this.humidity = humidity;
            return this;
        }

        public Temperature build() {
            return new Temperature(this);
        }
    }

    private Temperature(Builder builder) {
        this.feelsLike = builder.feelsLike;
        this.temperature = builder.temperature;
        this.maxTemperature = builder.maxTemperature;
        this.minTemperature = builder.minTemperature;
        this.pressure = builder.pressure;
        this.humidity = builder.humidity;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public Integer getPressure() {
        return pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }
}
