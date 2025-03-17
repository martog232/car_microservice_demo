package com.example.car_microservice_demo.data.repository;

import com.example.car_microservice_demo.data.entity.Car;
import com.example.car_microservice_demo.web.model.CarRespModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> id(Long id);

    List<Car> findAllByOwnerId(Long ownerId);
}
