package com.example.car_microservice_demo.mapper;


import com.example.car_microservice_demo.data.entity.Car;
import com.example.car_microservice_demo.web.model.CarRespModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarRespModel mapToCarRespModel(Car model);
}
