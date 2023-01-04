package com.restful1.springboot.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.restful1.springboot.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    

    City findByCityname(String cityname);
}
