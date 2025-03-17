CREATE TABLE IF NOT EXISTS Cars
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR (255) NOT NULL,
    user_id BIGINT
    );

INSERT INTO Cars (name, user_id)
VALUES ('Toyota Camry', 1),
       ('Honda Accord', 2),
       ('Tesla Model 3', 3),
       ('BMW 3 Series', 4),
       ('Audi A4', 5),
       ('Audi A3', 4);