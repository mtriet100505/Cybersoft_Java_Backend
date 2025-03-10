CREATE DATABASE homework_jpa;
use homework_jpa;

DROP TABLE IF EXISTS student;
CREATE TABLE student (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    age INT,
    PRIMARY KEY (id)
);