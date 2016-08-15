package ru.aleskovets.everyweather.services.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ad on 08/16/2016.
 */
@RestController
@RequestMapping("/v1")
public class WeatherController {

    @RequestMapping(value = "/weather/{location}", method = RequestMethod.GET)
    public String getWeather(@PathVariable String location) {
        return "The weather in your location is: " + location;
    }
}