REM   Script: SQL - Activity 5
REM   Update statements

CREATE TABLE salesman(  
    salesman_id int,  
    salesman_name varchar2(20),  
    salesman_city varchar2(20),  
    commission int  
    );

INSERT INTO salesman  
-- Single row  
VALUES (5001, 'James Hoog', 'New York', 15);

INSERT ALL  
-- Multiple inserts 
INTO salesman VALUES (5002, 'Nail Knite', 'Paris', 13)  
INTO salesman VALUES (5005, 'Pit Alex', 'London', 11)  
INTO salesman VALUES (5006, 'McLyon', 'Paris', 14)  
INTO salesman VALUES (5007, 'Paul Adam', 'Rome', 13)  
INTO salesman VALUES (5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

INSERT INTO salesman  
-- Single row  
VALUES (5004, 'Chris Evans', 'Boston', 11);

SELECT * from salesman;

alter table salesman  
add grade int;

Update salesman 
    set grade = 100;

select * from salesman;

update salesman  
    set grade = 200 where salesman_city = 'Rome';

update salesman 
    set grade = 300 where salesman_name = 'James Hoog';

update salesman 
    set salesman_name = 'Pierre' where salesman_name = 'McLyon';

select * from salesman;


