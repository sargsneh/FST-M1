REM   Script: SQL - Activity 8
REM   Aggregate functions with group by

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

	select sum(purchase_amount) as "Total purchase amount" from orders;

	select avg(purchase_amount) as "Average purchase" from orders;

	select max(purchase_amount) as "Maximum purchase amount" from orders;

	select min(purchase_amount) as "Minimum purchase amount" from orders;

	select count(salesman_id) as "Number of salesmen" from orders;

	select customer_id, max(purchase_amount) as "Max Amount" from orders group by customer_id;

	select order_date, salesman_id, max(purchase_amount) as "Max amount" from orders where order_date = to_date('2012-08-17', 'YYYY/MM/DD') group by salesman_id, order_date;

	select customer_id, order_date, max(purchase_amount) as "Max Amount" from orders gorup by customer_id, order_date having max(purchase_amount) IN (2030, 3450, 5760, 6000);

	select customer_id, max(purchase_amount) as "Max Amount" from orders group by customer_id;

	select order_date, salesman_id, max(purchase_amount) as "Max amount" from orders where order_date = to_date('2012-08-17', 'YYYY/MM/DD') group by salesman_id, order_date;

	select customer_id, order_date, max(purchase_amount) as "Max Amount" from orders group by customer_id, order_date having max(purchase_amount) IN (2030, 3450, 5760, 6000);

