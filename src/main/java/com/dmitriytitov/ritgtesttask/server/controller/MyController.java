package com.dmitriytitov.ritgtesttask.server.controller;

import com.dmitriytitov.ritgtesttask.server.entity.Country;
import com.dmitriytitov.ritgtesttask.server.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Dmitriy Titov on 16.06.2017.
 */
@RestController
@RequestMapping("/controller")
public class MyController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Country getCountry() {
        List<Country> list = countryRepository.findAll();
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
