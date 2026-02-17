package snippet;

public class Snippet {
	CREATE TABLE account (
	    account_id INT PRIMARY KEY AUTO_INCREMENT,
	    name VARCHAR(100),
	    balance DOUBLE
	);
	
	CREATE TABLE transaction_history (
	    tx_id INT PRIMARY KEY AUTO_INCREMENT,
	    from_account INT,
	    to_account INT,
	    amount DOUBLE,
	    tx_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
	);
	
	
	
	mysql> SELECT * FROM account;
	Empty set (0.08 sec)
}


mysql> INSERT INTO account(account_id, name, balance)
VALUES (101, 'Rajeev', 200000), 
(102, 'Abhishek', 100000);

Query OK, 2 rows affected (0.02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM account;
+------------+----------+---------+
| account_id | name     | balance |
+------------+----------+---------+
|        101 | Rajeev   |  200000 |
|        102 | Abhishek |  100000 |
+------------+----------+---------+
2 rows in set (0.00 sec)


mysql> INSERT INTO transaction_history(tx_id, from_account, to_account, amount, tx_date)
VALUES (1, 34244, 24234, 50000, '2026-02-09 03:03:55'),
(2, 44244, 34234, 5000, '2026-02-09 03:04:55'), 
(3, 35244, 24264, 25000, '2026-02-10 04:03:55');

Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM transaction_history;
+-------+--------------+------------+--------+---------------------+
| tx_id | from_account | to_account | amount | tx_date             |
+-------+--------------+------------+--------+---------------------+
|     1 |        34244 |      24234 |  50000 | 2026-02-09 03:03:55 |
|     2 |        44244 |      34234 |   5000 | 2026-02-09 03:04:55 |
|     3 |        35244 |      24264 |  25000 | 2026-02-10 04:03:55 |
+-------+--------------+------------+--------+---------------------+
3 rows in set (0.00 sec)