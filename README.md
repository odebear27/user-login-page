# User Login Page
A Java Project on Login Page which validates username and password for a successful login before saving user information to MySQL Database

## Features
* SpringBoot
* Microservice
* REST API
* MySQL

## Walkthrough
Upon running Spring Boot App, user can open up browser and go to http://localhost:8080/login

![image](https://user-images.githubusercontent.com/101394672/204129060-87c448f0-f0bf-468b-8eea-37a63c61b68d.png)

In MySQL database, `user_info` is a table which stores the `username` and `password` which will be able to login to the system.

![image](https://user-images.githubusercontent.com/101394672/204129195-ac8777e2-3335-4580-a387-b0d6b016c9d9.png)

If the `username` and/or `password` keyed into the system does not match that in the `user_info` table, the login page refreshes again.

If the `username` and/or `password` keyed into the system matches that in the `user_info` table, the user is directed to the next page.

![image](https://user-images.githubusercontent.com/101394672/204129799-209feb93-4599-46fd-afbe-e481c150fd5e.png)

The `username`, `password`, `last_login` will be saved to the login table in MySQL database.

![image](https://user-images.githubusercontent.com/101394672/204129415-59f8803e-829f-47f7-91b2-5ee7e03053aa.png)

## Improvements in the Future
Password should be hashed if storing in MySQL database for security reasons.
