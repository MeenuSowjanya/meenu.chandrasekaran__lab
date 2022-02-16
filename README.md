# MySQL Queries

 ##### ``` SHOW DATABASES ;```


| Database           |
|:------------------:|
| Supply             |
| document           |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| test               |
 


7 rows in set (0.00 sec)

  ##### ``` CREATE DATABASE School; ```

##### Query OK, 1 row affected (0.00 sec)

  ##### ``` USE School; ```

###### ``` Database changed```

 ##### ``` CREATE TABLE students(id TINYINT PRIMARY KEY CHECK(id>0),name VARCHAR(30) NOT NULL,class TINYINT(2) NOT NULL CHECK (class>0));```

###### Query OK, 0 rows affected, 1 warning (0.04 sec)

  ##### ``` DESC students; ```


| Field | Type        | Null | Key | Default | Extra |
|:--:|:--:|:--:|:--:|:--:|:--:|
| id    | tinyint     | NO   | PRI | NULL    |       |
| name  | varchar(30) | NO   |     | NULL    |       |
| class | tinyint     | NO   |     | NULL    |       |

3 rows in set (0.00 sec)

 ##### ``` INSERT INTO students values(1,"Meenu",12);```

###### Query OK, 1 row affected (0.00 sec) 

##### /*After inserting multiple rows :*/

 ##### ``` SELECT * FROM students; ```


| id | name    | class |
|:--:|:--:|:--|
|  1 | Meenu   |    12 |
|  2 | Pradeep |    12 |
|  3 | Rohan   |    12 |
|  4 | Sneha   |    12 |

4 rows in set (0.00 sec)

  ##### ```UPDATE students SET name="Kumar" WHERE id=4;```

###### Query OK, 1 row affected (0.01 sec)

###### Rows matched: 1  Changed: 1  Warnings: 0

##### /*RESULT :*/


| id | name    | class |
|:--:|:--:|:--:|
|  1 | Meenu   |    12 |
|  2 | Pradeep |    12 |
|  3 | Rohan   |    12 |
|  4 | Kumar   |    12 |

4 rows in set (0.00 sec)      

## OPERATORS

  ##### ``` SELECT 4+3,4-3,4*3,4/3,4%3; /* ARITHMETIC OPERATORS */ ```


| 4+3 | 4-3 | 4*3 | 4/3    | 4%3  |
|:--:|:--:|:--:|:--:|:--:|
|   7 |   1 |  12 | 1.3333 |    1 |


### Logical Operators

 #####  ``` SELECT 1 AND 0,1 AND 1,1 AND NULL,0 AND NULL;```


| 1 AND 0 | 1 AND 1 | 1 AND NULL | 0 AND NULL |
|:--:|:--:|:--:|:--|
|       0 |       1 |       NULL |          0 |

1 row in set (0.00 sec)

  ##### ``` SELECT 1 OR 0,1 OR 1,1 OR NULL,0 OR NULL; ```


| 1 OR 0 | 1 OR 1 | 1 OR NULL | 0 OR NULL |
|:--:|:--:|:--:|:--:|
|      1 |      1 |         1 |      NULL |

1 row in set (0.00 sec)

 #####  ``` SELECT 1 XOR 0,1 XOR 1,0 OR 0,0 XOR NULL,1 XOR NULL,1 XOR 1 XOR 1; ```


| 1 XOR 0 | 1 XOR 1 | 0 OR 0 | 0 XOR NULL | 1 XOR NULL | 1 XOR 1 XOR 1 |
|:--:|:--:|:--:|:--:|:--:|:--:|
|       1 |       0 |      0 |       NULL |       NULL |             1 |

1 row in set (0.00 sec)

  ##### ``` SELECT NOT((1 OR 0) AND (1 XOR 1)); ```


| NOT((1 OR 0) AND (1 XOR 1)) |
|:--:|
|                           1 |

1 row in set (0.00 sec)

 #####  ``` SELECT * FROM students WHERE name LIKE("R%") OR name LIKE("%P") OR name LIKE("ME__U%"); ```


| id | name    | class |
|:--:|:--:|:--:|
|  1 | Meenu   |    12 |
|  2 | Pradeep |    12 |
|  3 | Rohan   |    12 |

3 rows in set (0.00 sec)

  ##### ```SELECT * FROM students WHERE id> ANY(SELECT marks FROM mark_list);```

Empty set (0.00 sec)

  ##### ```SELECT * FROM students WHERE id< ANY(SELECT marks FROM mark_list);```


| id | name    | class |
|:--:|:--:|:--:|
|  1 | Meenu   |    12 |
|  2 | Pradeep |    12 |
|  3 | Rohan   |    12 |
|  4 | Kumar   |    12 |

4 rows in set (0.00 sec)

  ##### ``` SELECT * FROM students WHERE id IN(SELECT marks FROM mark_list); ```
 
Empty set (0.00 sec)

  ##### ``` SELECT * FROM students WHERE id NOT IN(SELECT marks FROM mark_list); ```


| id | name    | class |
|:--:|:--:|:--:|
|  1 | Meenu   |    12 |
|  2 | Pradeep |    12 |
|  3 | Rohan   |    12 |
|  4 | Kumar   |    12 |

4 rows in set (0.00 sec)

 #####  ``` SELECT * FROM students WHERE id< ALL(SELECT marks FROM mark_list); ```

| id | name    | class |
|:--:|:--:|:--:|
|  1 | Meenu   |    12 |
|  2 | Pradeep |    12 |
|  3 | Rohan   |    12 |
|  4 | Kumar   |    12 |

4 rows in set (0.00 sec)

 ##### ``` SELECT * FROM students WHERE EXISTS(SELECT name FROM mark_list WHERE name LIKE("P%")); ```


| id | name    | class |
|:--:|:--:|:--:|
|  2 | Pradeep |    12 |

1 row in set (0.00 sec)

  ##### ``` SELECT * FROM students WHERE NOT EXISTS(SELECT name FROM mark_list WHERE name LIKE("P%")); ```


| id | name  | class |
|:--:|:--:|:--:|
|  1 | Meenu |    12 |
|  3 | Rohan |    12 |
|  4 | Kumar |    12 |

3 rows in set (0.00 sec)

### RELATIONAL OPERATORS

  ##### ``` SELECT 1=2,1=1; ```


| 1=2 | 1=1 |
|:--:|:--:|
|   0 |   1 |

1 row in set (0.00 sec)

 ##### ``` SELECT 1>2,1<1,1<>2,1!=1,1<=>1,1<=2,2>=4; ```


| 1>2 | 1<1 | 1<>2 | 1!=1 | 1<=>1 | 1<=2 | 2>=4 |
|:--:|:--:|:--:|:--:|:--:|:--:|:--:|
|   0 |   0 |    1 |    0 |     1 |    1 |    0 |

1 row in set (0.00 sec)

 ##### ``` SELECT * FROM students WHERE id BETWEEN 1 AND 3; ```


| id | name    | class |
|:--:|:--:|:--:|
|  1 | Meenu   |    12 |
|  2 | Pradeep |    12 |
|  3 | Rohan   |    12 |

3 rows in set (0.00 sec)

 ##### ``` SELECT * FROM students WHERE id NOT BETWEEN 1 AND 3; ```


| id | name  | class |
|:--:|:--:|:--:|
|  4 | Kumar |    12 |

1 row in set (0.00 sec)

 ##### ``` SELECT COALESCE(NULL,NULL,10,NULL,1),GREATEST(1.00787918,9.0939279,1,2,1.2827392793),LEAST(1.3923920,1.2792883,0.487249,0.7293983,6); ```


| COALESCE(NULL,NULL,10,NULL,1) | GREATEST(1.00787918,9.0939279,1,2,1.2827392793) | LEAST(1.3923920,1.2792883,0.487249,0.7293983,6) |
|:--:|:--:|:--:|
|                            10 |                                    9.0939279000 |                                       0.4872490 |

1 row in set (0.00 sec)

 ##### ``` SELECT 1 IN (1,2,76283728,"MEENU"), "PRADEEP" NOT IN ("ROHAN","SNEHA","MEENU"); ```


| 1 IN (1,2,76283728,"MEENU") | "PRADEEP" NOT IN ("ROHAN","SNEHA","MEENU") |
|:--:|:--:|:--:|
|                           1 |                                          1 |

1 row in set (0.00 sec)

 ##### ``` SELECT 1 IS NOT UNKNOWN, 0 IS NOT UNKNOWN, NULL IS NOT UNKNOWN; ```


| 1 IS NOT UNKNOWN | 0 IS NOT UNKNOWN | NULL IS NOT UNKNOWN |
|:--:|:--:|:--:|
|                1 |                1 |                   0 |

1 row in set (0.00 sec)

 ##### ``` SELECT 1 IS NULL, 0 IS NULL, NULL IS NOT NULL; ```


| 1 IS NULL | 0 IS NULL | NULL IS NOT NULL |
|:--:|:--:|:--:|
|         0 |         0 |                0 |

1 row in set (0.00 sec)

 ##### ``` SELECT ISNULL(1+1),ISNULL(1/0); ```


| ISNULL(1+1) | ISNULL(1/0) |
|:--:|:--:|
|           0 |           1 |

1 row in set, 1 warning (0.00 sec)

## ALTER 

##### ```ALTER TABLE students MODIFY name varchar(30),ADD COLUMN blood_group varchar(2) NOT NULL AFTER name;```

###### Query OK, 0 rows affected (0.10 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

 ##### ```DESC students;``` 


| Field       | Type        | Null | Key | Default | Extra |
|:--:|:--:|:--:|:--:|:--:|:--:|
| id          | tinyint     | NO   | PRI | NULL    |       |
| name        | varchar(30) | YES  |     | NULL    |       |
| blood_group | varchar(2)  | NO   |     | NULL    |       |
| class       | tinyint     | NO   |     | NULL    |       |

4 rows in set (0.00 sec)

##### ```ALTER TABLE students DROP COLUMN blood_group;```

###### Query OK, 0 rows affected (0.10 sec)
###### Records: 0  Duplicates: 0  Warnings: 0

 ##### ```DESC students;``` 


| Field       | Type        | Null | Key | Default | Extra |
|:--:|:--:|:--:|:--:|:--:|:--:|
| id          | tinyint     | NO   | PRI | NULL    |       |
| name        | varchar(30) | YES  |     | NULL    |       |
| class       | tinyint     | NO   |     | NULL    |       |

3 rows in set (0.00 sec)

### DELETE AND DROP QUERIES

##### ```DROP TABLE mark_list;```

###### Query OK, 0 rows affected (0.10 sec)

##### ``` DELETE FROM students WHERE class=12; ```

###### Query OK, 4 rows affected (0.00 sec)

##### ```SELECT * FROM students; ```

###### Empty set (0.00 sec)

##### ```SHOW TABLES;```


| Tables_in_School |
|:--:|
| students         |

1 row in set (0.00 sec)

##### ```DROP TABLE students;```

###### Query OK, 0 rows affected (0.02 sec)

##### ```SHOW TABLES; ```

###### Empty set (0.00 sec)

##### ``` DROP DATABASE School; ```

###### Query OK, 0 rows affected (0.02 sec)

##### ``` SHOW DATABASES; ```


| Database           |
|:--:|
| Supply             |
| document           |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| test               |

7 rows in set (0.00 sec)

##### ``` USE Supply;```

## AGGREGATE FUNCTIONS 

##### ``` SELECT COUNT(*),COUNT(DISTINCT(city)) FROM suppliers; ```


| COUNT(*) | COUNT(DISTINCT(city)) |
|:--:|:--:|
|        6 |                     4 |

1 row in set (0.00 sec)

##### ``` SELECT MAX(status),MIN(status),SUM(status),AVG(status) FROM suppliers; ```


| MAX(status) | MIN(status) | SUM(status) | AVG(status) |
|:--:|:--:|:--:|:--:|
|          32 |          10 |         106 |     17.6667 |

1 row in set (0.00 sec)

## MySQL Functions

### String Functions 

##### ``` SELECT CHAR(70,80,100), CONCAT("MEENU","12"),LCASE("MEENU"),SUBSTR("MEENU SOWJANYA",3,9),UCASE("Meenu Sowjanya"),TRIM("          MEENU SOWJANYA       "),LENGTH("MEENU SOWJANYA"); ```


| CHAR(70,80,100)                  | CONCAT("MEENU","12") | LCASE("MEENU") | SUBSTR("MEENU SOWJANYA",3,9) | UCASE("Meenu Sowjanya") | TRIM("          MEENU SOWJANYA       ") | LENGTH("MEENU SOWJANYA") |
|:--:|:--:|:--:|:--:|:--:|:--:|:--:|
| 0x465064                         | MEENU12              | meenu          | ENU SOWJA                    | MEENU SOWJANYA          | MEENU SOWJANYA                          |                       14 |

1 row in set (0.00 sec)

### Numeric Functions

##### ``` SELECT MOD(11,4),POW(3,2),ROUND(15.98392,2),SIGN(-15),SQRT(26),TRUNCATE(15.878,0); ```

| MOD(11,4) | POW(3,2) | ROUND(15.98392,2) | SIGN(-15) | SQRT(26)           | TRUNCATE(15.878,0) |
|:--:|:--:|:--:|:--:|:--:|:--:|
|         3 |        9 |             15.98 |        -1 | 5.0990195135927845 |                 15 |

1 row in set (0.00 sec)

### Date and Time Functions

##### ``` SELECT CURDATE(),DATE("2003-09-24 03:05:00"),MONTH("2003-09-24"),YEAR("2003-09-24"),NOW(),SYSDATE(); ```

| CURDATE()  | DATE("2003-09-24 03:05:00") | MONTH("2003-09-24") | YEAR("2003-09-24") | NOW()               | SYSDATE()           |
|:--:|:--:|:--:|:--:|:--:|:--:|
| 2022-02-12 | 2003-09-24                  |                   9 |               2003 | 2022-02-12 11:47:54 | 2022-02-12 11:47:54 |

1 row in set (0.00 sec)

## JOINS

##### ``` SELECT supp.supplier_name,supp.city,ship.quantity_supplied FROM suppliers supp INNER JOIN shipments ship ON ship.supplier_no=supp.supplier_no; ```

| supplier_name | city       | quantity_supplied |
|:--:|:--:|:--:|
| Britannia     | Delhi      |                30 |
| New Bakers    | Bangalore  |                30 |
| Britannia     | Delhi      |                10 |
| Haldiram      | Tamil Nadu |                12 |
| Parle         | Telangana  |                30 |

5 rows in set (0.00 sec)

##### ``` SELECT supp.supplier_name,supp.city,ship.quantity_supplied FROM suppliers supp LEFT JOIN shipments ship ON ship.supplier_no=supp.supplier_no; ```

| supplier_name | city       | quantity_supplied |
|:--:|:--:|:--:|
| Britannia     | Delhi      |                30 |
| Britannia     | Delhi      |                10 |
| New Bakers    | Bangalore  |                30 |
| Cookz         | Delhi      |              NULL |
| Haldiram      | Tamil Nadu |                12 |
| Parle         | Telangana  |                30 |
| Good Day      | Tamil Nadu |              NULL |

7 rows in set (0.00 sec)

##### ``` SELECT supp.supplier_name,supp.city,ship.quantity_supplied FROM suppliers supp RIGHT JOIN shipments ship ON ship.supplier_no=supp.supplier_no; ```

| supplier_name | city       | quantity_supplied |
|:--:|:--:|:--:|
| Britannia     | Delhi      |                30 |
| New Bakers    | Bangalore  |                30 |
| Britannia     | Delhi      |                10 |
| Haldiram      | Tamil Nadu |                12 |
| Parle         | Telangana  |                30 |

5 rows in set (0.00 sec)

##### ``` SELECT supp.supplier_name,supp.city,ship.quantity_supplied FROM suppliers supp CROSS JOIN shipments ship; ```

| supplier_name | city       | quantity_supplied |
|:--:|:--:|:--:|
| Britannia     | Delhi      |                30 |
| Britannia     | Delhi      |                12 |
| Britannia     | Delhi      |                10 |
| Britannia     | Delhi      |                30 |
| Britannia     | Delhi      |                30 |
| New Bakers    | Bangalore  |                30 |
| New Bakers    | Bangalore  |                12 |
| New Bakers    | Bangalore  |                10 |
| New Bakers    | Bangalore  |                30 |
| New Bakers    | Bangalore  |                30 |
| Cookz         | Delhi      |                30 |
| Cookz         | Delhi      |                12 |
| Cookz         | Delhi      |                10 |
| Cookz         | Delhi      |                30 |
| Cookz         | Delhi      |                30 |
| Haldiram      | Tamil Nadu |                30 |
| Haldiram      | Tamil Nadu |                12 |
| Haldiram      | Tamil Nadu |                10 |
| Haldiram      | Tamil Nadu |                30 |
| Haldiram      | Tamil Nadu |                30 |
| Parle         | Telangana  |                30 |
| Parle         | Telangana  |                12 |
| Parle         | Telangana  |                10 |
| Parle         | Telangana  |                30 |
| Parle         | Telangana  |                30 |
| Good Day      | Tamil Nadu |                30 |
| Good Day      | Tamil Nadu |                12 |
| Good Day      | Tamil Nadu |                10 |
| Good Day      | Tamil Nadu |                30 |
| Good Day      | Tamil Nadu |                30 |

30 rows in set (0.00 sec)
