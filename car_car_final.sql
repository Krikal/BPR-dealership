-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: car
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car` (
  `id` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) CHARACTER SET latin2 COLLATE latin2_hungarian_ci NOT NULL,
  `model` varchar(45) CHARACTER SET latin2 COLLATE latin2_hungarian_ci NOT NULL,
  `fuel` varchar(10) CHARACTER SET latin2 COLLATE latin2_hungarian_ci NOT NULL,
  `isAvailable` tinyint NOT NULL,
  `dateOfPickup` date NOT NULL,
  `dateOfParked` date NOT NULL,
  `placeOfPickup` varchar(45) CHARACTER SET latin2 COLLATE latin2_hungarian_ci NOT NULL,
  `placeOfParked` varchar(45) CHARACTER SET latin2 COLLATE latin2_hungarian_ci NOT NULL,
  `countOfPerson` int NOT NULL,
  `countOfDoors` int NOT NULL,
  `dateOfManufacture` date NOT NULL,
  `gearShitf` varchar(45) CHARACTER SET latin2 COLLATE latin2_hungarian_ci NOT NULL,
  `price` int NOT NULL,
  `airCondition` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=latin2 COLLATE=latin2_hungarian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,'Audi','TT','diesel',1,'2021-05-21','2021-05-21','Debrecen','Debrecen',2,3,'2010-07-23','automata',15000,1),(2,'Audi','A4','diesel',1,'2021-05-19','2021-05-23','Budapest','Gyor',5,5,'2005-02-17','manual',12000,1),(3,'Opel','Corsa','benzin',1,'2021-05-24','2021-05-25','Debrecen','Nyiregyhaza',5,3,'1999-04-09','automata',7000,0),(4,'BMW','X5','diesel',1,'2021-06-04','2021-06-04','Budapest','Budapest',5,5,'2012-11-07','automata',19000,1),(5,'Citroen','C3','benzin',1,'2021-05-29','2021-05-31','Gyor','Budapest',5,5,'2020-08-08','manual',25000,1),(6,'Suzuki','Swift','benzin',1,'2021-05-29','2021-05-30','Debrecen','Nyiregyhaza',5,5,'1997-03-27','manual',7000,0),(7,'Opel','Astra G','diesel',1,'2021-05-22','2021-05-22','Pecs','Pecs',5,5,'2002-01-20','manual',9000,1),(8,'Suzuki','Swift','benzin',1,'2021-05-23','2021-05-23','Budapest','Budapest',5,3,'1998-05-04','manual',7000,0),(9,'Lada','Samara','benzin',1,'2021-06-02','2021-06-01','Nyiregyhaza','Nyiregyhaza',5,3,'1991-04-18','manual',5000,0),(10,'Volkswagen','Passat','diesel',1,'2021-05-21','2021-05-21','Pecs','Pecs',5,5,'2008-12-03','automata',11000,1),(11,'Volkswagen','Golf 5','benzin',1,'2021-05-22','2021-05-23','Debrecen','Debrecen',5,5,'2010-09-12','manual',10000,1),(12,'Opel','Astra F','benzin',1,'2021-05-21','2021-05-21','Debrecen','Debrecen',5,5,'1999-04-28','manual',8000,0),(13,'Renault','Laguna','benzin',1,'2021-05-25','2021-05-26','Nyiregyhaza','Debrecen',5,5,'2000-07-11','manual',8000,1),(14,'Renault','Clio','benzin',1,'2021-05-26','2021-05-26','Budapest','Budapest',5,3,'2013-10-14','manual',12000,1),(15,'Mazda','MX-5','benzin',1,'2021-06-02','2021-06-04','Pecs','Gyor',2,3,'2006-09-30','manual',13000,0),(16,'Mazda','323','benzin',1,'2021-05-21','2021-05-21','Nyiregyhaza','Budapest',5,3,'2003-11-05','manual',9000,1),(17,'Mercedes-Benz','A 180','diesel',1,'2021-05-27','2021-05-27','Gyor','Budapest',5,5,'2009-07-26','manual',11000,1),(18,'Mercedes-Benz','C 220','benzin',1,'2021-05-23','2021-05-24','Pecs','Nyiregyhaza',5,5,'1994-06-02','manual',7000,0),(19,'Volkswagen','Bora','benzin',1,'2021-05-26','2021-05-27','Budapest','Gyor',5,5,'1999-08-03','manual',8000,1),(20,'Volvo','S60','diesel',1,'2021-06-03','2021-06-03','Pecs','Pecs',5,5,'2005-01-10','manual',10000,1),(21,'Toyota','Yaris','benzin',0,'2021-05-28','2021-05-28','Gyor','Gyor',5,5,'2004-07-22','manual',9000,1),(22,'Alfa Romeo','159','diesel',0,'2021-05-29','2021-05-30','Debrecen','Nyiregyhaza',5,3,'2007-03-19','manual',9000,1),(23,'Fiat','Punto','benzin',0,'2021-05-23','2021-05-23','Gyor','Budapest',5,5,'2003-10-09','manual',8000,0),(24,'BMW','550','diesel',0,'2021-05-22','2021-05-22','Pecs','Nyiregyhaza',5,5,'2017-08-31','automata',18000,1),(25,'Dacia','Duster','benzin',0,'2021-05-25','2021-05-26','Gyor','Pecs',5,5,'2020-09-16','manual',15000,1),(26,'Audi','TT','diesel',0,'2021-05-10','2021-05-15','Budapest','Debrecen',5,5,'2020-02-21','automata',450000,1),(27,'Audi','A3','diesel',1,'2021-05-11','2021-05-20','Budapest','Nyíregyháza',5,5,'2019-06-14','manual',430000,0),(28,'Audi','A4','diesel',1,'2021-05-12','2021-05-14','Budapest','Debrecen',7,6,'2019-07-13','automata',340000,1),(29,'Audi','A5','diesel',0,'2021-05-13','2021-05-16','Budapest','Pécs',5,3,'2019-08-21','manual',450000,0),(30,'Audi','A6','diesel',0,'2021-05-14','2021-05-17','Debrecen','Nyíregyháza',5,3,'2020-02-13','automata',340000,0),(31,'Audi','Q5','diesel',1,'2021-05-15','2021-05-19','Debrecen','Budapest',5,5,'2020-10-23','manual',300000,1),(32,'Audi','Q7','diesel',0,'2021-05-16','2021-05-18','Debrecen','Pécs',5,5,'2018-03-01','automata',290000,0),(33,'Ford','Mustang','benzin',0,'2021-05-17','2021-05-23','Debrecen','Győr',5,5,'2019-01-02','manual',400000,1),(34,'Ford','Focus','benzin',1,'2021-05-18','2021-05-26','Debrecen','Nyíregyháza',5,5,'2018-03-10','automata',390000,0),(35,'Ford','Escort','diesel',0,'2021-05-19','2021-05-21','Pécs','Debrecen',5,5,'2020-10-10','automata',380000,0),(36,'Seat','Altea','diesel',0,'2021-05-20','2021-05-20','Pécs','Budapest',3,5,'2020-10-01','manual',370000,1),(37,'Seat','Toledo','diesel',1,'2021-05-21','2021-05-24','Pécs','Győr',3,5,'2019-01-01','automata',360000,0),(38,'Seat','Ibiza','diesel',0,'2021-05-20','2021-05-21','Pécs','Nyíregyháza',3,5,'2016-09-05','manual',350000,0),(39,'Seat','Cordoba','diesel',0,'2021-05-19','2021-05-22','Pécs','Debrecen',3,5,'2017-07-07','automata',340000,1),(40,'Opel','Astra','diesel',1,'2021-05-18','2021-05-19','Győr','Debrecen',3,5,'2020-11-23','manual',330000,0),(41,'Opel','Corsa','benzin',0,'2021-05-17','2021-05-18','Győr','Budapest',5,5,'2021-02-21','automata',320000,0),(42,'Opel','Agila','benzin',0,'2021-05-16','2021-05-17','Győr','Nyíregyháza',3,5,'2018-12-12','automata',340000,1),(43,'Tesla','Model S','elektromos',1,'2021-05-15','2021-05-15','Győr','Debrecen',3,5,'2021-01-01','manual',650000,0),(44,'Tesla','Model X','elektromos',0,'2021-05-14','2021-05-15','Győr','Pécs',3,5,'2012-06-01','automata',750000,0),(45,'Toyota','Auris','benzin',0,'2021-05-13','2021-05-15','Nyíregyháza','Debrecen',5,5,'2017-05-03','automata',460000,1),(46,'Toyota','Yaris','benzin',1,'2021-05-12','2021-05-15','Nyíregyháza','Budapest',5,5,'2019-04-07','manual',650000,0),(47,'Mazda','RX-7','benzin',0,'2021-05-11','2021-05-16','Nyíregyháza','Debrecen',5,5,'2017-03-21','automata',550000,1),(48,'Mazda','RX-8','benzin',1,'2021-05-10','2021-05-13','Nyíregyháza','Pécs',3,5,'2019-11-30','manual',410000,0),(49,'Honda','Civic','benzin',0,'2021-05-09','2021-05-13','Budapest','Debrecen',3,5,'2020-05-01','automata',430000,1),(50,'Honda','Jazz','benzin',0,'2021-05-08','2021-05-10','Budapest','Nyíregyháza',3,5,'2015-12-01','automata',350000,0);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-21 11:28:05
