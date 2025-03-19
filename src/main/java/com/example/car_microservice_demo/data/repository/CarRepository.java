package com.example.car_microservice_demo.data.repository;

import com.example.car_microservice_demo.data.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> id(Long id);

    List<Car> findAllByOwnerId(Long ownerId);


    @Modifying
    @Query("delete from Car where ownerId = :ownerId")
    void deleteByOwnerId(Long ownerId);
}
