CREATE DATABASE TravelBookingSystem;

USE TravelBookingSystem;

create table USER (name varchar(50), emailId varchar(50) not null, password varchar(30) not null, PRIMARY KEY(emailId));
select * from USER;
drop table USER;
drop table bookings;
drop table bookings;
desc user;

select * from user;
select * from bookings;

delete from user where emailId="james@gmail.com";