📌 Account Management System

A simple Spring Boot based Account Management System that demonstrates how to manage accounts using Spring Data JPA and Service Layer Design.

This project covers:

✅ CRUD operations for Account Holders

✅ Use of Spring Boot annotations (@Service, @Autowired, @Entity, @Repository)

✅ Exception handling and clean architecture

✅ Layered approach: Controller → Service → Repository → Database

⚙️ Tech Stack

Java 17+

Spring Boot 3+

Spring Data JPA

Hibernate

H2 / MySQL (configurable)

📂 Project Structure
com.Management
 ┣ 📂 Controller        # API Endpoints
 ┣ 📂 Service           # Business Logic
 ┣ 📂 Repository        # Data Access Layer
 ┣ 📂 Modal             # Entity Classes

 🏷️ Annotations Used
🔹 @Service

Marks a class as a Service Layer Bean.

Contains business logic of the application.

Automatically detected by Spring’s component scanning.

🔹 @Autowired

Enables dependency injection.

Spring automatically injects an instance of the required bean (e.g., AccountRepository).

🔹 @Repository

Used on Data Access Layer (DAO).

Marks the interface as a JPA Repository.

Spring generates CRUD queries automatically.

🔹 @Entity

Used on model classes (AccountHolder).

Maps the class to a database table.

Each field corresponds to a column in the DB.

🔹 @Id & @GeneratedValue

Used in the entity class to define Primary Key.

@GeneratedValue automatically generates unique IDs.
 ┗ Application.java     # Main Entry Point

