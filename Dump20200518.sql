-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: fog
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `billofmaterials`
--

DROP TABLE IF EXISTS `billofmaterials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `billofmaterials` (
  `bomId` int(11) NOT NULL AUTO_INCREMENT,
  `materialId` int(11) DEFAULT NULL,
  `orderId` int(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `length` int(11) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`bomId`),
  KEY `fk_bom_orders_idx` (`orderId`),
  KEY `fk_bom_materials_idx` (`materialId`),
  CONSTRAINT `fk_bom_materials` FOREIGN KEY (`materialId`) REFERENCES `constructionmaterials` (`materialId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_bom_orders` FOREIGN KEY (`orderId`) REFERENCES `orders` (`orderId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billofmaterials`
--

LOCK TABLES `billofmaterials` WRITE;
/*!40000 ALTER TABLE `billofmaterials` DISABLE KEYS */;
INSERT INTO `billofmaterials` VALUES (1,1,1,'25x200 mm. trykimp. Brædt',360,4,'stk.'),(2,2,1,'25x200 mm. trykimp. Brædt',540,4,'stk.'),(3,3,1,'25x125 mm. trykimp. Brædt',360,2,'stk.'),(4,4,1,'25x125 mm. trykimp. Brædt',540,4,'stk'),(5,5,1,'38x73 mm. Lægte ubh.',420,1,'stk.'),(6,6,1,'45x95 mm. Regular ub.',270,12,'stk.'),(7,7,1,'45x95 mm. Regular ub.',240,4,'stk.'),(8,8,1,'45x195 mm. spærtræ ubh.',600,2,'stk.'),(9,9,1,'45x195 mm. spærtræ ubh.',480,1,'stk.'),(10,10,1,'45x195 mm. spærtræ ubh.',600,15,'stk.'),(11,11,1,'97x97 mm. trykimp. Stolpe',300,11,'stk.'),(12,12,1,'19x100 mm trykimp. Brædt',210,200,'stk.'),(13,13,1,'19x100 mm trykimp. Brædt',540,4,'stk.'),(14,14,1,'19x100 mm trykimp. Brædt',360,2,'stk.'),(15,15,1,'Plastmo Ecolite blåtonet',600,6,'stk.'),(16,16,1,'Plastmo Ecolite blåtonet',360,6,'stk.'),(17,17,1,'Plastmo bundskruer 200stk',0,3,'pakke'),(18,18,1,'Hulbånd 1x20 mm. 10 mtr',0,2,'rulle'),(19,19,1,'Universal 190mm højre',0,15,'stk.'),(20,20,1,'Universal 190mm venstre',0,15,'stk.'),(21,21,1,'4,5 x 60 mm skruer 200 stk',0,1,'pakke'),(22,22,1,'4,0 x 50mm beslagskruser 250 stk.',0,3,'pakke'),(23,23,1,'bræddebolt 10 x 120mm.',0,18,'stk.'),(24,24,1,'Firkantskiver 40x40x11 mm ',0,12,'stk.'),(25,25,1,'4,5 x 70 mm. skruer 400 stk',0,2,'pk.'),(26,26,1,'4,5 x 50 mm. skruer 300 stk',0,2,'pakke'),(27,27,1,'Stalddørsgreb 50x75',0,1,'sæt'),(28,28,1,'T-hængsel 390 mm',0,2,'stk.'),(29,29,1,'Vinkelbeslag 35',0,32,'stk.');
/*!40000 ALTER TABLE `billofmaterials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `constructionmaterials`
--

DROP TABLE IF EXISTS `constructionmaterials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `constructionmaterials` (
  `materialId` int(11) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `placement` varchar(255) DEFAULT NULL,
  `length` int(11) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `width` int(11) DEFAULT NULL,
  `thickness` double DEFAULT NULL,
  PRIMARY KEY (`materialId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `constructionmaterials`
--

LOCK TABLES `constructionmaterials` WRITE;
/*!40000 ALTER TABLE `constructionmaterials` DISABLE KEYS */;
INSERT INTO `constructionmaterials` VALUES (1,'25x200 mm. trykimp. Brædt','skur',360,'stk.',200,25),(2,'25x200 mm. trykimp. Brædt','skur',540,'stk.',200,25),(3,'25x125 mm. trykimp. Brædt','skur',360,'stk.',125,25),(4,'25x125 mm. trykimp. Brædt','skur',540,'stk',125,25),(5,'38x73 mm. Lægte ubh.','dør',420,'stk.',73,38),(6,'45x95 mm. Regular ub.','skur',270,'stk.',95,45),(7,'45x95 mm. Regular ub.','skur',240,'stk.',95,45),(8,'45x195 mm. spærtræ ubh.','tag',600,'stk.',195,45),(9,'45x195 mm. spærtræ ubh.','tag',480,'stk.',195,45),(10,'45x195 mm. spærtræ ubh.','tag',600,'stk.',195,45),(11,'97x97 mm. trykimp. Stolpe','carport',300,'stk.',97,97),(12,'19x100 mm trykimp. Brædt','skur',210,'stk.',100,19),(13,'19x100 mm trykimp. Brædt','carport',540,'stk.',100,19),(14,'19x100 mm trykimp. Brædt','carport',360,'stk.',100,19),(15,'Plastmo Ecolite blåtonet','tag',600,'stk.',NULL,NULL),(16,'Plastmo Ecolite blåtonet','tag',360,'stk.',NULL,NULL),(17,'Plastmo bundskruer 200stk','tag',0,'pakke',NULL,NULL),(18,'Hulbånd 1x20 mm. 10 mtr','tag',0,'rulle',NULL,NULL),(19,'Universal 190mm højre','tag',0,'stk.',NULL,NULL),(20,'Universal 190mm venstre','tag',0,'stk.',NULL,NULL),(21,'4,5 x 60 mm skruer 200 stk','carport',0,'pakke',60,4.5),(22,'4,0 x 50mm beslagskruser 250 stk.','tag',0,'pakke',50,4),(23,'bræddebolt 10 x 120mm.','carport',0,'stk.',120,10),(24,'Firkantskiver 40x40x11 mm ','carport',0,'stk.',NULL,NULL),(25,'4,5 x 70 mm. skruer 400 stk','carport',0,'pk.',70,4.5),(26,'4,5 x 50 mm. skruer 300 stk','carport',0,'pakke',50,4.5),(27,'Stalddørsgreb 50x75','dør',0,'sæt',NULL,NULL),(28,'T-hængsel 390 mm','dør',0,'stk.',NULL,NULL),(29,'Vinkelbeslag 35','skur',0,'stk.',NULL,NULL);
/*!40000 ALTER TABLE `constructionmaterials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `orderdate` date DEFAULT NULL,
  `orderdelivery` date DEFAULT NULL,
  `length` int(11) DEFAULT NULL,
  `width` int(11) DEFAULT NULL,
  `roofId` int(11) DEFAULT '1',
  PRIMARY KEY (`orderId`),
  KEY `fk_roof_orders_idx` (`roofId`),
  CONSTRAINT `fk_order_roofs` FOREIGN KEY (`roofId`) REFERENCES `roof` (`roofId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'Jønke','j@j.dk','2020-01-01','2020-02-01',780,600,1);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roof`
--

DROP TABLE IF EXISTS `roof`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roof` (
  `roofId` int(11) NOT NULL,
  `Kind` varchar(20) DEFAULT NULL,
  `slope` int(11) DEFAULT NULL,
  PRIMARY KEY (`roofId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roof`
--

LOCK TABLES `roof` WRITE;
/*!40000 ALTER TABLE `roof` DISABLE KEYS */;
INSERT INTO `roof` VALUES (1,'flat',0),(2,'sloped',25),(3,'sloped',35);
/*!40000 ALTER TABLE `roof` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-18  6:50:25
