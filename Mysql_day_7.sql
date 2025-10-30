use poojaa;
show tables;
select * from employee;
start transaction;
insert into employee (ename, job_desc, salary, br_id) values ('Nivish', 'Analyst', 100000, 2);
savepoint before_update;
update employee set salary = 500000 where id = 17;
rollback to before_update;
commit;
