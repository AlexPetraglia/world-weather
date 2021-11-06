package br.com.alexandrepetraglia.worldweather.core.domain;

import java.util.Objects;

public class Coord {

    private Double longitude;
    private Double latitude;

    public Coord(Double latitude, Double longitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coord coord = (Coord) o;
        return longitude == coord.longitude && latitude == coord.latitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitude, latitude);
    }
}
