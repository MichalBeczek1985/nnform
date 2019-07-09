create table contacts
(
	id integer auto_increment not null,
	name varchar(50) not null,
	surname varchar(50) not null,
	mail varchar(70),
	phone varchar(9),
	address varchar(200),
	contactReason varchar(2000),
	primary key(id)
);