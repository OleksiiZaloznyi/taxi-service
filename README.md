# Taxi Service

<h2>Description</h2>
Taxi Service is a simple web-application that provides authentication, registration and another CRUD operations.

<h2>Features</h2>
- driver registration
- driver authentication
- operations (create, update, delete) with driver
- display all drivers
- operations (create, update, delete) with car
- display all cars
- operations (create, update, delete) with manufacturer
- display all manufacturers
- add driver to car

<h2>Structure</h2>
This project used 3-layer architecture:
- Presentation layer - Controllers
- Application logic layer - Service
- Data access layer - DAO

<h2>Technologies</h2>
- JDK 11
- Servlet
- Tomcat
- MySQL
- JDBC
- CSS
- JSP

<h2>How to run</h2>
You need installed MySQL and Tomcat to run it.
- Open resources directory and use init_db.sql file to create necessary tables
- Edit some required fields for yourself.
- Configure Apache Tomcat version 9.0.71
- Run the app