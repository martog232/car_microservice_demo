package com.example.car_microservice_demo.service;

import com.example.car_microservice_demo.data.entity.Car;
import com.example.car_microservice_demo.web.model.CarRespModel;

import java.util.List;

public interface CarService {

    List<CarRespModel> findAll();

    CarRespModel findById(Long id);

    void deleteById(Long id);

    CarRespModel create(Car car);

    CarRespModel update(Car car);

    List<CarRespModel> findAllByOwnerId(Long userId);
}
