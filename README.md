# CityCabs Taxi Service

<h2>Description</h2>
Taxi Service is a simple web-application that provides authentication, registration and another CRUD operations.

<h2>Features</h2>
- driver registration<br>
- driver authentication<br>
- operations (create, update, delete) with driver<br>
- display all drivers<br>
- operations (create, update, delete) with car<br>
- display all cars<br>
- operations (create, update, delete) with manufacturer<br>
- display all manufacturers<br>
- add driver to car<br>

<h2>Structure</h2>
This project used 3-layer architecture:<br>
- Presentation layer - Controllers<br>
- Application logic layer - Service<br>
- Data access layer - DAO<br>

<h2>Technologies</h2>
- JDK 11<br>
- Servlet 4.0.1<br>
- Tomcat 9.0.71<br>
- MySQL 8.0<br>
- JDBC<br>
- CSS<br>
- JSP<br>
- JSTL 1.2<br>

<h2>How to run</h2>
You need installed MySQL and Tomcat to run it.<br>
- Open resources directory and use init_db.sql file to create necessary tables<br>
- Go to ConnectionUtil and replace the placeholders to connect your DataBase.<br>
- Configure Apache Tomcat version 9.0.71<br>
- Run the app<br>
