CREATE TABLE book (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(150),
    author VARCHAR(100),
    available BOOLEAN
);

CREATE TABLE borrow (
    borrow_id INT PRIMARY KEY AUTO_INCREMENT,
    student_name VARCHAR(100),
    book_id INT,
    borrow_date DATE,
    return_date DATE
);


mysql> SHOW TABLES;
+-------------------------+
| Tables_in_mysqlpractice |
+-------------------------+
| account                 |
| book                    |
| borrow                  |
| employee                |
| transaction_history     |
+-------------------------+
5 rows in set (0.03 sec)

mysql> ALTER TABLE book CHANGE available quantity INT NOT NULL;
Query OK, 0 rows affected (0.12 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> INSERT INTO book(book_id, title, author, quantity) VALUES (1, 'Java', 'James', 3), (2, 'Java-8', 'Rajeev', 5),(3, 'Sync', 'Abhishek', 2);
Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM book;
+---------+--------+----------+----------+
| book_id | title  | author   | quantity |
+---------+--------+----------+----------+
|       1 | Java   | James    |        3 |
|       2 | Java-8 | Rajeev   |        5 |
|       3 | Sync   | Abhishek |        2 |
+---------+--------+----------+----------+
3 rows in set (0.00 sec)

mysql>  INSERT INTO borrow(borrow_id, student_name, book_id, borrow_date, return_date) VALUES (3, 'Richared Johnson', 2, '2025-11-02', '2026-01-31'), (2, 'Raj', 3, '2025-10-01', '2026-01-30');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM borrow;
+-----------+------------------+---------+-------------+-------------+
| borrow_id | student_name     | book_id | borrow_date | return_date |
+-----------+------------------+---------+-------------+-------------+
|         2 | Raj              |       3 | 2025-10-01  | 2026-01-30  |
|         3 | Richared Johnson |       2 | 2025-11-02  | 2026-01-31  |
+-----------+------------------+---------+-------------+-------------+
2 rows in set (0.00 sec)