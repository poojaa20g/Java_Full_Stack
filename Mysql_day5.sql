-- day 5 --
-- stored procedure --
select * from branch;
-- display all values --
delimiter $$
create procedure getemployee()
begin
desc employee;
select * from employee;
end $$
delimiter ;
call getemployee();

-- insert the data --
delimiter $$
create procedure getemployee_insert( in p_emp_name varchar(50), in p_emp_salary int)
begin
insert into employee(ename, salary)values(p_emp_name, p_emp_salary);
end $$
delimiter ;
call getemployee_insert("Radha", 500000);

-- update the data --
delimiter $$
create procedure getemployee_update(in p_emp_job_desc varchar(50), in p_emp_br_id int, in p_emp_id int)
begin
update employee set job_desc=p_emp_job_desc, br_id=p_emp_br_id where id=p_emp_id;
end $$
delimiter ;
call getemployee_update("CEO", 3,11);

-- drop procedure --
 drop procedure getemployee_update;
 
 -- joins --
select e.id, e.ename, e.job_desc, b.br_name from employee e inner join branch b on e.br_id = b.br_id order by id;
select e.id, e.ename, e.job_desc, b.br_name from employee e left join branch b on e.br_id = b.br_id order by id;
select e.id, e.ename, b.br_name, b.address from employee e right join branch b on e.br_id = b.br_id order by id;
select e.id, e.ename, e.job_desc, b.br_name, b.br_id, b.address from employee e cross join branch b on e.br_id = b.br_id order by id;

-- on delete ( to delete the data in the foreign key tables) --
-- set null --
drop table course;
drop table student;
create table course (c_id int primary key auto_increment, c_name varchar(50));
insert into course (c_name) values("CSE"),("IT"),("AI"),("CS"),("Robotics");
insert into student (c_id) values(1),(7),(3),(2),(5);
create table student (s_id int primary key auto_increment, c_id int, constraint fk_cr foreign key(c_id) references course(c_id) on delete set null);

insert into student (c_id)values(1);

insert into student(c_id) values(3),(4);

desc student;
select * from course;
select * from student;
delete from course where c_id= 3;