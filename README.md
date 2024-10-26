# Full Stack To-Do App

## Overview
The **Full Stack To-Do App** is a web-based application built with a React frontend and a Spring Boot backend. It allows users to manage their tasks efficiently, providing features like creating, updating, and deleting to-do items. This project showcases the integration of frontend and backend technologies to create a responsive and interactive application.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Backend Setup (Spring Boot)](#backend-setup-spring-boot)
- [Frontend Setup (React)](#frontend-setup-react)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Sample Screenshots](#sample-screenshots)
- [License](#license)

## Features
- **Create To-Do**: Add new tasks with descriptions and due dates.
- **View To-Dos**: Display a list of all tasks with their status.
- **Update To-Do**: Edit task details and mark tasks as completed.
- **Delete To-Do**: Remove tasks from the list.
- **User-Friendly UI**: Responsive design with easy-to-navigate layout.

## Tech Stack
- **Frontend**: React, HTML, CSS
- **Backend**: Spring Boot (Java), RESTful API
- **Database**: MySQL (or H2 for testing)
- **Tools**: Postman (for testing API), Maven

## Getting Started
To run this project locally, follow the setup instructions for the backend and frontend.

### Prerequisites
- **Java 11 or higher**
- **Node.js and npm**
- **MySQL** (or H2 if testing)
- **Maven**

## Backend Setup (Spring Boot)
1. **Navigate to the Backend Directory**:
   ```bash
   cd backend
   ```

2. **Configure Database**:
   - In `src/main/resources/application.properties`, update the database configurations.
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

3. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```
   - The backend should start on `http://localhost:8080`.

## Frontend Setup (React)
1. **Navigate to the Frontend Directory**:
   ```bash
   cd frontend
   ```

2. **Install Dependencies**:
   ```bash
   npm install
   ```

3. **Start the React App**:
   ```bash
   npm start
   ```
   - The frontend should start on `http://localhost:3000`.

## Usage
1. **Open the app** at `http://localhost:3000`.
2. **View all to-dos**: The main page displays a list of existing to-dos.
3. **Add a new to-do** by entering a task and clicking "Add".
4. **Update or delete** tasks as needed by clicking the respective buttons.

## Project Structure
- **Frontend (React)**: Handles UI and user interaction.
  - **/src**: Contains components like `TodoList`, `TodoItem`, and `AddTodoForm`.
  - **/public**: Contains static assets.
- **Backend (Spring Boot)**: Manages data and business logic.
  - **/src/main/java**: Contains controllers, services, and repositories.
  - **/src/main/resources**: Configuration files, such as `application.properties`.

## API Endpoints
- **GET /api/todos**: Fetch all to-dos.
- **POST /api/todos**: Add a new to-do.
- **PUT /api/todos/{id}**: Update a to-do by ID.
- **DELETE /api/todos/{id}**: Delete a to-do by ID.

## Sample Screenshots
[Include screenshots here if available]

## License
This project is licensed under the MIT License.
