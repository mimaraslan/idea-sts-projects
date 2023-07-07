--  SQL (INNER JOIN, LEFT JOIN RIGHT JOIN, FULL OUTER JOIN) UNION 

SELECT * FROM customers;


SELECT * FROM orders;


SELECT * FROM shippings;

/*
SELECT KOLONLAR
FROM TABLO1_A
JOIN TABLO2_B
ON ŞART
*/

-- Bütün kolonları(sütünları) dahil etti. Bu babadan kalma , klasik join'dir
SELECT *
FROM customers
JOIN orders
ON orders.customer_id = customers.customer_id;

SELECT *
FROM customers
INNER JOIN orders
ON orders.customer_id = customers.customer_id;

SELECT customers.customer_id, customers.first_name, customers.last_name,     orders.item, orders.amount, orders.customer_id
FROM customers
INNER JOIN orders
ON orders.customer_id = customers.customer_id;


SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers AS c
INNER JOIN orders AS o
ON o.customer_id = c.customer_id;

SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
INNER JOIN orders o
ON o.customer_id = c.customer_id;


SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
LEFT JOIN orders o
ON o.customer_id = c.customer_id;



SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
RIGHT JOIN orders o
ON o.customer_id = c.customer_id;



SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
RIGHT JOIN orders o
ON o.customer_id = c.customer_id
WHERE o.amount >500;



SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
LEFT JOIN orders o
ON o.customer_id = c.customer_id
WHERE o.amount >500;


SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
FULL OUTER JOIN orders o
ON c.customer_id = o.customer_id;