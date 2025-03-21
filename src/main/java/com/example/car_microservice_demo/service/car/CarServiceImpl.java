package com.example.car_microservice_demo.service.car;

import com.example.car_microservice_demo.data.entity.Car;
import com.example.car_microservice_demo.data.repository.CarRepository;
import com.example.car_microservice_demo.mapper.CarMapper;
import com.example.car_microservice_demo.web.model.CarRespModel;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.example.car_microservice_demo.util.constants.Constants.CAR_NOT_FOUND_EXCEPTION_MSG;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Override
    public List<CarRespModel> findAll() {
        return carRepository.findAll().stream().map(carMapper::mapToCarRespModel).collect(Collectors.toList());
    }

    @Override
    public CarRespModel findById(Long id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            return carMapper.mapToCarRespModel(car.get());
        } else throw new EntityNotFoundException(CAR_NOT_FOUND_EXCEPTION_MSG.formatted(id));
    }

    @Override
    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public CarRespModel create(Car car) {
        return null;
    }

    @Override
    public CarRespModel update(Car car) {
        return null;
    }

    @Override
    public List<CarRespModel> findAllByOwnerId(Long userId) {
        return carRepository.findAllByOwnerId(userId).stream().map(carMapper::mapToCarRespModel).toList();
    }

    @Transactional
    @Override
    public void deleteCarsByOwnerId(Long userId) {
        carRepository.deleteByOwnerId(userId);
    }
}
