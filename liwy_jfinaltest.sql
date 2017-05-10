/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.17 : Database - liwy_jfinaltest
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`liwy_jfinaltest` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `liwy_jfinaltest`;

/*Table structure for table `liwy_article` */

DROP TABLE IF EXISTS `liwy_article`;

CREATE TABLE `liwy_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `author` varchar(24) DEFAULT NULL,
  `content` mediumtext NOT NULL,
  `time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

/*Data for the table `liwy_article` */

insert  into `liwy_article`(`id`,`title`,`author`,`content`,`time`) values (1,'Hello world!','liwy','你好要liwy！欢迎你的到来！','2017-04-04 00:00:00'),(4,'44444','444444','4444444','2016-11-08 15:56:42'),(6,'66666','66666','666666','2016-11-08 16:13:20'),(9,'4345345','35345','345345','2017-02-21 22:29:00'),(10,'666','666','66666','2017-02-21 22:29:05'),(11,'333','434','3434','2017-02-21 22:29:09'),(12,'tyuty','tyut','yutyuytu','2017-02-21 22:31:14'),(13,'tyuu','uuu','uuuu','2017-02-21 22:31:18'),(50,'12123','23222','11212sfsdfsdf','2017-04-04 00:00:00'),(52,'title123','liwy','contnent112','2017-04-04 00:00:00'),(53,'title123','liwy','contnent112','2017-04-04 00:00:00'),(54,'title123','liwy','contnent112','2017-04-04 00:00:00'),(55,'121212','22222','22222','2017-04-04 00:00:00'),(56,'liwy','liwy','lwiy','2017-04-04 00:00:00'),(57,'liwy','liwy','lwiy','2017-04-04 00:00:00'),(58,'title123','liwy','contnent112','2017-04-04 00:00:00'),(59,'1222222','22222','22222','2017-09-22 00:00:00'),(60,'2222','22222','2222','1999-09-24 00:00:00'),(61,'2222222','2222222','1212222222','1991-11-25 00:00:00'),(62,'','2222222','1212222222','1991-11-25 00:00:00'),(63,'','','1212222222','1991-11-25 00:00:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
