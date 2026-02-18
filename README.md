## 📅 MySQL Database & JDBC(Java-Database-Connectivity)

---

### 📅 Day 1 – MySQL & JDBC Fundamentals  
**(Date: 06-Feb-2026)**         
**Branch:** `mysql-jdbc-practice`

#### 📁Project Structure

```
BridgeLabz-Training/
|
├── 📁 mysql-jdbc-practice/
│   ├── 📁 gcr-codebase/
│   │   └── 📁 mysqlpractice/
│   │       └── 📁 src/
│   │           |── 📁 main/
│   │           |   ├── 📁 java/
|   |           |   |   └── 📁 com/
|   |           |   |       └── 📁 mysqlpractice/
|   |           |   |                   
|   |           |   └── 📁 resources/
|   |           |       └── 📁 sql/
|   |           |
|   |           └── 📁 test/
│   │               ├── 📁 java/
|   |               └── 📁 resources/
|   |            
|   └── 📁 scenario-based-codebase/
|
└── README.md
```

#### 📁 gcr-codebse structure(Maven Project)

```
mysqlpractice/
│
├── pom.xml
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── mysqlpractice/
│   │   │           | 
│   │   │           ├── util/
│   │   │           │   └── DBConnection.java
│   │   │           │
│   │   │           ├── employeeManagementSystem/
│   │   │           │   ├── Employee.java
│   │   │           │   ├── EmployeeDAO.java
│   │   │           │   └── EmployeeApp.java
│   │   │           │
│   │   │           ├── bankingTransactionManagement/
│   │   │           │   ├── Account.java
│   │   │           │   ├── BankingDAO.java
│   │   │           │   └── BankingApp.java
│   │   │           │
│   │   │           └── libraryManagementSystem/
│   │   │               ├── Book.java
│   │   │               ├── Student.java
│   │   │               ├── LibraryDAO.java
│   │   │               └── LibraryApp.java
│   │   │
│   │   └── resources/
│   │       └── sql/
│   │           ├── employee.sql
│   │           ├── banking.sql
│   │           └── library.sql
│   │
│   └── test/
│       |── java/
|       └── resources/
│           └── (optional later)
│
└── .gitignore

```

#### 🔹 Topics Covered
- Overview of **MySQL as an RDBMS** and real-world database usage
- **Database design principles**: normalization (1NF to BCNF), primary & foreign keys
- **Constraints**: NOT NULL, UNIQUE, CHECK, DEFAULT, AUTO_INCREMENT
- **SQL command categories**: DDL, DML, DQL, DCL, TCL
- **Joins** (INNER, LEFT, RIGHT), subqueries, CTEs, and window functions
- **Transactions & ACID properties** for data consistency
- **Indexing concepts** in MySQL & SQL Server
- Query performance tuning using `EXPLAIN`

#### 🔹 Hands-On Practice
- Practiced SQL queries on real-world scenarios:
  - **Employee Management System** – CRUD operations, search & updates
  - **Banking System** – balance handling with transactions
  - **Library Management System** – book inventory, issue/return, user tracking

✔ Strengthened understanding of **data integrity, performance optimization, and JDBC-ready SQL design**

👉 [Day 1 - MySQL Practice](https://github.com/Rajeev-Rai28/BridgeLabz-Training/tree/mysql-jdbc-practice/mysql-jdbc-practice/gcr-codebase/mysqlpractice/src/main/java)

---

### 📅 Day 2 – MySQL + JDBC Scenario Practice & PowerSkill Training  
**(Date: 07-Feb-2026)**    
**Branch:** `mysql-jdbc-practice`

#### 🔹 Technical Practice (Scenario-Based)
Worked on **6 real-world JDBC + MySQL scenarios** based on a **Hospital Management System**, covering:
- **Patient Management:** registration, update, search, visit history (CRUD, LIKE, JOINs)
- **Doctor Management:** add/update specialty, view by specialty, soft delete
- **Appointment Scheduling:** book, cancel, reschedule, availability check (transactions)
- **Medical Records:** visits, prescriptions, patient history (one-to-many, batch inserts)
- **Billing & Payments:** bill generation, payments, outstanding bills, revenue reports
- **System Admin:** specialty lookup, audit logs, backup concepts

#### 🔹 Key Concepts Applied
- Primary & Foreign Keys, Auto-Increment  
- INNER / LEFT JOINs, Subqueries  
- Transactions (COMMIT / ROLLBACK)  
- PreparedStatement (SQL injection prevention)  
- Aggregate functions (COUNT, SUM, AVG)  
- Batch operations, ResultSet handling, indexing & triggers  

👉 [Day 2 - MySQL Scenario-Based Practice]()

---

### 📅 Day 3 – JDBC Learning & Practice  
**(Date: 09-Feb-2026)**      
**Branch:** `mysql-jdbc-practice`   

#### 🔹 What I Learned
- **JDBC Architecture:** DriverManager, Connection, Statement, PreparedStatement, ResultSet
- **Database Connection Setup:** Basic connection, Properties-based config, Singleton pattern
- **CRUD Operations:** Create, Read, Update, Delete using JDBC
- **PreparedStatement vs Statement:** Security, performance, and SQL injection prevention
- **Transaction Management:** ACID properties, commit/rollback, savepoints
- **Connection Pooling:** Introduction to HikariCP for performance optimization
- **Best Practices:** Try-with-resources, batch processing, DTO & DAO patterns

#### 🔹 Hands-on Practice
- Built a **Student Management System** using JDBC
- Implemented:
  - Insert, fetch, update, delete students
  - Menu-driven console application
  - Auto-generated keys handling
  - Stored procedure calls (IN / OUT parameters)
  - Metadata operations (DatabaseMetaData, ResultSetMetaData)

#### 🔹 Advanced & Real-World Concepts
- Batch inserts for performance
- Exception handling with specific SQL exceptions
- Security practices (no hardcoded credentials, input validation)
- Performance tuning (indexes, fetch size, connection pooling)
- Unit testing basics using JUnit & Mockito (mocking JDBC)

#### ✅ Outcome
Strengthened understanding of **JDBC fundamentals to advanced concepts**, gained confidence in building **database-driven Java applications**, and learned **production-level best practices** for performance, security, and maintainability.

👉 [Day 3 - JDBC](https://github.com/Rajeev-Rai28/BridgeLabz-Training/tree/mysql-jdbc-practice)

---
