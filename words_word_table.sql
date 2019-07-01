CREATE DATABASE  IF NOT EXISTS `words` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `words`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: words
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `word_table`
--

DROP TABLE IF EXISTS `word_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `word_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `polish_word` varchar(45) NOT NULL,
  `english_word` varchar(45) NOT NULL,
  `category` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=161 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `word_table`
--

LOCK TABLES `word_table` WRITE;
/*!40000 ALTER TABLE `word_table` DISABLE KEYS */;
INSERT INTO `word_table` VALUES (1,'dorosły','adult','człowiek'),(2,'ręka','arm','człowiek'),(3,'zarozumiały','bigheaded','człowiek'),(4,'mózg','brain','człowiek'),(5,'zobowiązany','committed','człowiek'),(6,'zarozumiały','conceited','człowiek'),(7,'kreatywny','creative','człowiek'),(8,'wymagający','demanding','człowiek'),(9,'łokieć','elbow','człowiek'),(10,'energiczny','energetic','człowiek'),(11,'wyczerpany','exhausted','człowiek'),(12,'stopy','feet','człowiek'),(13,'hojny','generous','człowiek'),(14,'delikatny','gentle','człowiek'),(15,'głowa','head','człowiek'),(16,'pomysłowy','imaginative','człowiek'),(17,'obojętny','neutral','człowiek'),(18,'nietolerancyjny','intolerant','człowiek'),(19,'skrępowany','self-concious','człowiek'),(20,'opalony','tanned','człowiek'),(21,'mrówka','ant','zwierzęta'),(22,'pawian','baboon','zwierzęta'),(23,'nietoperz','bat','zwierzęta'),(24,'niedźwiedź','bear','zwierzęta'),(25,'pszczoła','bee','zwierzęta'),(26,'kot','cat','zwierzęta'),(27,'dorsz','cod','zwierzęta'),(28,'krokodyl','crocodile','zwierzęta'),(29,'sarna','doe','zwierzęta'),(30,'pies','dog','zwierzęta'),(31,'ważka','dragonfly','zwierzęta'),(32,'orzeł','eagle','zwierzęta'),(33,'słoń','elephant','zwierzęta'),(34,'ryba','fish','zwierzęta'),(35,'lis','fox','zwierzęta'),(36,'gęś','goose','zwierzęta'),(37,'chomik','hamster','zwierzęta'),(38,'jeż','hedgehog','zwierzęta'),(39,'szczur','rat','zwierzęta'),(40,'królik','rabbit','zwierzęta'),(41,'jabłko','apple','jedzenie'),(42,'morela','apricot','jedzenie'),(43,'banan','banana','jedzenie'),(44,'wołowina','beef','jedzenie'),(45,'jeżyna','blackberry','jedzenie'),(46,'śniadanie','breakfast','jedzenie'),(47,'jagnięcina','lamb','jedzenie'),(48,'limonka','lime','jedzenie'),(49,'mleko','milk','jedzenie'),(50,'cebula','onion','jedzenie'),(51,'naleśniki','pancakes','jedzenie'),(52,'pietruszka','parsley','jedzenie'),(53,'makaron','pasta','jedzenie'),(54,'gruszka','pear','jedzenie'),(55,'ananas','pineapple','jedzenie'),(56,'śliwka','plum','jedzenie'),(57,'witaminy','vitamins','jedzenie'),(58,'arbuz','watermelon','jedzenie'),(59,'pełnoziarnisty','wholegrain','jedzenie'),(60,'jogurt','yoghurt','jedzenie'),(61,'sztuczna murawa','artificial turf','sport'),(62,'koszykówka','basketball','sport'),(63,'boks','boxing','sport'),(64,'liga mistrzów','champions league','sport'),(65,'kort','court','sport'),(66,'kolarstwo','cycling','sport'),(67,'gra w rzutki','darts','sport'),(68,'dogrywka','extra time','sport'),(69,'piłka nożna','football','sport'),(70,'piłka ręczna','handball','sport'),(71,'bieganie','jogging','sport'),(72,'rozpoczęcie meczu','kick-off','sport'),(73,'gol samobójczy','own goal','sport'),(74,'rowing','wioślarstwo','sport'),(75,'żeglarstwo','sailing','sport'),(76,'strzelać','shoot','sport'),(77,'pływanie','swimming','sport'),(78,'turniej','tournament','sport'),(79,'podnoszenie ciężarów','weightlifting','sport'),(80,'puchar świata','World Cup','sport'),(81,'powietrze','air','pogoda'),(82,'jesień','autumn','pogoda'),(83,'poniżej zera','below zero','pogoda'),(84,'zamieć','blizzard','pogoda'),(85,'wietrzyk','breeze','pogoda'),(86,'czyste niebo','clear sky','pogoda'),(87,'chmura','cloud','pogoda'),(88,'światło dzienne','daylight','pogoda'),(89,'stopnie','degrees','pogoda'),(90,'mrżawka','drizzle','pogoda'),(91,'mgła','fog','pogoda'),(92,'zamarznąć','freeze','pogoda'),(93,'mróz','frost','pogoda'),(94,'gradobicie','hailstorm','pogoda'),(95,'upał','heat','pogoda'),(96,'tęcza','rainbow','pogoda'),(97,'burza piaskowa','sandstorm','pogoda'),(98,'wiosna','spring','pogoda'),(99,'lato','summer','pogoda'),(100,'zima','winter','pogoda'),(101,'adoptowany','adopted','rodzina'),(102,'przodek','ancestor','rodzina'),(103,'ciotka','aunt','rodzina'),(104,'niemowlę','baby','rodzina'),(105,'kawaler','bachelor','rodzina'),(106,'drużba, świadek','best man','rodzina'),(107,'narodziny','birth','rodzina'),(108,'panna młoda','bride','rodzina'),(109,'druhna','bridesmaid','rodzina'),(110,'chrzest','christening','rodzina'),(111,'ślub cywilny','civil marriage','rodzina'),(112,'para','couple','rodzina'),(113,'randka','date','rodzina'),(114,'synowa','daughter-in-law','rodzina'),(115,'rozwód','divorce','rodzina'),(116,'zaręczyny','engagement','rodzina'),(117,'ojciec','father','rodzina'),(118,'matka','mother','rodzina'),(119,'potomstwo','offspring','rodzina'),(120,'teściowie','parents-in-law','rodzina'),(121,'lotnisko','airport','podróże'),(122,'bagaż','baggage','podróże'),(123,'karta pokładowa','boarding card','podróże'),(124,'zarezerwować wakacje','book a holiday','podróże'),(125,'dworzec autobusowy','bus station','podróże'),(126,'kupować pamiątki','buy souvenirs','podróże'),(127,'odwołać lot','cancel a flight','podróże'),(128,'kajak','canoe','podróże'),(129,'wypadek samochodowy','car accident','podróże'),(130,'przesiadać się na inny pociąg','change trains','podróże'),(131,'odprawa','check-in desk','podróże'),(132,'pensjonat','guest house','podróże'),(133,'mieć dobrą podróż','have a good trip','podróże'),(134,'wędrówka','hiking holiday','podróże'),(135,'podróżować autostopem','hitch-hike','podróże'),(136,'przechowalnia bagażu','left luggage office','podróże'),(137,'główna droga','main road','podróże'),(138,'planować podróż','plan a trip','podróże'),(139,'żagiel','sail','podróże'),(140,'pływać w morzu','swim in the sea','podróże'),(141,'poddasze','attic, loft','dom'),(142,'piwnica','basement','dom'),(143,'łóżko','bed','dom'),(144,'pościel','bedclothes, bedding','dom'),(145,'cegła','brick','dom'),(146,'łóżko piętrowe','bunk bed','dom'),(147,'mieszkanie','flat','dom'),(148,'widelec','fork','dom'),(149,'umeblowany','furnished','dom'),(150,'dom','house','dom'),(151,'chatka','hut','dom'),(152,'klucz','key','dom'),(153,'właściciel','landlord','dom'),(154,'skrzynka na listy','letterbox','dom'),(155,'mydelniczka','soap dish','dom'),(156,'klatka schodowa','staircase','dom'),(157,'wziąć prysznic','take a shower','dom'),(158,'do wynajęcia','to let','dom'),(159,'wieszak na ręczniki','towel rail','dom'),(160,'odkurzać podłogę','vacuum the floor','dom');
/*!40000 ALTER TABLE `word_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-01 19:37:02
