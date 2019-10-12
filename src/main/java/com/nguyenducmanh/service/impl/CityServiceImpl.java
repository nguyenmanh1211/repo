package com.nguyenducmanh.service.impl;

import com.nguyenducmanh.entity.City;
import com.nguyenducmanh.repository.CityRepository;
import com.nguyenducmanh.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    private CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
