package com.nguyenducmanh.service;

import com.nguyenducmanh.entity.District;

import java.util.List;

public interface DistrictService {
    List<District> findDistrictByCity(String cityName);
}
