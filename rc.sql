create database rc;
use rc;

create table rc_admin(
	adm_id int auto_increment primary key,
	adm_name varchar(50),
	adm_pwd varchar(50)
);

create table rc_company(
	com_id int auto_increment primary key,
	com_userName varchar(50) not null,
	com_pwd varchar(50) not null,
	com_name varchar(200),
	com_type varchar(50),
	com_createTime varchar(50),
	com_contactor varchar(50),
	com_empNum int default 0,
	com_tel varchar(50),
	com_fax varchar(50),
	com_addr varchar(200),
	com_zip varchar(10),
	com_homepage varchar(200),
	com_email varchar(200),
	com_desc text,
	com_postTime timestamp
);

create table rc_person(
	per_id int auto_increment primary key,
	per_userName varchar(50) not null,
	per_pwd varchar(50) not null,
	per_realName varchar(50) not null,
	per_sex varchar(2),
	per_birthDate varchar(50),
	per_IDCard varchar(20),
	per_nature varchar(20),
	per_married varchar(10),
	per_regResidence varchar(200),
	per_education varchar(200),
	per_school varchar(200),
	per_tel varchar(50),
	per_email varchar(200),
	per_addr varchar(200),
	per_pic varchar(200),
	per_resume text,
	per_jobTarget varchar(254),
	per_postTime timestamp
);

create table rc_job(
	job_id int auto_increment primary key,
	com_id int not null references rc_company(com_id),
	job_title varchar(200),
	job_type varchar(50),
	job_education varchar(200),
	job_sex varchar(50),
	job_age varchar(50),
	job_workTime varchar(50),
	job_workPlace varchar(200),
	job_num int default 1,
	job_endTime varchar(50),
	job_comment text,
	job_postTime timestamp
);

create table rc_application(
	app_id int auto_increment primary key,
	job_id int not null references rc_job(job_id),
	per_id int not null references rc_person(per_id),
	app_postTime timestamp,
	app_response text,
	app_rspTime varchar(50)
);

create table rc_news(
	news_id int auto_increment primary key,
	news_title varchar(200) not null,
	news_content text not null,
	news_postTime timestamp
);
