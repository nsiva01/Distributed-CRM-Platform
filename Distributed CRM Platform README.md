ABOUT:
=====
A robust, microservices-based Customer Relationship Management (CRM) system developed independently to demonstrate modern enterprise architecture. This project transitions from a monolithic structure to a distributed ecosystem, ensuring high availability, scalability, and decoupled service logic.

Architecture Overview:
=====================
The platform consists of several specialized services that communicate over a network to fulfill business requirements:

Customer Management Service: Handles the core customer domain, including profile management and persistence via Spring Data JPA.

Order Service: Manages customer transactions and order lifecycles.

Eureka Server: Provides service discovery, allowing all microservices to find and communicate with each other dynamically.

API Gateway: Built with Spring Cloud Gateway, it serves as the single entry point for all client requests, handling routing and load balancing.

Tech Stack:
==========
Language: Java 17+

Framework: Spring Boot 3.x (Spring MVC, Spring Data JPA)

Microservices: Spring Cloud (Netflix Eureka, API Gateway)

Database: MySQL / PostgreSQL (Configurable via properties)

Libraries: Lombok for boilerplate reduction

Build Tool: Maven

Project Structure:
=================
The code follows a clean, layered architecture within the com.siva package:

config/: Security and system configurations.

controller/: REST API endpoints for external communication.

service/: Core business logic and service-to-service interaction.

repository/: Data access layer using JPA interfaces.

entity/: Database models and mappings.

exception/: Centralized Global Exception Handling.

Getting Started:
================
Clone the Repository:
--------------------
git clone https://github.com/nsiva01/Distributed-CRM-Platform.git

Infrastructure Setup:
---------------------
Start the Eureka Server first to enable service registration.
Start the Customer and Order services.
Start the API Gateway last to begin routing traffic.

Database: 
--------
Update your application.properties with your local database credentials.

Sample API Endpoints:
====================
Method              Endpoint               Description
------              --------               -----------
GET                  /api/customers       Fetch all registered customers
POST                 /api/customers       Create a new customer profile
GET                  /api/orders/{id}     Retrieve order details for a customer
