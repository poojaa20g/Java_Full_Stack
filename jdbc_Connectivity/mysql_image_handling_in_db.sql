use poojaa;
show tables;
create table image_table(i_id int primary key auto_increment, image_date longblob not null, upload_data timestamp default current_timestamp);
