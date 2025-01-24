## Game Collection System 🎮

This is a system developed in [Java17](https://www.oracle.com/java/technologies/javase-downloads.html) with the powerful [Spring Boot](https://spring.io/projects/spring-boot), designed for game enthusiats who want to organize their collections efficiently, in a standardized, and easily acessible way. The application allows users to search, categorize, and organize their games, as well as rank titles based on their personalopinions.

Whith a robust layered architeture and [PostgreSQL](https://www.postgresql.org/) database support, the system is fully scalable, dockerized, an features a simplified deployment process.

---

## 📝 Features

- **Game Collection Management**: Easily organize and rank your games.  
- **Advanced Search**: Find specific games by ID.  
- **Custom Ranking**: Users can reorder games based on personal preferences.  
- **Available Routes**:  
  - **GET /games**: Returns the complete list of games.  
  - **GET /games/{id}**: Fetch detailed information about a specific game by ID.  
  - **GET /lists**: Returns game list categories.  
  - **GET /lists/{id}/games**: Fetch games organized by category (genre) using the category ID.  
  - **POST /lists/replacement**: Allows users to reorder games based on their preferences.  
- **Database Seeding**: The application includes initial data seeding for quick setup and testing.  

---

## 🚀 Technologies Used

- **Language**: [Java 17](https://www.oracle.com/java/technologies/javase-downloads.html)  
- **Framework**: [Spring Boot](https://spring.io/projects/spring-boot)  
- **Database**: [PostgreSQL](https://www.postgresql.org/)  
- **ORM**: [JPA](https://jakarta.ee/specifications/persistence/3.0/) / [Hibernate](https://hibernate.org/)  
- **Testing Tool**: [Postman](https://www.postman.com/)  
- **Docker**: [Docker](https://www.docker.com/) for containerization  
- **Web Configuration**: Optimized web settings for performance and security

---

## 📊 DSList Domain Model:
![diagram](https://github.com/user-attachments/assets/b45e8eb9-1b22-41cd-95ae-4d1b31189fe9)


---

## 🛠️ How to Install and Run

### Clone the Repository:
```bash
git clone https://github.com/brunaSaNu/DSlist
cd DSlist
```
---

### Configure the Database:

1. Make sure [PostgreSQL](https://www.postgresql.org/) is installed and running.  
2. Update the database credentials in the `application.properties` file, located in the `src/main/resources` folder.

---

### Docker (Optional):

If preferred, you can run the application using **Docker Compose** for easy setup:  

```bash
docker-compose up --build
```

---
### Build and Run:

To manually build and run the application using **Maven**, follow these steps:  

```bash
mvn clean install
mvn spring-boot:run
```
### Acess the API

- **Base URL**: `http://localhost:8080`

---

## 🧪 Testing Routes with Postman

The routes can be tested using [Postman](https://www.postman.com/) with the following requests:

- **GET /games**: Lists all registered games.  
- **GET /games/{id}**: Returns detailed information about a specific game.  
- **GET /lists**: Displays all available categories.  
- **GET /lists/{id}/games**: Shows games organized by category.  
- **POST /lists/replacement**: Sends a JSON payload to reorder games based on the user's preferences.


I hope you enjoy organizing your game list! xoxo 😘💅
