REM   Script: SQL - Activity2
REM   Activity 2

CREATE TABLE salesman( 
    salesman_id int, 
    salesman_name varchar2(20), 
    salesman_city varchar2(20), 
    commission int 
    );

DESCRIBE salesman


INSERT INTO salesman 
-- Single row 
VALUES (5001, 'James Hoog', 'New York', 15);

SELECT * from salesman;

INSERT INTO salesman 
-- Single row 
VALUES (5004, 'Chris Evans', 'Boston', 11);

INSERT ALL 
INTO salesman VALUES (5002, 'Nail Knite', 'Paris', 13) 
INTO salesman VALUES (5005, 'Pit Alex', 'London', 11) 
INTO salesman VALUES (5006, 'McLyon', 'Paris', 14) 
INTO salesman VALUES (5007, 'Paul Adam', 'Rome', 13) 
INTO salesman VALUES (5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * from salesman;

