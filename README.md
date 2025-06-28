# AgroConnect – A Smart Farmer Support Portal

AgroConnect is a smart, role-based support portal for farmers, officers, and administrators. Built using Java Spring Boot, Thymeleaf, and MySQL, this portal allows users to register and manage accounts based on their role in the agriculture ecosystem.

---

## Project Description

AgroConnect enables farmers to connect with agricultural officers and admins for support, assistance, and information exchange. The system provides a user-friendly interface to register, select roles (FARMER, OFFICER, ADMIN), and manage accounts.

This module covers:
- User Registration
- Role Assignment (Farmer, Officer, Admin)
- Unique Username Validation
- Registration Success Feedback

---

## Features

- Role-based registration (FARMER, OFFICER, ADMIN)
- Thymeleaf-driven dynamic form rendering
- Server-side username validation
- Success message on registration
- MySQL-backed user persistence

---

## Technologies Used

### Backend:
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate ORM

### Frontend:
- HTML5
- CSS3
- Bootstrap 4.6
- Thymeleaf Template Engine

### Database:
- MySQL

---

## Project Structure
src/
├── controller/
│ └── UserController.java
├── model/
│ ├── User.java
│ └── Role.java
├── repository/
│ └── UserRepository.java
├── service/
│ └── UserService.java
├── templates/
│ ├── register.html
│ └── success.html
└── application.properties

## MySQL Database
CREATE DATABASE agroconnect_db;
## DB connection
spring.datasource.url=jdbc:mysql://localhost:3306/agroconnect_db
spring.datasource.username=root
spring.datasource.password=Mallikarjuna@27
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
## run
mvn spring-boot:run
## Browser
http://localhost:8080/users/register

