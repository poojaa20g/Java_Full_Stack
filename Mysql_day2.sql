-- day2 --


show tables;
desc employee;

-- like commands --
select * from employee where ename like 'A%';
select * from employee where ename like '__J%';
select * from employee where ename like 'K%A';
select * from employee where ename like '%I%';
select * from employee where ename like 'A\%';
