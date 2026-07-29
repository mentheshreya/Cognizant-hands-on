package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public Country getCountryIndia() {
        LOGGER.info("START - getCountryIndia");
        Country country = countryService.getCountryIndia();
        LOGGER.info("END - getCountryIndia");
        return country;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("START - getAllCountries");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.info("END - getAllCountries");
        return countries;
    }

    @GetMapping(value = {"/countries/{code}", "/country/{code}"})
    public Country getCountry(@PathVariable("code") String code) {
        LOGGER.info("START - getCountry for code: {}", code);
        Country country = countryService.getCountry(code);
        LOGGER.info("END - getCountry");
        return country;
    }
}
