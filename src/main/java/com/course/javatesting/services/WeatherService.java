package com.course.javatesting.services;

import com.course.javatesting.models.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public Weather getWeather() {
        Weather weather = new Weather();
        weather.setMaxTemp(10);
        weather.setStatus("Cloudy");
        weather.setMinTemp(8);

        return weather;
    }
}
