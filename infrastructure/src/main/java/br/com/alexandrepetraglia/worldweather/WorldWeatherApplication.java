package br.com.alexandrepetraglia.worldweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.alexandrepetraglia.worldweather")
public class WorldWeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorldWeatherApplication.class, args);
    }

}
