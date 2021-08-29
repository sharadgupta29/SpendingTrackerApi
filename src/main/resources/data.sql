
Insert into category(id,name,add_date_time,update_date_time) values (1001,'Soap',sysdate(),sysdate());
Insert into category(id,name,add_date_time,update_date_time) values (1002,'Sugar',sysdate(),sysdate());
Insert into category(id,name,add_date_time,update_date_time) values (1003,'Salt',sysdate(),sysdate());
Insert into category(id,name,add_date_time,update_date_time) values (1004,'Facewash',sysdate(),sysdate());
Insert into category(id,name,add_date_time,update_date_time) values (1005,'Shampoo',sysdate(),sysdate());
Insert into category(id,name,add_date_time,update_date_time) values (1006,'Facegel',sysdate(),sysdate());

insert into expense(id, add_date_time, amount, purchase_date, update_date_time,category_id) 
values(5001,sysdate(),150,'2021-04-01',sysdate(),1001);

insert into expense(id, add_date_time, amount, purchase_date, update_date_time,category_id)
values(5002,sysdate(),150,'2021-05-01',sysdate(),1002);

insert into expense(id, add_date_time, amount, purchase_date, update_date_time,category_id)
values(5003,sysdate(),150,'2021-06-01',sysdate(),1003);

insert into expense(id, add_date_time, amount, purchase_date, update_date_time,category_id)
values(5004,sysdate(),150,'2021-07-01',sysdate(),1004);