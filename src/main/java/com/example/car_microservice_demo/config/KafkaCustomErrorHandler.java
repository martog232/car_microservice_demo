package com.example.car_microservice_demo.config;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.DefaultErrorHandler;
import org.springframework.kafka.listener.MessageListenerContainer;

import java.util.logging.Logger;


public class KafkaCustomErrorHandler extends DefaultErrorHandler {
//    private static final Logger log = LoggerFactory.getLogger(LoggerConstants);
//
//    public void handleRecord(
//            Exception thrownException,
//            ConsumerRecord<?, ?> record,
//            Consumer<?, ?> consumer,
//            MessageListenerContainer container) {
//        log.warn("Global error handler for message: {}", record.value().toString());
//    }
}
