-- MySQL dump 10.13  Distrib 5.5.32, for debian-linux-gnu (i686)
--
-- Host: localhost    Database: nrm
-- ------------------------------------------------------
-- Server version	5.5.32-0ubuntu0.12.10.1
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `IMAGE`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `IMAGE` (
  `UUID` bigint(20) NOT NULL,
  PRIMARY KEY (`UUID`),
  CONSTRAINT `FK_IMAGE_UUID` FOREIGN KEY (`UUID`) REFERENCES `MEDIA` (`UUID`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `MEDIA`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MEDIA` (
  `UUID` bigint(20) NOT NULL,
  `DTYPE` varchar(31) DEFAULT NULL,
  `FILENAME` varchar(255) DEFAULT NULL,
  `MIME_TYE` varchar(50) DEFAULT NULL,
  `OWNER` varchar(255) DEFAULT NULL,
  `VISIBILITY` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`UUID`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `MEDIATEXT`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MEDIATEXT` (
  `UUID` bigint(20) NOT NULL,
  `LANG` varchar(255) DEFAULT NULL,
  `LEGEND` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`UUID`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `METADATA`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `METADATA` (
  `UUID` bigint(20) NOT NULL,
  PRIMARY KEY (`UUID`)
);
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-08-06 16:59:06
