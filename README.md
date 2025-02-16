# Simple E-commerce Application

An e-commerce application built with Spring Boot, demonstrating basic e-commerce functionality with a clean and modern UI.

## Features

- Product listing with search and category filtering
- Detailed product views
- Add new products
- Responsive design using Bootstrap
- In-memory H2 database with sample data
- Clean and modern UI

## Technologies Used

- Spring Boot 2.7.5
- Spring Data JPA
- Thymeleaf
- H2 Database
- Bootstrap 5
- Lombok
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Running the Application

1. Clone the repository:
```bash
git clone https://github.com/VinaySurya24/e-com-site.git
```

2. Navigate to the project directory:
```bash
cd e-com-site
```

3. Run the application:
```bash
mvn spring-boot:run
```

4. Access the application:
- Main application: http://localhost:8080/products
- H2 Console: http://localhost:8080/h2-console

### H2 Database Access

- URL: jdbc:h2:mem:ecommercedb
- Username: sa
- Password: password

## Project Structure

```
src/main/java/com/example/ecommerce/
├── EcommerceApplication.java
├── controller/
│   └── ProductController.java
├── model/
│   └── Product.java
├── repository/
│   └── ProductRepository.java
└── service/
    └── ProductService.java
```

## Features Explained

1. **Product Listing**
   - Grid view of all products
   - Search functionality
   - Category filtering

2. **Product Details**
   - Detailed view of each product
   - Stock status
   - Price information

3. **Add New Products**
   - Form validation
   - Image URL support
   - Category selection

4. **Responsive Design**
   - Mobile-friendly layout
   - Bootstrap 5 components
   - Custom CSS styling

## Contributing

Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.
