drop database if exists student_management;
create database student_management;
use student_management;

create table student(
student_id int primary key,
student_name varchar(45),
age int,
country varchar(45));

create table class(
class_id int primary key,
class_name varchar(45));

create table teacher(
teacher_id int primary key,
teacher_name varchar(45),
age int,
country varchar(45));