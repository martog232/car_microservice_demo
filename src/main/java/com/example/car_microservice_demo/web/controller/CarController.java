package com.example.car_microservice_demo.web.controller;

import com.example.car_microservice_demo.service.CarService;
import com.example.car_microservice_demo.web.model.CarRespModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/user/{userId}")
    public List<CarRespModel> getCarsByUserId(@PathVariable Long userId) {
       return carService.findAllByOwnerId(userId);
    }
}
