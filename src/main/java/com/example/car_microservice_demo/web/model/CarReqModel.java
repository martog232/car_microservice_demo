package com.example.car_microservice_demo.web.model;

import lombok.Builder;

@Builder
public record CarReqModel(String name, Long userId) {
}
