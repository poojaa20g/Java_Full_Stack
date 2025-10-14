-- day1 --
create database Poojaa;
show databases;
use Poojaa;

-- ddl commands --
-- create table --
create table employee(id int primary key auto_increment, ename varchar(100), salary int, br_id int, constraint fk_br foreign key(br_id) references branch(br_id) );
desc employee;
show tables;
drop table employee;

-- alter table --
alter table employee add column job_desc varchar(50) after ename;
desc employee;
alter table employee add column department varchar(50);
desc employee;

-- drop column using alter table --
alter table employee drop column department;
desc employee;

-- drop tables --
create table employee1(id int primary key auto_increment, ename varchar(100), salary int );
show tables;
drop table employee1;
show tables;
show table status;

-- dml commands --

-- insert --
insert into employee(ename,salary) values ('Arjun',100000),('Krishna',200000),('Murugan',300000),('shiva',400000),('Ganesh',500000);
desc employee;

-- select --
select * from employee;





