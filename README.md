# Employee Management CRUD – Spring Boot + Thymeleaf

## Features
- 📋 List employees — via GET `/`
- ➕ Add new employee — POST `/saveEmployee`
- ✏️ Update employee — PUT `/employees/{id}` using hidden `_method=put`
- 🗑️ Delete employee — DELETE `/employees/{id}` or GET `/deleteEmployee/{id}`

## Setup
- Java 1.8, Spring Boot Starter Web, Thymeleaf, Spring Data JPA, MySQL
- In `application.properties`:  
