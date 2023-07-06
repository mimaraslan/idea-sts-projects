--  AS    LIKE   IN  BETWEEN
--  MIN    MAX   COUNT   AVG  SUM    bunlar bize tek sonuc getirir.

SELECT * FROM customers;

-- AS   as    Lakap TABLODA
SELECT c.last_name, c.last_name FROM customers AS c;

-- AS kolonda sutunda kullanimi
SELECT  c.age AS yas  FROM customers AS c;

-- AS kisa kullanimi - kolonda sutunda kullanimi
SELECT  c.age yaş, c.country ülke  FROM customers c;

-- En büyük yasi bulma
SELECT MAX(age) FROM customers;

-- En kucuk yasi bulma
SELECT MIN(age) FROM customers;

-- En buyuk ve en kucuk yasi buluyoruz
SELECT MAX(age), MIN(age) FROM customers;

-- En buyuk ve en kucuk yasi buluyoruz ve lakap veriyoruz
SELECT MAX(age) "en büyük", MIN(age) AS  "en küçük"  FROM customers;


-- en kucuk yas
SELECT MIN(age) FROM customers;

-- şart kısmı
SELECT * FROM customers
WHERE age = 19;



-- şart kısmında iç sorgu yazma.
SELECT * FROM customers
WHERE age = (
    SELECT MIN(age) FROM customers
    );


-- EN buyuk yas
SELECT MAX(age) FROM customers;


-- şart kısmında iç sorgu yazma.
SELECT * FROM customers
WHERE age = (
    SELECT MAX(age) FROM customers
);

-- toplam musteri sayisi
SELECT COUNT(*) FROM customers;

-- toplam musteri sayisi lakapli AS
SELECT COUNT(*) AS musteri_sayisi FROM customers;

-- toplam musteri sayisi lakapli
SELECT COUNT(*) musteri_sayisi FROM customers;

-- ülkeye göre listeleme
SELECT * FROM customers
WHERE country = 'TR';


SELECT  count(country) AS ulkesi_TR_olan_kisiler FROM customers
WHERE country = 'TR';

SELECT  count(country) AS ulkesi_DE_olan_kisiler FROM customers
WHERE country = 'DE';


-- tüm ülke sayisini sayiyoruz
SELECT COUNT(country) FROM customers;


-- tekil olarak sayma icin DISTINCT kullaniyoruz
SELECT COUNT(DISTINCT country) FROM customers;

-- ÜLKE ADINA GORE grupladik ve o ülkedeki müsteri sayiyi aldik
SELECT country, COUNT(*) FROM customers
GROUP BY country;

-- müsteri sayisina göre siralama    DESC :  Z -> A   9 -> 0
SELECT country, COUNT(*) AS customer_totals  FROM customers
GROUP BY country
ORDER BY customer_totals DESC;


-- DESC müsteri sayisina ve ASC ülke adina göre siralama    DESC :  Z -> A   9 -> 0
SELECT country, COUNT(*) AS customer_totals  FROM customers
GROUP BY country
ORDER BY customer_totals DESC , country ASC;


-- guruplanmış ülke listesindeki müsteri sayısına göre 2'den çok olan ülkeleri listele
SELECT country, COUNT(*) AS customer_totals FROM customers
GROUP BY country
HAVING COUNT(*)  > 2
ORDER BY customer_totals DESC , country ASC;



-- musterilerin yas toplami
SELECT SUM(age) FROM  customers;


-- musterilerin yas toplami ve yas ortalaması
SELECT MIN(age), MAX(age), SUM(age),  count(age),  AVG(age) FROM  customers;


-- şart kullanıldı
SELECT * FROM customers
WHERE country = 'BR' OR country = 'CA' OR country = 'DE';



-- şart kullanıldı
SELECT * FROM customers
WHERE country IN ('BR', 'CA', 'DE');

-- şart kullanıldı OLUMSUZ DURUM -- NOT
SELECT * FROM customers
WHERE country NOT IN ('BR', 'CA', 'DE');

-- iki şeyi arasını bulduk
SELECT * FROM customers
WHERE age > 18 AND age < 25;

-- iki şeyi arasını bulduk
SELECT * FROM customers
WHERE age BETWEEN 19 AND 24;


-- iki şeyi arasını bulduk
SELECT * FROM customers
WHERE age NOT BETWEEN  19 AND 24;

-- seçilen ülkeye göre listeledik
SELECT * FROM  customers
WHERE country = 'DE';


-- seçilen ülkeye göre listeledik
SELECT * FROM  customers
WHERE country LIKE 'DE';


-- seçilen adi O harfi ile başlayanlari listeledik
SELECT * FROM  customers
WHERE first_name LIKE 'O%';


-- seçilen adinda küçük a harfi onlari listeledik
SELECT * FROM  customers
WHERE first_name LIKE '%a%';



-- seçilen adinda küçük a harfi olmayanlari listeledik
SELECT * FROM  customers
WHERE first_name NOT LIKE '%a%';

-- seçilen adinda  küçük a veya büyük A harfi onlari listeledik
SELECT * FROM  customers
WHERE first_name LIKE '%a%' OR first_name LIKE '%A%';


-- seçilen adinda  küçük a ve büyük A harfi onlari listeledik
SELECT * FROM  customers
WHERE first_name LIKE '%a%' AND first_name LIKE '%A%';

