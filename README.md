# Project Name:  SpringBoot Employee

## Importing and Running a Spring Boot Project from GitHub using Spring Tool Suite (STS)

---

## 📌 Objective

This Spring Boot mini project demonstrates the implementation of **RESTful web services** to perform **CRUD (Create, Read, Update, Delete)** operations on an **Employee** entity.

The application exposes multiple REST APIs that allow users to:

* Save employee data
* Retrieve all employee records
* Search employees by salary
* Search employees within a salary range
* Update employee details using ID
* Delete employee records using ID

The primary goal of this project is to showcase how **Spring Boot** can be used to build REST APIs using standard HTTP methods and URL-based request handling. It also demonstrates basic data filtering operations using JPA Repository.

---

## 🛠️ Software Requirements

* Spring Tool Suite (STS)
* JDK 8 or higher
* Git
* Internet connection

---

## ⚙️ Technologies Used

* Java
* Spring Boot
* Spring REST
* Spring Security
* Hibernate
* JPA Repository
* Oracle
* MySQL

---

## 🗄️ Database Used

* MySQL

> **Note:** Database creation scripts will be added later in this README file.

---

## 🚀 Importing and Running the Project in STS

1. Open **Spring Tool Suite (STS)**
2. Go to **File → Import**
3. Select **Existing Maven Projects**
4. Choose the cloned GitHub project directory
5. Click **Finish**
6. Update Maven dependencies:

   * Right-click project → **Maven → Update Project**
7. Run the project:

   * Right-click project → **Run As → Spring Boot App**

---

## 🔗 REST APIs for Testing

### Available REST Endpoints

1. **Save Employee Data**

   ```
   http://localhost:8080/saveemployee
   ```

2. **View All Employees**

   ```
   http://localhost:8080/viewdata
   ```

3. **Find Employees by Salary**

   ```
   http://localhost:8080/findbysalary/{salary}
   ```

   Example:

   ```
   http://localhost:8080/findbysalary/10000
   ```

4. **Find Employees with Salary Between Range**

   ```
   http://localhost:8080/findsalarybetween/{minSalary}/{maxSalary}
   ```

   Example:

   ```
   http://localhost:8080/findsalarybetween/9000/12000
   ```

5. **Delete Employee by ID**

   ```
   http://localhost:8080/deletebyid/{id}
   ```

   Example:

   ```
   http://localhost:8080/deletebyid/1
   ```

6. **Update Employee by ID**

   ```
   http://localhost:8080/updateById/{id}
   ```

   Example:

   ```
   http://localhost:8080/updateById/1
   ```

---

## ❗ Common Errors & Fixes

| Error                      | Solution                         |
| -------------------------- | -------------------------------- |
| Java version mismatch      | Set correct JDK in STS           |
| Maven dependency error     | Run `Maven → Update Project`     |
| Port already in use        | Change server port in properties |
| Database connection failed | Check DB credentials             |

---

## 🤝 Suggestions & Improvements

Suggestions and project improvements are always welcome!

---

## 🙏 Acknowledgment

Thanks a lot

Project Leader

Dattatray Bodake

---
