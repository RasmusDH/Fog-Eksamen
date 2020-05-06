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
  `materialId` int(255) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `length` int(11) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`materialId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billofmaterials`
--

LOCK TABLES `billofmaterials` WRITE;
/*!40000 ALTER TABLE `billofmaterials` DISABLE KEYS */;
INSERT INTO `billofmaterials` VALUES (1,'25x200 mm. trykimp. Brædt',360,4,'stk.'),(2,'25x200 mm. trykimp. Brædt',540,4,'stk.'),(3,'25x125 mm. trykimp. Brædt',360,2,'stk.'),(4,'25x125 mm. trykimp. Brædt',540,4,'stk'),(5,'38x73 mm. Lægte ubh.',420,1,'stk.'),(6,'45x95 mm. Regular ub.',270,12,'stk.'),(7,'45x95 mm. Regular ub.',240,4,'stk.'),(8,'45x195 mm. spærtræ ubh.',600,2,'stk.'),(9,'45x195 mm. spærtræ ubh.',480,1,'stk.'),(10,'45x195 mm. spærtræ ubh.',600,15,'stk.'),(11,'97x97 mm. trykimp. Stolpe',300,11,'stk.'),(12,'19x100 mm trykimp. Brædt',210,200,'stk.'),(13,'19x100 mm trykimp. Brædt',540,4,'stk.'),(14,'19x100 mm trykimp. Brædt',360,2,'stk.'),(15,'Plastmo Ecolite blåtonet',600,6,'stk.'),(16,'Plastmo Ecolite blåtonet',360,6,'stk.'),(17,'Plastmo bundskruer 200stk',0,3,'pakke'),(18,'Hulbånd 1x20 mm. 10 mtr',0,2,'rulle'),(19,'Universal 190mm højre',0,15,'stk.'),(20,'Universal 190mm venstre',0,15,'stk.'),(21,'4,5 x 60 mm skruer 200 stk',0,1,'pakke'),(22,'4,0 x 50mm beslagskruser 250 stk.',0,3,'pakke'),(23,'bræddebolt 10 x 120mm.',0,18,'stk.'),(24,'Firkantskiver 40x40x11 mm ',0,12,'stk.'),(25,'4,5 x 70 mm. skruer 400 stk',0,2,'pk.'),(26,'4,5 x 50 mm. skruer 300 stk',0,2,'pakke'),(27,'Stalddørsgreb 50x75',0,1,'sæt'),(28,'T-hængsel 390 mm',0,2,'stk.'),(29,'Vinkelbeslag 35',0,32,'stk.');
/*!40000 ALTER TABLE `billofmaterials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materials`
--

DROP TABLE IF EXISTS `materials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materials` (
  `kind` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materials`
--

LOCK TABLES `materials` WRITE;
/*!40000 ALTER TABLE `materials` DISABLE KEYS */;
INSERT INTO `materials` VALUES ('Mahogany'),('Gumpole'),('Spruce'),('Birch'),('Oak'),('Pine');
/*!40000 ALTER TABLE `materials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `measurements`
--

DROP TABLE IF EXISTS `measurements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `measurements` (
  `Navn` varchar(20) DEFAULT NULL,
  `measure` int(5) DEFAULT NULL,
  `unit` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `measurements`
--

LOCK TABLES `measurements` WRITE;
/*!40000 ALTER TABLE `measurements` DISABLE KEYS */;
INSERT INTO `measurements` VALUES ('width',270,'cm'),('width',300,'cm'),('width',330,'cm'),('width',360,'cm'),('width',390,'cm'),('width',420,'cm'),('width',480,'cm'),('width',510,'cm'),('width',540,'cm'),('width',570,'cm'),('width',600,'cm'),('width',630,'cm'),('width',660,'cm'),('width',690,'cm'),('width',720,'cm'),('width',750,'cm'),('width',450,'cm'),('width',240,'cm'),('length',240,'cm'),('length',270,'cm'),('length',300,'cm'),('length',330,'cm'),('length',360,'cm'),('length',390,'cm'),('length',420,'cm'),('length',450,'cm'),('length',480,'cm'),('length',510,'cm'),('length',540,'cm'),('length',570,'cm'),('length',600,'cm'),('length',630,'cm'),('length',660,'cm'),('length',690,'cm'),('length',720,'cm'),('length',750,'cm'),('length',780,'cm'),('shed width',210,'cm'),('shed width',240,'cm'),('shed width',270,'cm'),('shed width',300,'cm'),('shed width',330,'cm'),('shed width',360,'cm'),('shed width',390,'cm'),('shed width',420,'cm'),('shed width',450,'cm'),('shed width',480,'cm'),('shed width',510,'cm'),('shed width',540,'cm'),('shed width',570,'cm'),('shed width',600,'cm'),('shed width',630,'cm'),('shed width',660,'cm'),('shed width',690,'cm'),('shed width',720,'cm'),('shed length',150,'cm'),('shed length',180,'cm'),('shed length',210,'cm'),('shed length',240,'cm'),('shed length',270,'cm'),('shed length',300,'cm'),('shed length',330,'cm'),('shed length',360,'cm'),('shed length',390,'cm'),('shed length',420,'cm'),('shed length',450,'cm'),('shed length',480,'cm'),('shed length',510,'cm'),('shed length',540,'cm'),('shed length',570,'cm'),('shed length',600,'cm'),('shed length',630,'cm'),('shed length',660,'cm'),('shed length',690,'cm');
/*!40000 ALTER TABLE `measurements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `name` varchar(20) DEFAULT NULL,
  `orderdate` date DEFAULT NULL,
  `orderdelivery` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roof`
--

DROP TABLE IF EXISTS `roof`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roof` (
  `Kind` varchar(20) DEFAULT NULL,
  `slope` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roof`
--

LOCK TABLES `roof` WRITE;
/*!40000 ALTER TABLE `roof` DISABLE KEYS */;
INSERT INTO `roof` VALUES ('flat',NULL),('sloped',45),('sloped',40),('sloped',35),('sloped',30),('sloped',25),('sloped',20),('flat',NULL),('sloped',45),('sloped',40),('sloped',35),('sloped',30),('sloped',25),('sloped',20);
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

-- Dump completed on 2020-05-06 13:25:12
