CREATE DATABASE bt_buoi_16
USE bt_buoi_16

CREATE TABLE Students (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Full_name VARCHAR(255) NOT NULL,
    Gender VARCHAR(10),
    Age INT,
    City VARCHAR(100),
    Weight DECIMAL(5,2)
);
INSERT INTO Students (Full_name, Gender, Age, City, Weight) VALUES 
('Nguyen Thanh Nhan', 'Nam', 19, 'Can Tho', 56.5674), 
('Pham Thu Huong', 'Nu', 20, 'Vinh Long', 72.456), 
('Nguyen Nhu Ngoc', 'Nu', 20, 'Soc Trang', 85.387), 
('Bui Thanh Bao', 'Nam', 19, 'Soc Trang', 49.3), 
('Le My Nhan', 'Nu', 22, 'Can Tho', 62.963), 
('Tan Thuc Bao', 'Nam', 35, 'An Giang', 55.5678), 
('Trinh Giao Kim', 'Nam', 44, 'Bac Lieu', 67.34