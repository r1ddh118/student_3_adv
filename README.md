# Student Data Entry with MySQL

A Java-based console application for managing student records using MySQL. The system provides functionality for adding, displaying, searching, updating, and deleting student data through a JDBC connection.

## Project Structure

```
├── DBConnection.java         // Handles MySQL database connection
├── Student.java              // Defines the Student class
├── StudentOperations.java    // Contains CRUD operations for students
├── Main.java                 // Provides CLI menu for interaction
```

## Class and Method Descriptions

### DBConnection.java

**Purpose**: Establishes a connection to the MySQL database.

#### Method:
- `public static Connection getConnection()`
  - Returns a `Connection` object using the specified database URL, username, and password.
  - Throws `SQLException` if the connection fails.

---

### Student.java

**Purpose**: Represents a student entity with attributes.

#### Fields:
- `String name` - Name of the student.
- `long prn` - PRN (Permanent Registration Number).
- `String dept` - Department name.
- `String batch` - Academic batch (e.g., "2023-24").
- `double cgpa` - Cumulative GPA.

#### Constructor:
- `Student(String name, long prn, String dept, String batch, double cgpa)`
  - Initializes a new student object with all attributes.

#### Getter and Setter Methods:
- `getName()`, `setName(String name)`
- `getPRN()`, `setPRN(long prn)`
- `getDept()`, `setDept(String dept)`
- `getBatch()`, `setBatch(String batch)`
- `getCGPA()`, `setCGPA(double cgpa)`

#### Method:
- `public void display()`
  - Displays all details of the student object in a formatted string.

---

### StudentOperations.java

**Purpose**: Provides all CRUD operations related to the student database.

#### Methods:

- `public void addStudent(Scanner scan)`
  - Prompts user input and adds a new student record to the database.

- `public void displayStudents()`
  - Retrieves and displays all student records from the database.

- `public void searchByPRN(Scanner scan)`
  - Searches and displays student details based on the provided PRN.

- `public void searchByName(Scanner scan)`
  - Searches and displays students with names matching the user input (supports partial match).

- `public void updateStudent(Scanner scan)`
  - Updates student details after verifying the PRN exists in the database.

- `public void deleteStudent(Scanner scan)`
  - Deletes a student record based on the provided PRN.

---

### Main.java

**Purpose**: Main driver class that displays a menu and calls appropriate operations based on user choice.

#### Menu Options:
1. Add Student
2. Display Students
3. Search Student (By PRN)
4. Search Student (By Name)
5. Update Student
6. Delete Student
7. Exit

Each menu option corresponds to a method in `StudentOperations`.

---

## Database Assumptions

- MySQL server is running.
- A database named `student_db` is created.
- A table `students` exists with columns:
  - `prn BIGINT PRIMARY KEY`
  - `name VARCHAR(100)`
  - `dept VARCHAR(50)`
  - `batch VARCHAR(20)`
  - `cgpa DOUBLE`

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
  prn BIGINT PRIMARY KEY,
  name VARCHAR(100),
  dept VARCHAR(50),
  batch VARCHAR(20),
  cgpa DOUBLE
);
```
