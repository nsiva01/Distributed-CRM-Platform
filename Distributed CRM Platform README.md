ABOUT
=====
A robust, microservices-based Customer Relationship Management (CRM) system developed independently to demonstrate modern enterprise architecture. This project transitions from a monolithic structure to a distributed ecosystem, ensuring high availability, scalability, and decoupled service logic.

Architecture Overview
=====================
The platform consists of several specialized services that communicate over a network to fulfill business requirements:

Customer Management Service: Handles the core customer domain, including profile management and persistence via Spring Data JPA.

Order Service: Manages customer transactions and order lifecycles.

Eureka Server: Provides service discovery, allowing all microservices to find and communicate with each other dynamically.

API Gateway: Built with Spring Cloud Gateway, it serves as the single entry point for all client requests, handling routing and load balancing.
