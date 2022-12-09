package com.restful1.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful1.springboot.entities.City;
import com.restful1.springboot.repositiories.CityRepository;

@Service
public class CityService {
    
    @Autowired CityRepository cityRepository;

    public CityService() {
    }

    //Getting all the cities name
    public List<City> getCities() {
        return cityRepository.findAll();
    }

    //Saving the city name 
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    //Getting the one city name
    public City getCity(String cityname) {
        return cityRepository.findByCityname(cityname);
    }

}
