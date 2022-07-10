# Final Project: Dental Clinic
Final project: Dental clinic for BackEnd-1 (ApiREST) CTD

# Description
The project is a REST API of a dental clinic, where you can add, delete, update or list patients, dentists and appointments.

# Project technologies and tools
* Spring Boot
* MVC pattern
* H2 DB
* ORM
* Spring data - Hibernate
* HQL
* Exception handling with Logging
* Spring-security
* Endpoints security based on JWT tokens
* Unit tests - Junit 5
* Swagger UI - Documentation

# How does it work?
Actually, much better if you just start the application and navigate to [http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/index.html#/). There you'll find a nice API documentation thanks to Swagger.
![swagger_info](https://user-images.githubusercontent.com/86891538/178162702-8cb69ef2-d9c9-4760-8e80-1e160801012c.png)

# Endpoints
Once we have our application running, by default the application starts on port 8080, we enter from the web to http://localhost:8080/login .
![login](https://user-images.githubusercontent.com/86891538/178162723-cd7b700e-db6e-4f7f-8cf7-ac1dc89020b7.png)

# Roles
To log in as an administrator, we must log in with the credentials: 
- Username: admin@gmail.com, password: password 
We can manage all dentists, patients and appointments.
To enter as a user, we must enter with the credentials: 
- Username: user@gmail.com, password : password2 
We can only access to modify the shifts.

# Index view
![index_clinic](https://user-images.githubusercontent.com/86891538/178162776-06ab859d-d2d4-4c07-b397-4f0bbcbd2e71.png)

