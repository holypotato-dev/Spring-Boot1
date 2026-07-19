# Job-Tracker-API

A RESTful backend API built with **Spring Boot** to help users track and manage their job applications — including application status, company details, and progress — from a single place.

This project was built as a self-learning initiative to gain hands-on, practical experience with Spring Boot, Spring Security, and MySQL beyond tutorials and courses.

## Features

- **CRUD operations** for job applications — create, view, update, and delete records
- **Authentication & Authorization** using Spring Security to protect API endpoints
- **Pagination** on list endpoints for efficient data retrieval
- **Centralized exception handling** for consistent, meaningful error responses
- **Layered architecture** (Controller → Service → Repository) following REST and MVC best practices
- **MySQL** database with a normalized schema and entity relationships mapped via Spring Data JPA

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Framework | Spring Boot |
| Data Access | Spring Data JPA |
| Security | Spring Security |
| Database | MySQL |
| Build Tool | Maven |
| API Testing | Postman |
| Version Control | Git & GitHub |

## Project Structure

```
job-tracker-API/
├── src/
│   └── main/
│       ├── java/           # Application source code (controllers, services, repositories, models)
│       └── resources/      # Application configuration (application.properties/yml)
├── pom.xml                 # Maven dependencies and build configuration
├── mvnw / mvnw.cmd         # Maven wrapper
└── README.md
```

## Getting Started

### Prerequisites

- Java 17+ (or your configured JDK version)
- Maven (or use the included Maven wrapper)
- MySQL Server installed and running

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/MohamedAlAadil007/job-tracker-API.git
   cd job-tracker-API
   ```

2. **Configure the database**

   Create a MySQL database named `jobtracker` and set your credentials as environment variables (do **not** hardcode secrets in `application.properties`):
   ```properties
   spring.application.name=jobtracker

   spring.datasource.url=jdbc:mysql://localhost:3306/jobtracker
   spring.datasource.username=root
   spring.datasource.password=${DB_PASSWORD}

   jwt.secret=${JWT_SECRET}
   jwt.expiration=36000000

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

   Set `DB_PASSWORD` and `JWT_SECRET` as environment variables on your machine before running the app. Never commit real secrets to version control.

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```
   The API will start on `http://localhost:8080` (default port).

4. **Test the endpoints**

   Use [Postman](https://www.postman.com/) or any REST client to interact with the API.

## API Overview

> Update this section with your actual endpoints — example format below.

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Authenticate and receive access token |
| GET | `/api/applications` | Get all job applications (paginated) |
| GET | `/api/applications/{id}` | Get a single job application by ID |
| POST | `/api/applications` | Create a new job application |
| PUT | `/api/applications/{id}` | Update an existing job application |
| DELETE | `/api/applications/{id}` | Delete a job application |

## What I Learned

Building this project helped me gain practical experience in:
- Designing RESTful APIs and structuring a Spring Boot application using layered architecture
- Implementing authentication and securing endpoints with Spring Security
- Handling pagination and writing centralized exception handlers
- Designing a relational database schema and mapping it with Spring Data JPA
- Using Git for incremental, version-controlled development

## Future Improvements

- Deploy the application to a live environment (Render/Railway)
- Add unit and integration tests
- Add filtering and search on job applications
- Build a simple frontend to consume the API

## Author

**Mohamed Al Aadil**
[GitHub](https://github.com/MohamedAlAadil007)
