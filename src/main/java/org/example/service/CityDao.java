package org.example.service;

import model.City;

import java.util.List;

 public interface CityDao {


    City add(City city);
    City readCityById(int id);

    City getById(int id);
    List<City> readAllCity();
    City updateCity(City city);

    List<City> getAllCity();

     void deleteCity(City city) ;






    City updateCity(City city);
 }
