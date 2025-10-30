use poojaa;
show tables;
select user from mysql.user;

-- create user --
create user 'testuser'@'localhost' identified by 'password123';

-- grant access for select --
grant select on employee to 'testuser'@'localhost';

-- deny access --
revoke select on employee from 'testuser'@'localhost';