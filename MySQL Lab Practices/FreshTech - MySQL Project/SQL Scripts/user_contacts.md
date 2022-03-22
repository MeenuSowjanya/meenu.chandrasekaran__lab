<hr>

# 'user_contacts' table

<br>

###### Creation of table - 'user_contacts'

 ```
 create table user_contacts(user_id tinyint not null,user_phoneNo bigint check(user_phoneNo like("__________"),foreign key(user_id) references users(user_id));
 ```

###### Describing table - 'user_contacts'

```
desc user_contacts; 
```

![describe user_contacts](https://user-images.githubusercontent.com/93571047/158522419-65fd18e1-dcf3-4d4c-be52-2f39305027e1.png)

###### Insertion of records into 'user_contacts' table

 ```
 insert into user_contacts values(1,9442972004);
 ``` 

```
insert into user_contacts values(1,9842448168),(2,7402066305),(3,7448354949),(4,7989899993),(4,9087654321),(4,9890988976),(5,9678876901),(6,9345678890),(7,9012345678),(8,9876543210),(9,9654321098),(10,9876900984),(11,7658904554);
``` 

###### Updating records of 'user_contacts' table

```
update user_contacts set id=12 where id=11;
```

###### Deleting records from 'user_contacts' table

```
delete from user_contacts where user_name like("P__%");
```

###### Fetching the data from 'user_contacts' table

```
select user_id,user_phoneNo from user_contacts;
```

###### Truncating the table - 'user_contacts'

```
truncate table user_contacts;
```

###### Altering the table - 'user_contacts'

```
alter table user_contacts modify user_id smallint;
```

###### Dropping the table - 'user_contacts'

```
drop table user_contacts;
```
