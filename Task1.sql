CREATE database users;
USE users;

DROP table user;

CREATE TABLE user
(
    user_id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    first_name Varchar(30)NOT NULL,
    last_name Varchar(30) NOT NULL,
    age INT NOT NULL,
    married BOOLEAN,
    phone Varchar(13) NOT NULL UNIQUE,
    e_mail Varchar(30) NOT NULL UNIQUE
);



