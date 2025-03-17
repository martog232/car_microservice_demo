package com.example.car_microservice_demo.data.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cars")
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "user_id")
    private Long ownerId;
}
