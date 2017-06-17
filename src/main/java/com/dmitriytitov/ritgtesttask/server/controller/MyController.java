package com.dmitriytitov.ritgtesttask.server.controller;

import com.dmitriytitov.ritgtesttask.server.entity.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dmitriy Titov on 16.06.2017.
 */
@RestController
@RequestMapping("/controller")
public class MyController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Country getCountry() {
        return createMockCountry();
    }

    private Country createMockCountry() {
        Country country = new Country();
        country.setId(1);
        country.setName("Russia");
        country.setCapital("Moscow");

        return country;
    }
}
