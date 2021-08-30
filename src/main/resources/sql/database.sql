CREATE SCHEMA IF NOT EXISTS `insurance` DEFAULT CHARACTER SET utf8;
USE `insurance`;

CREATE TABLE IF NOT EXISTS `users`
(
    `id` BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `nick` text NOT NULL ,
    `login` text NOT NULL  ,
    `password` text NOT NULL ,
    `insert_time` timestamp NOT NULL DEFAULT now()
)

    COMMENT = '//tabela z użytkownikami';

CREATE TABLE IF NOT EXISTS `vehicles`
(
    `id` BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `user_id` BIGINT NOT NULL ,
    `login` text NOT NULL ,
    `brand` text NOT NULL,
    `model` text NOT NULL,
    `insert_time` timestamp NOT NULL,
    FOREIGN KEY (user_id) REFERENCES `insurance`.`users`(id)
)
    COMMENT = '//tabela z pojazdami użytkowników';

CREATE TABLE IF NOT EXISTS `insurance_offers`
(
    `id` BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `vehicle_id` BIGINT NOT NULL ,
    `insurer` text NOT NULL ,
    `price` float NOT NULL,
    `insert_time` timestamp NOT NULL,
    FOREIGN KEY (vehicle_id) REFERENCES `insurance`.`vehicles`(id)
)