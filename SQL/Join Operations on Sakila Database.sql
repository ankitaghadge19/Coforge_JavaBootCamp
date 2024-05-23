use coforgedata;

-- Joins

create table table1(pk int primary key not null, value varchar(20));
create table table2(pk int primary key not null, value varchar(20));

insert into table1 (pk,value) values(1,'FOX'),(2,'COP'),(3,'TAXI'),(6,'WASHINGTON'),(8,'DELL'),(10,'Arizona');
insert into table2 (pk,value) values(1,'trot'),(2,'cab'),(3,'car'),(6,'pc'),(9,'monument'),(7,'apple'),(11,'USA');
select * from table1;
select * from table2;

select * from table1 left join table2 on table1.pk = table2.pk;

use sakila;

-- 1) Select all columns minus the password column from the staff table for rows that do not contain a password.
select * from staff;
SELECT * FROM staff
WHERE password IS NULL OR password = '';

-- 2) Select the phone and district columns from the address table for addresses in California, England, Taipei, or West Java.
select * from address;
SELECT phone, district
FROM address
WHERE district IN ('California', 'England', 'Taipei', 'West Java');

-- 3) Select the payment id, amount, and payment date columns from the payment table for payments made on 05/25/2005, 05/27/2005, and 05/29/2005.
SELECT payment_id, amount, payment_date
FROM payment
WHERE DATE(payment_date) IN ('2005-05-25', '2005-05-27', '2005-05-29');

-- 4) Select all columns from the film table for films rated G, PG-13 or NC-17
select * from film;
SELECT * from film where rating IN ('G', 'PG-13', 'NC-17');

-- 5) Select the title, description, special features, length, and rental duration columns from the film table for the first 10 films with behind the scenes footage under 2 hours in length and a rental duration between 5 and 7 days, ordered by length in descending order
select * from film;
SELECT title, description, special_features, length, rental_duration
FROM film
WHERE special_features LIKE '%Behind the Scenes%'
  AND length < 120
  AND rental_duration BETWEEN 5 AND 7
ORDER BY length DESC
LIMIT 10;

-- 6) Select the payment date and amount columns from the payment table for the first 20 payments ordered by payment amount in descending order.
select * from payment;
SELECT payment_date, amount
FROM payment
ORDER BY amount DESC
LIMIT 20;

-- 7) Select customer first_name/last_name and actor first_name/last_name columns from performing a left join between the customer and actor column on the last_name column in each table. (i.e. `customer.last_name = actor.last_name`) # Label customer first_name/last_name columns as customer_first_name/customer_last_name # Label actor first_name/last_name columns in a similar fashion.
SELECT 
    customer.first_name AS customer_first_name, 
    customer.last_name AS customer_last_name, 
    actor.first_name AS actor_first_name, 
    actor.last_name AS actor_last_name
FROM customer
LEFT JOIN actor ON customer.last_name = actor.last_name;

-- 8) Select the customer first_name/last_name and actor first_name/last_name columns from performing a right join between the customer and actor column on the last_name column in each table. (i.e. `customer.last_name = actor.last_name`)
SELECT 
    customer.first_name AS customer_first_name, 
    customer.last_name AS customer_last_name, 
    actor.first_name AS actor_first_name, 
    actor.last_name AS actor_last_name
FROM customer
RIGHT JOIN actor ON customer.last_name = actor.last_name;

-- 9) Select the customer first_name/last_name and actor first_name/last_name columns from performing an inner join between the customer and actor column on the last_name column in each table. (i.e. `customer.last_name = actor.last_name`)
SELECT 
    customer.first_name AS customer_first_name, 
    customer.last_name AS customer_last_name, 
    actor.first_name AS actor_first_name, 
    actor.last_name AS actor_last_name
FROM customer
INNER JOIN actor ON customer.last_name = actor.last_name;

-- 10) Select the city name and country name columns from the city table, performing a left join with the country table to get the country name column    
select * from city;
select * from country;
SELECT city.city, country.country
FROM city
LEFT JOIN country ON city.country_id = country.country_id;

-- 11) Select the title, description, release year, and language name columns from the film table, performing a left join with the language table to get the "language" column. # Label the language.name column as "language" (e.g. `select language.name as language`)
select * from language;
select * from film;
SELECT film.title, film.description, film.release_year, language.name AS language
FROM film
LEFT JOIN language ON film.language_id = language.language_id;

-- 12) Select the first_name, last_name, address, address2, city name, district, and postal code columns from the staff table, performing 2 left joins with the address table then the city table to get the address and city related columns.
select * from staff;
select * from address;
select * from city;
SELECT 
    staff.first_name, 
    staff.last_name, 
    address.address, 
    address.address2, 
    city.city, 
    address.district, 
    address.postal_code
FROM staff
LEFT JOIN address ON staff.address_id = address.address_id
LEFT JOIN city ON address.city_id = city.city_id;


