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

## Deployment
### Deployed Application
- **Live Site**: [E-Commerce Application](https://vinaysurya24.github.io/e-com-site/)

### Deployment Methods
1. **GitHub Pages**: 
   - Automated deployment through GitHub Actions
   - Jar file and static resources published

2. **Local Deployment**:
   - Clone the repository
   - Run `mvn spring-boot:run`
   - Access at `http://localhost:8080/products`

## Prerequisites
- Java 11+
- Maven

## How to Run Locally
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

## Deployment Status
![Deploy Spring Boot E-Commerce App](https://github.com/VinaySurya24/e-com-site/workflows/Deploy%20Spring%20Boot%20E-Commerce%20App/badge.svg)
