create database keyboard;

use keyboard;

CREATE TABLE user (
user_id int primary key not null,
name varchar(20) not null,
email varchar(50) not null
);

create table keyboard(
keyboard_id int AUTO_INCREMENT primary key not null UNIQUE, -- 키보드 고유 ID(자동증가)
serial_number VARCHAR(50) not null UNIQUE, -- 키보드 고유번호 (직접 입력/시스템 생성)
brand varchar(50), -- 제조사
model varchar(50), -- 모델명
purchase_date date, -- 구매일
status varchar(20) default '정상' , -- 상태(정상, 고장, 수리중)
user_id int, -- 사용자 ID (외래키)
constraint fk_user_id foreign key (user_id) references user(user_id)
on delete set null -- 사용자 삭제시 user_id를 null로 바꿈
on update cascade -- user_id 수정 keyboard의 user_id 도 수정
);

create table keyboardLog(
log_id int auto_increment primary key,
keyboard_id int,
action varchar(100) not null,
memo text,
timestamp datetime default current_timestamp,
foreign key (keyboard_id) references keyboard (keyboard_id)
on delete cascade
on update cascade
);
