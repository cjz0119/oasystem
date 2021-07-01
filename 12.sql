/*
SQLyog Enterprise v12.08 (64 bit)
MySQL - 5.0.41-community-nt 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `reply_detail` (
	`id` int (11),
	`invid` int (11),
	`content` varchar (1500),
	`author` varchar (150),
	`createdate` date 
); 
