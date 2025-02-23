create database MediCare;
use MediCare;
create table patient (
idPatient int auto_increment primary key,
userName varchar(100) not null,
email  varchar(100) not null,
phoneNumber varchar(30) not null
);

create table doctor (
idDoctor int auto_increment primary key,
doctorFirstName varchar(30),
doctorLastName varchar(40),
speciality varchar(100)
);
drop table patient;