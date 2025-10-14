-- day3 --
show tables;
desc employee;
insert into employee(ename,job_desc,salary,br_id) values ('Sameer','HR',100000,1),('Parvathi','CEO',200000,1),('Shima','HR',300000,2),('Ajith','Manager',400000,2),('Muthu','Admin',500000,1);
select * from employee;

-- update command --
update employee set job_desc="Analyst", br_id=3 where ename = "Arjun";
update employee set job_desc="HR", br_id=3  where ename = "Krishna";
update employee set job_desc="CEO", br_id=2 where ename = "Murugan";
update employee set job_desc="Admin", br_id=1 where ename = "Shiva";
update employee set job_desc="Manager", br_id=1 where ename = "Ganesh";

-- distinct command that display unique values --
select distinct job_desc from employee;

-- order by --
select * from employee order by salary;
select * from employee order by job_desc, salary;
-- customized order --
select * from employee order by (case job_desc when 'Analyst' then 1 when 'HR' then 3 else 2 end);

--  Questions --
select * from employee;
-- 1 --
select * from employee order by ename;
-- 2 --
select * from employee order by salary desc limit 3;
-- 3 --
select * from employee where job_desc='Manager';
-- 4 --
select * from employee where ename like 'A%';
-- 5 --
select * from employee where salary in (select max(salary) from employee);
select * from employee where salary in (select min(salary) from employee);
-- 6 --
select job_desc , count(*) as count_as_per_job_desc from employee group by job_desc;
-- 7 --
select job_desc, count(ename) as count from employee group by job_desc having count < 4 order by job_desc; 

