# SpringBoot_Employee

Below is a **clear, step-by-step guide** to **import a Spring Boot backend project from GitHub into Spring Tool Suite (STS)** and **run it**, written in a **test/assignment-style format**.

---

## Test: Importing and Running a Spring Boot Project from GitHub using Spring Tool Suite (STS)

### Objective

This Spring Boot Mini project is developed to demonstrate the implementation of RESTful web services for performing CRUD (Create, Read, Update, Delete) operations on an Employee entity. The application exposes multiple REST APIs that allow users to save employee data, retrieve employee records, search employees based on salary criteria, update employee details, and delete employee records using unique identifiers.

The primary goal of this project is to showcase how Spring Boot can be used to build REST APIs using standard HTTP methods and URL-based request handling. It also demonstrates basic data filtering operations such as finding employees by salary and within a salary range.

## Software Requirements

* Spring Tool Suite (STS) installed
* JDK 8 or higher installed
* Git installed
* Internet connection

---

## Step 1: Open Spring Tool Suite (STS)

1. Launch **Spring Tool Suite**.
2. Select or create a **workspace**.
3. Click **Launch**.

---

## Step 2: Copy GitHub Repository URL

1. Open the GitHub repository in a browser.
2. Click **Code → HTTPS**.
3. Copy the repository URL.
   Example:
   https://github.com/username/springboot-backend.git
---

## Step 3: Import Project from GitHub

1. In STS, go to:

   ```
   File → Import
   ```
2. Select:

   ```
   Git → Projects from Git
   ```
3. Click **Next**.
4. Choose **Clone URI** and click **Next**.
5. Paste the GitHub repository URL.
6. Click **Next → Next**.
7. Choose a local directory and click **Next**.
8. Select:

   ```
   Import existing Eclipse projects
   ```
9. Click **Finish**.

✅ The project will appear in the **Project Explorer**.

---

## Step 4: Update Maven Dependencies

1. Right-click on the project.
2. Select:

   ```
   Maven → Update Project
   ```
3. Click **OK**.
4. Wait for dependencies to download.

---

## Step 5: Check Application Properties

1. Open:

   ```
   src/main/resources/application.properties
   ```

   or

   ```
   application.yml
   ```
2. Verify:

   * Server port
   * Database configuration (if any)

Example:

```properties
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=root
```

---

## Step 6: Run the Spring Boot Application

### Method 1: Run as Spring Boot App

1. Locate the main class (annotated with `@SpringBootApplication`).
2. Right-click on the file.
3. Select:

   ```
   Run As → Spring Boot App
   ```

### Method 2: Run from Project Explorer

1. Right-click on the project.
2. Select:

   ```
   Run As → Spring Boot App
   ```

---

## Step 7: Verify Application Running

1. Open browser.

2. Visit:

   ```
   http://localhost:8080
   ```

   or any API endpoint, for example:

   ```
   http://localhost:8080/api/test
   ```

3. Check **Console** in STS for:

   ```
   Started Application in X seconds
   ```

✅ Application is running successfully.

---

## Result

The Spring Boot backend project was successfully imported from GitHub into Spring Tool Suite and executed without errors.

---

## Common Errors & Fixes

| Error                      | Solution                     |
| -------------------------- | ---------------------------- |
| Java version mismatch      | Set correct JDK in STS       |
| Maven dependency error     | Run `Maven → Update Project` |
| Port already in use        | Change server port           |
| Database connection failed | Check DB credentials         |
