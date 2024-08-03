# Employee Management System

This is a full-stack web application designed to manage employees efficiently. It is built using Spring Boot for the backend and Angular for the frontend, with PostgreSQL as the database.

## Features

- Perform all CRUD (Create, Read, Update, Delete) operations on employee records.
- Attractive user interface built with Angular.
- Secure and efficient backend built with Spring Boot.
- PostgreSQL used for robust data management.
- Provides a comprehensive way to manage employee information.

## Technologies Used

- **Frontend:** Angular
- **Backend:** Spring Boot
- **Database:** PostgreSQL

## Routes

### Spring Boot (Backend)

- **GET /employees:** Fetch all employees.
- **POST /employees:** Create a new employee.
- **GET /employees/{id}:** Fetch an employee by ID.
- **PUT /employees/{id}:** Update an existing employee by ID.
- **DELETE /employees/{id}:** Delete an employee by ID.

### Angular (Frontend)

- **/employees:** List all employees.
- **/create-employee:** Form to create a new employee.
- **/update-employee/:id:** Form to update an existing employee.
- **/employee-details/:id:** View details of a specific employee.

## How to Run

### Backend (Spring Boot)

1. Clone the repository.
   ```bash
   git clone https://github.com/Abd-pathan/Employee-Management-System.git
   ```
2. Navigate to the backend directory.
   ```bash
   cd SB_Angular_Employee_Management_System/backend
   ```
3. Build and run the application.
   ```bash
   mvn spring-boot:run
   ```

### Frontend (Angular)

1. Navigate to the frontend directory.
   ```bash
   cd SB_Angular_Employee_Management_System/frontend
   ```
2. Install the dependencies.
   ```bash
   npm install
   ```
3. Run the Angular application.
   ```bash
   ng serve
   ```

## Contributing
Contributions are welcome! Please read the contributing guidelines before submitting a pull request.

## Contact
For any inquiries or feedback, please reach out to:

**Name:** Abd Pathan
**Email:** abd.pathan812@gmail.com
