# 👨‍💼 Employee Management System

A simple and robust **Employee Management System** built with **Spring Boot**, **Spring Data JPA**, and **RESTful APIs**. This project demonstrates CRUD operations on employee data, using a layered architecture: Controller → Service → Repository → Database.

---

## 🚀 Features

- ✅ Add a new employee
- 🔍 View all employees
- 🔎 Get employee by ID
- ✏️ Update employee details
- ❌ Delete employee by ID
- 🔄 Clean REST API design
- 🎯 Structured using Spring best practices

---

## 🛠️ Tech Stack

| Layer             | Technology           |
|-------------------|----------------------|
| Language          | Java 24              |
| Framework         | Spring Boot          |
| ORM               | Spring Data JPA      |
| Database          | PostgreSQL           |
| Build Tool        | Maven                |
| API Style         | RESTful APIs         |

---

## 📁 Project Structure

```plaintext
com.sr.employeemanage
├── controller
│   └── EmployeeController.java      # REST API layer
├── model
│   └── Employee.java                # Entity representing the employee
├── repository
│   └── EmployeeRepository.java      # Data access layer
├── service
│   └── EmployeeService.java         # Business logic layer
└── EmployeeManageApplication.java  # Spring Boot application starter
