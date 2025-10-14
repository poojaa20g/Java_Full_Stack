use poojaa;
show tables;
desc employee;
select * from branch;
select * from employee;
truncate branch;
truncate employee;
drop table branch;
create table branch(br_id int primary key auto_increment,br_name varchar(50),address varchar(50));
insert into branch(br_name,address)values("Mumbai","A block"),("Delhi","B Block"),("Chennai","C Block"),("Chennai","D Block");

-- day4 --
-- functions --

select avg(salary) from employee where job_desc="Manager";
select sum(salary) from employee;
select ucase(ename), salary from employee;
select char_length(ename) from employee;
select ename,concat("Rs.",salary) from employee;
select ename,concat("Rs.",format(salary,0)) from employee;

-- union(remove duplicates) and union all(display with duplicates) --
select id from employee
union 
select br_name from branch;

-- view --
create view empview as select ename from employee;
select * from empview;
use poojaa;
CREATE VIEW empNames AS
SELECT id, ename
FROM employee
ORDER BY ename;
show Full tables  where table_type like "%VIEW";








