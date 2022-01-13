/*
SQLyog Ultimate v12.5.1 (64 bit)
MySQL - 10.4.21-MariaDB : Database - db_katalog_ramandaajisakaasyraf_20312067
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_katalog_ramandaajisakaasyraf_20312067` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db_katalog_ramandaajisakaasyraf_20312067`;

/*Table structure for table `tbl_buku_20312067` */

DROP TABLE IF EXISTS `tbl_buku_20312067`;

CREATE TABLE `tbl_buku_20312067` (
  `ISBN_20312067` char(17) NOT NULL,
  `Judul_Buku_20312067` varchar(30) DEFAULT NULL,
  `ID_Pengarang_20312067` char(4) DEFAULT NULL,
  `ID_Penerbit_20312067` char(4) DEFAULT NULL,
  `ID_Kategori_20312067` char(4) DEFAULT NULL,
  `Harga_20312067` int(11) DEFAULT NULL,
  `Tahun_Terbit_20312067` char(4) DEFAULT NULL,
  `Stok_20312067` int(11) DEFAULT NULL,
  PRIMARY KEY (`ISBN_20312067`),
  KEY `ID_Kategori_20312067` (`ID_Kategori_20312067`),
  KEY `ID_Penerbit_20312067` (`ID_Penerbit_20312067`),
  KEY `ID_Pengarang_20312067` (`ID_Pengarang_20312067`),
  CONSTRAINT `tbl_buku_20312067_ibfk_1` FOREIGN KEY (`ID_Kategori_20312067`) REFERENCES `tbl_kategori_20312067` (`ID_Kategori_20312067`),
  CONSTRAINT `tbl_buku_20312067_ibfk_2` FOREIGN KEY (`ID_Penerbit_20312067`) REFERENCES `tbl_penerbit_20312067` (`ID_Penerbit_20312067`),
  CONSTRAINT `tbl_buku_20312067_ibfk_3` FOREIGN KEY (`ID_Pengarang_20312067`) REFERENCES `tbl_pengarang_20312067` (`ID_Pengarang_20312067`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_buku_20312067` */

insert  into `tbl_buku_20312067`(`ISBN_20312067`,`Judul_Buku_20312067`,`ID_Pengarang_20312067`,`ID_Penerbit_20312067`,`ID_Kategori_20312067`,`Harga_20312067`,`Tahun_Terbit_20312067`,`Stok_20312067`) values 
('3342','Ntah','D123','D002','1231',50000,'2021',23),
('DFS28DJ87','Mandalorian','DW42','D002','3124',90000,'2020',99);

/*Table structure for table `tbl_kategori_20312067` */

DROP TABLE IF EXISTS `tbl_kategori_20312067`;

CREATE TABLE `tbl_kategori_20312067` (
  `ID_Kategori_20312067` char(4) NOT NULL,
  `Nama_Kategori_20312067` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_Kategori_20312067`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_kategori_20312067` */

insert  into `tbl_kategori_20312067`(`ID_Kategori_20312067`,`Nama_Kategori_20312067`) values 
('1231','Horor'),
('3124','Action'),
('5122','Drama'),
('5563','Gore'),
('9901','Romance');

/*Table structure for table `tbl_login_20312067` */

DROP TABLE IF EXISTS `tbl_login_20312067`;

CREATE TABLE `tbl_login_20312067` (
  `Username_20312067` varchar(10) NOT NULL,
  `Password_20312067` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Username_20312067`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_login_20312067` */

insert  into `tbl_login_20312067`(`Username_20312067`,`Password_20312067`) values 
('otong','ucup');

/*Table structure for table `tbl_penerbit_20312067` */

DROP TABLE IF EXISTS `tbl_penerbit_20312067`;

CREATE TABLE `tbl_penerbit_20312067` (
  `ID_Penerbit_20312067` char(4) NOT NULL,
  `Nama_Penerbit_20312067` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_Penerbit_20312067`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_penerbit_20312067` */

insert  into `tbl_penerbit_20312067`(`ID_Penerbit_20312067`,`Nama_Penerbit_20312067`) values 
('D002','Gramedia'),
('D003','Ranti'),
('D013','Informa'),
('D341','Novi');

/*Table structure for table `tbl_pengarang_20312067` */

DROP TABLE IF EXISTS `tbl_pengarang_20312067`;

CREATE TABLE `tbl_pengarang_20312067` (
  `ID_Pengarang_20312067` char(4) NOT NULL,
  `Nama_Pengarang_20312067` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`ID_Pengarang_20312067`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_pengarang_20312067` */

insert  into `tbl_pengarang_20312067`(`ID_Pengarang_20312067`,`Nama_Pengarang_20312067`) values 
('D123','Silvia'),
('DAS3','Nova'),
('DW42','Saka');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
