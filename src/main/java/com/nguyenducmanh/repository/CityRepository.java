package com.nguyenducmanh.repository;

import com.nguyenducmanh.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
    City findCityByCityName(String cityName);
}
