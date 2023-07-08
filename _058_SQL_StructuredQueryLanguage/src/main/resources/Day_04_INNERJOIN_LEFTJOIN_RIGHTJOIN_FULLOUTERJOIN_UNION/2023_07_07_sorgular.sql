--  SQL (INNER JOIN, LEFT JOIN RIGHT JOIN, FULL OUTER JOIN) UNION 

-- tüm müşretriler
SELECT * FROM customers;



--müşterilerin tüm siparişleri
SELECT * FROM orders;


--müşterilerin tüm kargolari
SELECT * FROM shippings;


-- Join  sorgu yapisi
/*
SELECT KOLONLAR
FROM TABLO1_A
JOIN TABLO2_B
ON ŞART
*/

-- Bütün kolonları(sütünları) dahil etti. Bu babadan kalma , klasik join'dir.
-- Soldaki tablo customers   sağdaki tablo  orders
-- JOIN iki tablonun kesişimini verir.
SELECT *
FROM customers
JOIN orders
ON orders.customer_id = customers.customer_id;


-- Normal JOIN ile INNER JOIN aynı çıktı sonucunu verir.
-- Soldaki tablo customers   sağdaki tablo  orders
-- INNER JOIN iki tablonun kesişimini verir.
SELECT *
FROM customers
INNER JOIN orders
ON orders.customer_id = customers.customer_id;


-- Bazı kolonları seçtik.
-- Soldaki tablo customers   sağdaki tablo  orders
-- INNER JOIN iki tablonun kesişimini verir.
SELECT customers.customer_id, customers.first_name, customers.last_name,     orders.item, orders.amount, orders.customer_id
FROM customers
INNER JOIN orders
ON orders.customer_id = customers.customer_id;


-- AS ile lakap kullandık ve bazı kolonları seçtik.
-- Soldaki tablo customers   sağdaki tablo  orders
-- INNER JOIN iki tablonun kesişimini verir.
SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers AS c
INNER JOIN orders AS o
ON o.customer_id = c.customer_id;


-- AS sözcüğünü silip öyle lakap kullandık ve bazı kolonları seçtik.
-- INNER JOIN iki tablonun kesişimini verir.
SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
INNER JOIN orders o
ON o.customer_id = c.customer_id;


-- AS sözcüğünü silip öyle lakap kullandık ve bazı kolonları seçtik.
-- Soldaki tablo customers   sağdaki tablo  orders
-- LEFT JOIN soldaki tabolunun tamamini ciktiya dahil eder. Sağdaki tablodan da kesişimin içinde olanlari sadece alır.
SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
LEFT JOIN orders o
ON o.customer_id = c.customer_id;


-- AS sözcüğünü silip öyle lakap kullandık ve bazı kolonları seçtik.
-- Soldaki tablo customers   sağdaki tablo  orders
-- RIGHT JOIN sağdaki tabolunun tamamini çıktıya dahil eder. Soldaki tablodan da kesişimin içinde olanlari sadece alır.
SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
RIGHT JOIN orders o
ON o.customer_id = c.customer_id;

-- AS sözcüğünü sildik ve öyle lakap kullandık. Bazı kolonları seçtik.
-- Soldaki tablo customers   sağdaki tablo  orders
-- RIGHT JOIN sağdaki tabolunun tamamini çıktıya dahil eder. Soldaki tablodan da kesişimin içinde olanlari sadece alır.
SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
RIGHT JOIN orders o
ON o.customer_id = c.customer_id
WHERE o.amount >500;


-- AS sözcüğünü silip öyle lakap kullandık ve bazı kolonları seçtik.
-- Soldaki tablo customers   sağdaki tablo  orders
-- LEFT JOIN soldaki tabolunun tamamini ciktiya dahil eder. Sağdaki tablodan da kesişimin içinde olanlari sadece alır.
-- WHERE ile bir şart ekledik.
SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
LEFT JOIN orders o
ON o.customer_id = c.customer_id
WHERE o.amount >500;



-- Soldaki tablo: customers  -  sağdaki tablo:  orders
-- FULL OUTER JOIN ile soldaki ve sağdaki tablolardaki tüm kayitlari birleştirdik.
-- ON kismi JOIN için şart kısmıdır.
-- ON kisminda c.customer_id = o.customer_id  ya da o.customer_id = c.customer_id  gibi yazmak aynı şeydir.
SELECT c.customer_id, c.first_name, c.last_name,     o.item, o.amount, o.customer_id
FROM customers c
FULL OUTER JOIN orders o
ON c.customer_id = o.customer_id;