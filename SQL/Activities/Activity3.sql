REM   Script: SQL - Activity3
REM   Activity 3

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

INSERT ALL 
INTO VALUES (5002, 'Nail Knite', 'Paris', 13) 
INTO VALUES (5005, 'Pit Alex', 'London', 11) 
INTO VALUES (5006, 'McLyon', 'Paris', 14) 
INTO VALUES (5007, 'Paul Adam', 'Rome', 13) 
INTO VALUES (5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

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

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city= 'Paris';

select salesman_id, commission from salesman where salesman_name= 'Paul Adam';

