CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    salary DOUBLE(),
    department VARCHAR(50)
);

mysql> SELECT * FROM employee;

+----+----------+----------+
| id | name     | salary   |
+----+----------+----------+
|  1 | Rajeev   | 50000000 |
|  2 | Abhishek |    20000 |
|  3 | Harshal  |    30000 |
+----+----------+----------+
3 rows in set (0.00 sec)

mysql> INSERT INTO employee(emp_id, emp_name, salary, department) VALUES
    -> (101, 'Ayush', 35000),
    -> (102, 'Devarshi', 450000);
Query OK, 2 rows affected (0.07 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM employee;
+----+----------+--------+
| id | name     | salary |
+----+----------+--------+
|  1 | Rajeev   | 500000 |
|  2 | Abhishek |  20000 |
|  3 | Harshal  |  30000 |
|  4 | Ayush    |  35000 |
|  5 | Devarshi | 450000 |
+----+----------+--------+
5 rows in set (0.00 sec)