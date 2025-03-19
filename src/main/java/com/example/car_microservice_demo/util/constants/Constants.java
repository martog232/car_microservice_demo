package com.example.car_microservice_demo.util.constants;

public class Constants {

    //LOGGER MESSAGES
    public static final String RECEIVED_USER_DELETION_EVENT_LOG_MSG = "Received user deletion event for user ID: {}";


    //EXCEPTION MSG
    public static final String CAR_NOT_FOUND_EXCEPTION_MSG = "Car with id %d not found";


    //CONSUMER_TOPICS
    public static final String TOPIC_USER_DELETION = "user-deletion-topic";


    //KAFKA CONSUMER GROUP ID
    public static final String CAR_SERVICE_GROUP_ID = "car-service-group";
}
