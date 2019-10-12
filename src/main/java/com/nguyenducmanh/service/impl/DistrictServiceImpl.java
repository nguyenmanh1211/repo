package com.nguyenducmanh.service.impl;

import com.nguyenducmanh.entity.City;
import com.nguyenducmanh.entity.District;
import com.nguyenducmanh.repository.CityRepository;
import com.nguyenducmanh.repository.DistrictRepository;
import com.nguyenducmanh.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DistrictServiceImpl implements DistrictService {
    private CityRepository cityRepository;
    private DistrictRepository districtRepository;


    @Autowired
    public DistrictServiceImpl(CityRepository cityRepository, DistrictRepository districtRepository) {
        this.cityRepository = cityRepository;
        this.districtRepository = districtRepository;
    }

    @Override
    public List<District> findDistrictByCity(String cityName) {
        City city = cityRepository.findCityByCityName(cityName);
        long id = city.getId();
//        System.out.println("id ="+ id);
        return districtRepository.findAllByCity_Id(id);
    }
}
