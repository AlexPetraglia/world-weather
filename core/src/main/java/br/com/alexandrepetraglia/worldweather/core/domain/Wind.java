package br.com.alexandrepetraglia.worldweather.core.domain;

public class Wind {

    private Double speed;
    private Integer directionDegree;

    public Wind() {
        super();
    }

    public Wind(final Double speed, final Integer directionDegree) {
        this.speed = speed;
        this.directionDegree = directionDegree;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDirectionDegree() {
        return directionDegree;
    }

    public void setDirectionDegree(Integer directionDegree) {
        this.directionDegree = directionDegree;
    }
}
