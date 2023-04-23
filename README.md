# Employee Database System using Spring
This project demonstrates how to build a Java-based employee database system using the Spring framework. The system allows for the management of employee data, including CRUD (Create, Read, Update, Delete) operations, using RESTful API endpoints.

## Prerequisites
Before getting started, make sure the following are existing:

- Java Development Kit (JDK) installed on local machine- .
- Spring Boot and Spring MVC dependencies added to project.
- An Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse for Java development.
- Basic knowledge of Java programming and the Spring framework.

## Setup
Follow the steps below to set up and run the employee database system:

- Clone or download the project files to local machine.
- Import the project into IDE as a Maven project.
- Update the application.properties file with the appropriate database configuration, such as the database URL, username, password, and driver class name.
- Run the project as a Spring Boot application in IDE or using the Maven `spring-boot:run` command.

## Usage
Once the employee database system is up and running, can use RESTful API endpoints to perform CRUD operations on the employee data. The following endpoints are available:

- `GET /employees`: Retrieves a list of all employees.
- `GET /employees/{id}`: Retrieves an employee by ID.
- `POST /employees`: Creates a new employee.
- `PUT /employees/{id}`: Updates an existing employee by ID.
- `DELETE /employees/{id}`: Deletes an employee by ID.
REST client, such as Postman or curl can be used, to make requests to these endpoints and manage employee data in the database.
