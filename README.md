# 🚀 AAD Learning Project

A Java-based **AAD (Advanced API Development) Learning Project** built using **Spring Boot**, focusing on RESTful API development, API integration, CRUD operations, JSON data handling, and backend application architecture.

This project was developed as part of the learning process to gain hands-on experience with modern Java backend technologies and API-based application development.

---

## 📌 Overview

The AAD Learning Project demonstrates how to design, develop, and consume REST APIs using Spring Boot. It covers essential backend development concepts such as request handling, response processing, CRUD operations, JSON serialization, validation, and database integration.

The project follows clean coding practices and industry-standard development approaches to build scalable and maintainable backend applications.

---

## 🎯 Objectives

- Learn RESTful API development
- Understand HTTP methods and status codes
- Implement CRUD operations
- Handle JSON requests and responses
- Connect applications with databases
- Practice Spring Boot development
- Understand API testing and debugging

---

## ✨ Features

### 🔗 API Development
- Create RESTful APIs
- Handle GET requests
- Handle POST requests
- Handle PUT requests
- Handle DELETE requests
- API endpoint testing

### 📦 CRUD Operations
- Create records
- Read records
- Update records
- Delete records
- Search and filter data

### 📄 JSON Processing
- Request body handling
- Response generation
- JSON serialization
- JSON deserialization

### 🗄 Database Integration
- Store application data
- Retrieve records
- Update records
- Delete records

### ⚡ Backend Development
- Layered Architecture
- Controller Layer
- Service Layer
- Repository Layer
- Entity Management

---

## 🏗 Architecture

The project follows a layered architecture:

```text
Client
   │
   ▼
Controller Layer
   │
   ▼
Service Layer
   │
   ▼
Repository Layer
   │
   ▼
Database
```

### Components

#### Controller Layer
- Handles API requests
- Maps endpoints
- Sends responses

#### Service Layer
- Business logic implementation
- Data processing

#### Repository Layer
- Database interaction
- Data persistence

#### Entity Layer
- Database models
- Object mapping

---

## 🛠 Technologies Used

| Technology | Purpose |
|------------|----------|
| Java | Programming Language |
| Spring Boot | Backend Framework |
| Spring MVC | REST API Development |
| Spring Data JPA | Data Persistence |
| Hibernate | ORM Framework |
| MySQL | Database |
| Maven | Dependency Management |
| JSON | Data Exchange |
| Postman | API Testing |
| Git & GitHub | Version Control |

---

## 📂 Project Structure

```text
AAD-Learning-Project/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── entity/
│   │   │   └── dto/
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │
│   └── test/
│
├── pom.xml
│
└── README.md
```

---

## ⚙️ Getting Started

### Clone Repository

```bash
git clone https://github.com/ANu-771/AAD-Learning-Project.git
```

### Open Project

```bash
Open the project using IntelliJ IDEA
```

### Configure Database

Update the database configuration inside:

```properties
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/database_name
spring.datasource.username=root
spring.datasource.password=password
```

### Run Application

```bash
mvn spring-boot:run
```

Or run the main Spring Boot application class from IntelliJ IDEA.

---

## 🧪 API Testing

Use tools such as:

- Postman
- Thunder Client
- Insomnia

to test API endpoints and verify request/response handling.

---

## 📚 Learning Outcomes

This project demonstrates:

- REST API Development
- Spring Boot Fundamentals
- Backend Development
- CRUD Operations
- JSON Handling
- Database Connectivity
- Hibernate ORM
- Layered Architecture
- API Testing
- Software Engineering Best Practices

---

Developed by [ISURU ANUPAMA](https://github.com/ANu-771)

---

## ⭐ Support

<img src="https://media.giphy.com/media/ObNTw8Uzwy6KQ/giphy.gif" width="30px"> Don't forget to hit the ⭐ if you like this repo. <img src="https://media.giphy.com/media/ObNTw8Uzwy6KQ/giphy.gif" width="30px">

---

## 📜 License

This project was developed for educational and learning purposes.
