create table tb_doctors(

    id bigint not null auto_increment,
    name varchar(100) not null,
    email varchar(100) not null unique,
    crm varchar(6) not null unique,
    specialty varchar(100) not null,
    street_name varchar(100) not null,
    neighborhood varchar(100) not null,
    post_code varchar(9) not null,
    complement varchar(100),
    number varchar(20),
    fu char(2) not null,
    city varchar(100) not null,

    primary key(id)

);