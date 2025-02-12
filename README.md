<<<<<<< HEAD
# Beginner E-Commerce Spring Boot Project

## Overview
A simple e-commerce web application built with Spring Boot, demonstrating basic web development and database interaction concepts.

## Features
- View product catalog
- Add new products
- Search products by name
- Filter products by category
- In-memory database with H2

## Technologies Used
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 Database
- Lombok

## Prerequisites
- Java 11+
- Maven

## How to Run
1. Clone the repository
2. Navigate to the project directory
3. Run `mvn spring-boot:run`
4. Open browser and visit `http://localhost:8080/products`

## Endpoints
- `/products`: View all products
- `/products/add`: Add a new product
- `/products/category/{category}`: View products by category
- `/products/search?keyword=`: Search products

## H2 Console
- Access H2 Console at `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:ecommercedb`
- Username: `sa`
- Password: `password`

## Learning Objectives
- Spring Boot basics
- RESTful API design
- Database interactions
- Thymeleaf templating
- Basic web application structure
=======
# Simple Flight Reservation System

## Overview
A beginner-friendly console-based flight reservation application written in Java.

## Features
- View available flights
- Make flight reservations
- View existing reservations

## How to Run
1. Ensure you have Java 11+ installed
2. Navigate to the project directory
3. Compile: `javac FlightReservationSystem.java`
4. Run: `java FlightReservationSystem`

## Menu Options
1. View Available Flights
2. Make a Reservation
3. View My Reservations
4. Exit

## Sample Flights
- Flight 1: Mumbai to Delhi
- Flight 2: Bangalore to Chennai
- Flight 3: Kolkata to Hyderabad

## Note
This is a simple in-memory application. Reservations are not persistent.
>>>>>>> 085dbd44f1f8aa88eda2a6df9d62c029602448a9
