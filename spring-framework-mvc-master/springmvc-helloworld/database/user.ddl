CREATE DATABASE 
  myusers;CREATE TABLE `myusers`.`users` 
                 ( 
                              `username`  VARCHAR(45) NOT NULL, 
                              `password`  VARCHAR(45) NULL, 
                              `firstname` VARCHAR(45) NOT NULL, 
                              `lastname`  VARCHAR(45) NULL, 
                              `email`     VARCHAR(45) NULL, 
                              `address`   VARCHAR(45) NULL, 
                              `phone`     INT NULL, 
                              `gender`   VARCHAR(45) NULL, 
                              PRIMARY KEY (`username`) 
                 )