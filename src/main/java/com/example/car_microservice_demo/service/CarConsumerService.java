package com.example.car_microservice_demo.service;

import com.example.car_microservice_demo.service.car.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.example.car_microservice_demo.util.constants.Constants.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarConsumerService {

    private final CarService carService;

    @KafkaListener(topics = TOPIC_USER_DELETION, groupId = CAR_SERVICE_GROUP_ID)
    public void listenToUserDeletion(String userId) {
        try {

            log.info(RECEIVED_USER_DELETION_EVENT_LOG_MSG, userId);
            carService.deleteCarsByOwnerId(Long.valueOf(userId));
            log.info("successfully deleted cars of user with id: {}", userId);

        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

}
