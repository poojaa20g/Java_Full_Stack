show databases;
use poojaa;

-- grant to select to employee table --
select * from employee;

-- no grant access --
select * from branch;

-- select access denied from employee table it shows error --
select * from employee;