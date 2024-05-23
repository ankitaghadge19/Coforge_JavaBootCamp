use sakila;
select * from actor;
select last_name from actor;

select title, description, rental_duration, rental_rate, rental_duration * rental_rate as total_renta_cost from film;

select distinct last_name from actor;
select distinct postal_code from address;

-- Prob: select title, description, rating, movie_lenght from film where movie_lenght >= 3 hours
select * from film;
select title, description, rating, length from film where length >=180;

-- Prob: Select the payment id, amount, and payment date columns from the payments table for payments made on or after 05/27/2005.
select * from payment;
SELECT 
    payment_id, 
    amount, 
    payment_date 
FROM 
    payment 
WHERE 
    payment_date >= ('2005-05-27 00:00:00');
    
-- Prob: Select the primary key, amount, and payment date columns from the payment table for payments made on 05/27/2005.
SELECT
payment_Id, amount, payment_date
FROM
payment
WHERE
payment_date >= DATE('2005-05-27 00:00:00') AND payment_date <= DATE('2005-05-28 00:00:00'); 

-- Prob: Select all columns from the customer table for rows that have a last name beginning with "S" and a first name ending with "N".
select * from customer;
SELECT *
FROM customer
WHERE
    last_name LIKE 'S%' 
    AND first_name LIKE '%N';
    
-- Prob: Select all columns from the customer table for rows where the customer is inactive or has a last name ending with "M".
SELECT *
FROM customer
WHERE
    active = 0 
    OR last_name LIKE '%M'; 

-- Prob: select all columns from the payment table for payment made between midnight 05/25/2005 and 1 second before midnight 05/26/2005
SELECT * FROM payment
WHERE payment_date >= '2005-05-25 00:00:00' AND payment_date < '2005-05-26 23:59:59';
