SELECT * FROM customers
WHERE country = 'DE';
select * FROM customers;

-- Ulkesi Almanya olmayanlar
SELECT * FROM customers WHERE NOT country = 'DE';

-- Ulkelerin isimlerini tek olarak listeleyelim.
SELECT DISTINCT country FROM customers;


-- yası 25 ten buyuk olanlari goster.

SELECT * FROM customers
WHERE age > 25;

-- Ulkelerin isimlerini unique tek olarak listeleyelim ve sayilarini da gosterelim
SELECT COUNT (DISTINCT country) FROM customers;

-- Alias (lakap takmak)
SELECT customer_id AS cus_id FROM customers;

-- Alias (lakap takmak)
SELECT customer_id AS c_id, first_name AS f_name FROM customers;

-- Alias (lakap takmak)
SELECT customer_id id, first_name f FROM customers;

SELECT c.customer_id , c.first_name FROM customers c;

SELECT CONCAT(first_name, ' ', last_name) AS userName FROM customers;
SELECT CONCAT(first_name, ' ', last_name) userName FROM customers;


-- tabloya yeni bir kayıt ekleyelim.
INSERT INTO customers(first_name, last_name, phone, country, age)
VALUES ('AAA', 'BBB', '111', 'TR', 25);

SELECT * FROM customers;


INSERT INTO customers(first_name, last_name, phone, country, age)
VALUES ('CCC', 'BBB', '111', 'TR', 32),
('DDD', 'BBB', '111', 'TR', 52),
('EEE', 'BBB', '111', 'TR', 25);

SELECT * FROM customers;

-- SAKIN BOYLE ID DEGERI BELIRTILMEYEN UPDATE YAP - MA - YIN.
/*
 UPDATE customers
 SET age = 34;
*/

-- gunceleme edit update once id degerini belirtmemiz lazim     ŞART customer_id =6
UPDATE customers
SET age = 28
WHERE customer_id = 6 ;

SELECT * FROM customers
WHERE customer_id = 6 ;


UPDATE customers
SET age = 33
WHERE customer_id = 1 ;

SELECT * FROM customers
WHERE customer_id = 1 ;

-- id değeri 16'dan büyük olan kişilerin ülke kodlarını Polonya PL
UPDATE customers
SET country = 'PL'
WHERE customer_id > 16;  -- WHERE customer_id >= 17;  

SELECT * FROM customers;

-- silme işleminde MUTLAKA SİLİNECEK KAYDIN ID DEGERİNİ SEÇİNİZ.
-- DELETE FROM customers; --  SAKIN BUNU ÇALIŞTIRMAYIN!!!! BU TABLOADAKİ TÜM VERİLERİNİZİ SİLER. 

-- id değeri 16 olan kaydı silelim.
DELETE FROM customers
WHERE customer_id = 16;

SELECT * FROM customers;

-- id değeri 17 olan kaydı silelim.
DELETE FROM customers
WHERE customer_id = 17;

SELECT * FROM customers;


-- DİKKAT!!!! Tabloyu fabrika cikisi hale getirir. Her şeyi SIFIRlar.
-- TRUNCATE TABLE customers;


-- ASC varsayılan değerdir. A'dan Z'ye siralama için -  0'dan 9'a sıralama 
SELECT * FROM customers 
ORDER BY first_name;
-- ORDER BY first_name ASC;

-- ASC 0'da 9'a göre siralama
SELECT * FROM customers 
ORDER BY age;

-- siralama birden fazla durumu dikkate alarak    ASC
SELECT * FROM customers 
ORDER BY country, age;





-- DESC  Z'den A'ya siralama için -  9'dan 0'a sıralama 
SELECT * FROM customers 
ORDER BY first_name DESC;

-- ASC 9'dan 0'a sıralama 
SELECT * FROM customers 
ORDER BY age DESC;

-- Tersten siralama birden fazla durumu dikkate alarak    DESC
SELECT * FROM customers 
ORDER BY country DESC, age DESC;

-- ülke kolonunu seçtik.
SELECT country FROM customers;

-- ÜLKE adi (kisi sayisi)  Gruplamalarda 1 kolonu seçiniz.
SELECT country,  COUNT(*) AS numbers FROM customers
GROUP BY country;


-- grubun şartı HAVING
SELECT country,  COUNT(*) AS numbers FROM customers
-- WHERE age > 23
GROUP BY country
HAVING country = 'TR';

SELECT * FROM customers
WHERE country = 'TR';


