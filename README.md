![Screenshot_8](https://github.com/LuisSalas94/Blog-Post-REST-API/assets/57297709/d723fa47-f832-41f0-83a5-4409122bd541)

# Blog Post REST API with Java and Spring Boot 🚀

## Introduction 📝

Welcome to the Blog Post REST API, a robust backend system developed using Java and Spring Boot. This API is specifically designed for managing blog posts with advanced features such as sorting, pagination, search functionality, and full CRUD (Create, Read, Update, Delete) operations for both Posts and Comments. The system also incorporates exception handling and robust validation mechanisms to ensure data integrity.

## Tech Stack 🖥

**Server:**
- Java
- Spring Boot
- Spring JPA
- Spring Web
- MySQL

**Database:**
- MySQL

**Key Features 🎇**

1. **Sorting and Pagination:**
   - The API supports sorting and pagination for efficient handling of large datasets.
   - Users can easily navigate through paginated lists of posts and comments.

2. **Search Functionality:**
   - Incorporates a powerful search feature to allow users to find specific posts or comments.
   - Supports various search criteria to enhance user experience.

3. **CRUD Functionality for Posts and Comments:**
   - **Create:** Users can create new blog posts and comments.
   - **Read:** Retrieve detailed information about posts and comments.
   - **Update:** Modify existing posts and comments as needed.
   - **Delete:** Remove unwanted posts and comments.

4. **Exception Handling:**
   - Robust exception handling ensures graceful error management.
   - Provides meaningful error messages to aid developers in troubleshooting.

5. **Validations:**
   - Implements comprehensive data validations to maintain data integrity.
   - Validates input parameters to prevent invalid data from entering the system.

## API Documentation 📖

### Endpoints:

1. **GET /posts:**
   - Retrieve a list of all blog posts with support for sorting and pagination.

2. **GET /posts/{id}:**
   - Retrieve detailed information about a specific blog post by its identifier.

3. **POST /posts:**
   - Create a new blog post.

4. **PUT /posts/{id}:**
   - Update an existing blog post.

5. **DELETE /posts/{id}:**
   - Delete a blog post by its identifier.

6. **GET /comments:**
   - Retrieve a list of all comments associated with blog posts.

7. **GET /comments/{id}:**
   - Retrieve detailed information about a specific comment by its identifier.

8. **POST /comments:**
   - Create a new comment associated with a blog post.

9. **PUT /comments/{id}:**
   - Update an existing comment.

10. **DELETE /comments/{id}:**
    - Delete a comment by its identifier.

### Getting Started 🚀

**Prerequisites:**
- Java Development Kit (JDK) 8 or above.
- Maven for building and managing the project.
- MySQL database.

**Setup:**

First clone this repository.
```bash
$ git clone https://github.com/LuisSalas94/Blog-Post-REST-API
```
**Set Up the MySQL Database:**

- Create a MySQL database named "demo_post".
- Set the accurate values for spring.datasource.url, spring.datasource.username, and spring.datasource.password.
- Build and Run the Spring Boot Backend:
- Open a terminal and navigate to the springboot-backend folder.
- Build the backend application using Maven: Execute the command ./mvnw clean package.
- Run the backend application: Use the command ./mvnw spring-boot:run.

## Author 👤

- GitHub: [@LuisSalas94](https://github.com/LuisSalas94)
- LinkedIn: [Fernando Salas](https://www.linkedin.com/in/luisfernandosalasgave/)
- Medium: [Fernando Salas](https://medium.com/@luisfernandosalasg)
- Portfolio: [Link](https://fernando-salas-portfolio.netlify.app/)

## Contributing 🤝

Contributions, issues, and feature requests are welcome!
Feel free to check the [issues page](../../issues/).


## Show your support 🌟

Give a ⭐️ if you like this project!

## License 📝

This project is [MIT](./MIT.md) licensed.  





