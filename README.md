# &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;```FreshTech App```

<hr>

###### Creation of database - 'FreshTech'

 ```create database FreshTech;```

###### Using database - FreshTech

```use FreshTech;``` 

<hr>

###### Creation of table 1 - 'users'

```create table users(user_id tinyint primary key auto_increment,user_name varchar(20) not null check(length(user_name)>=3),user_mailId varchar(50) not null unique check(user_mailId like("_%@gmail.com")),user_password varchar(15) not null check(validate_password_strength(user_password)=100),join_date date not null);```

<br>

```desc users;```

![describe users](https://user-images.githubusercontent.com/93571047/158520349-7827c435-6bd9-4956-93a6-c7edebde1bfc.png)

###### Insertion of Records into 'users' table

 
 ```insert into users(user_name,user_mailId,user_password,join_date) values("Chitra Muthukumaran","chitram@gmail.com","Chitra@1234","2007/09/24");```

 ```insert into users(user_name,user_mailId,user_password,join_date) values("Revathi Iyer","revathiiyer@gmail.com","Revathi@1234","1998/12/12");```
 
 ```insert into users(user_name,user_mailId,user_password,join_date) values("Prasanna Bharathi","prasannabharathi@gmail.com","Prasanna@1234","2010/12/12");```

 ```insert into users(user_name,user_mailId,user_password,join_date) values("Shyam","shanmugaanantharaman@gmail.com","Shyam@1234","2010/12/12");```

 ```insert into users(user_name,user_mailId,user_password,join_date) values("Deepak Panneerselvam","deepak@gmail.com","Deepak@1234","2021/10/04");```

 ```insert into users(user_name,user_mailId,user_password,join_date) values("Kasi Antony","kasi@gmail.com","Kasi@1234","2021-10-04"),("Keerthana","keerthana@gmail.com","Keerthi@1234","2021-10-04"),("Meenu Sowjanya","msowjanyac@gmail.com","Meenu@1234","2021-10-04");```

 ```insert into users(user_name,user_mailId,user_password,join_date) values("Pavan Raaj","pavan@gmail.com","Pavan@1234","2021-10-04"),("Venkatakkrishnan","venkat@gmail.com","Venki@1234","2021-10-04"),("Vaishnavi","vaishnavi@gmail.com","Vaishnavi@1234","2021-10-04");``` 

###### Fetching the data from 'users' table

 ```select * from users;```

![select * from users](https://user-images.githubusercontent.com/93571047/158520738-970c5a7c-6101-4782-9fff-21187a64e67f.png)

<hr>

###### Creation of table 2 - 'user_contacts'

 ```create table user_contacts(user_id tinyint not null,user_phoneNo bigint check(user_phoneNo like("__________"),foreign key(user_id) references users(user_id));```

``` desc user_contacts; ```

![describe user_contacts](https://user-images.githubusercontent.com/93571047/158522419-65fd18e1-dcf3-4d4c-be52-2f39305027e1.png)

###### Insertion of records into 'user_contacts' table

 ```insert into user_contacts values(1,9442972004);``` 

```insert into user_contacts values(1,9842448168),(2,7402066305),(3,7448354949),(4,7989899993),(4,9087654321),(4,9890988976),(5,9678876901),(6,9345678890),(7,9012345678),(8,9876543210),(9,9654321098),(10,9876900984),(11,7658904554);``` 

###### Fetching the data from 'user_contacts' table

```select * from user_contacts;```

![select * from user_contacts](https://user-images.githubusercontent.com/93571047/158523061-c03243c7-9af9-483d-8ca1-1e62d1cd24cb.png)

<hr>

###### Creation of table 3 - 'user_address'


 ``` create table user_address(user_Id tinyint unique,door_no varchar(10) not null,street varchar(30),city varchar(25) not null,state varchar(25) not null,`pin-code` int check(`pin-code` like("______")),foreign key(user_Id) references users(user_id)) ; ```
 
 ``` desc user_address; ```
 
 ![describe user_address](https://user-images.githubusercontent.com/93571047/158528840-d9e9962d-fdbe-43d1-b17f-e0b241e77efb.png)
 
 
 
 ###### Insertion of records into 'user_address' table
 
 
 
 ```insert into user_address values(1,"L-84","Police Colony","Annanagar (PO)","Trichy",620026);```
 
 ```insert into user_address values(2,"L-84","Police Colony","Annanagar (PO)","Trichy",620026);```
 
 ```insert into user_address values(3,"M-84","Police Colony","Annanagar (PO)","Chennai",620001);```
 
 ```insert into user_address values(4,"M-84","Police Colony","Annanagar (PO)","Chennai",620001),(5,"M-84","Arihant Nagar","Koyambedu (PO)","Chennai",620001),(6,"L-83","Perungudi","Kandanchavadi (PO)","Kanchipuram",620001),(7,"M-84","Police Colony","Kothagiri (PO)","Ooty",620010),(8,"M-84","Duraiappa Colony","Kayalpatinam(PO)","Thootukudi",620007),(9,"G-84","Collector Office Street","Avinasi (PO)","Tirupur",620009),(10,"P-84","Saibaba Colony","Boothamangalam (PO)","Coimbatore",620067),(11,"O-84","Police Colony","Perumangalam (PO)","Pondichery",620020);```
 
 
 
 ###### Fetching the data from 'user_address' table
 
 ```select * from user_address;```
 
 ![select * from user_address](https://user-images.githubusercontent.com/93571047/158529465-b14406e4-1506-4848-8b0b-adbab59892c7.png)
 
 <hr>
 
 ###### Creation of table 4 - 'students'
 
 ```create table students(student_id tinyint unique,gender enum("M","F") not null,qualification enum("12th","Diploma") not null,batch tinyint not null,dob date not null,foreign key(student_id) references users(user_id));```
 
 <br>
 
 ```desc students;```
 
 ![describe students](https://user-images.githubusercontent.com/93571047/158530533-91c75946-d1be-423d-bd92-b3c88bc384be.png)
 
 ###### Insertion of records into 'students' table
 
 ```insert into students values(5,"M","Diploma","02","2001-09-04"),(6,"M","12th","02","2003-11-04"),(7,"F","12th","02","2000-01-23"),(8,"F","12th","02","2003-09-23"),(9,"M","12th","02","2003-08-23"),(10,"M","12th","02","2004-04-23"),(11,"F","12th","02","2003-07-23");```
 
 ###### Fetching data from 'students' table 
 
 ```select * from students;```
 
 ![select * from students](https://user-images.githubusercontent.com/93571047/158531605-b21bf5e8-7035-47a2-b68a-ad23bd26ca3d.png)
 
 <hr>
 
 ###### Creation of table 5 - 'admins'
 
 ```create table admins(admin_id tinyint unique,gender enum("M","F") not null,`specialised in` enum("ELS","Technical","L&D","Admin") not null,dob date not null,foreign key(admin_id) references users(user_id));```
 
 <br>
 
 ```desc admins;```
 
 ![describe admins](https://user-images.githubusercontent.com/93571047/158532691-e4ea5e5f-4c59-44c5-9fe3-a475876133b9.png)
 
 ###### Inserton of records into 'admins' table
 
 ```insert into admins values(1,"F","Technical","1990-10-23"),(2,"F","ELS","1960-01-02"),(3,"F","L&D","1994-03-24"),(4,"M","Admin","1984-01-26");```
 
 ###### Fetching the data from 'admins' table
 
 ![select * from admins](https://user-images.githubusercontent.com/93571047/158533132-4a6fca67-6565-4a3e-9bad-0788df063ce2.png)
 
 <hr>
