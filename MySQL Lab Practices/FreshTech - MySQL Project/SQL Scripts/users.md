<hr>

# 'users' table

<br>

###### Creation of table  - 'users'

```
create table users(user_id tinyint primary key auto_increment,user_name varchar(20) not null check(length(user_name)>=3),user_mailId varchar(50) not null unique check(user_mailId like("_%@gmail.com")),user_password varchar(15) not null check(validate_password_strength(user_password)=100),join_date date not null);
```

###### Describing the 'users' table

```
desc users;
```

![describe users](https://user-images.githubusercontent.com/93571047/158520349-7827c435-6bd9-4956-93a6-c7edebde1bfc.png)


###### Insertion of Records into 'users' table

 
 ```
 insert into users(user_name,user_mailId,user_password,join_date) values("Chitra Muthukumaran","chitram@gmail.com","Chitra@1234","2007/09/24");
 ```
 
 ```
 insert into users(user_name,user_mailId,user_password,join_date) values("Pavan Raaj","pavan@gmail.com","Pavan@1234","2021-10-04"),("Venkatakkrishnan","venkat@gmail.com","Venki@1234","2021-10-04"),("Vaishnavi","vaishnavi@gmail.com","Vaishnavi@1234","2021-10-04");
 ``` 

###### Updating records of 'users' table

```
update users set join_date="2009/09/24" where id=1;
```

###### Deleting records of 'users' table

```
delete from users where id between 1 and 4;
```

###### Fetching the data from 'users' table

 ```
 select user_id,user_name,user_mailId,user_password,join_date from users;
 ```
 
###### Dropping the table - 'users'

```
drop table users;
```
