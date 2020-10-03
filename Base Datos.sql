-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: kefish
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
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `IdCategoria` int(11) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  PRIMARY KEY (`IdCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'PESCADO'),(2,'CAMARON'),(3,'FILETE');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comprobante`
--

DROP TABLE IF EXISTS `comprobante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comprobante` (
  `IdComprobante` int(11) NOT NULL,
  `NombresP` varchar(250) NOT NULL,
  `cedula` varchar(10) DEFAULT NULL,
  `Fecha` date NOT NULL,
  `Total` decimal(5,2) NOT NULL,
  `Pago` enum('EFECTIVO','CREDITO') NOT NULL,
  PRIMARY KEY (`IdComprobante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comprobante`
--

LOCK TABLES `comprobante` WRITE;
/*!40000 ALTER TABLE `comprobante` DISABLE KEYS */;
INSERT INTO `comprobante` VALUES (1,'JUANITA','131452869','2020-09-01',15.00,'EFECTIVO'),(2,'PEDRITO','13145','2020-10-02',41.00,'EFECTIVO'),(3,'EDISON','1314542869','2020-09-13',90.00,'CREDITO'),(4,'KSKSA','1315','2020-09-12',18.00,'EFECTIVO'),(5,'ASKSAKD','','2020-09-12',28.44,'EFECTIVO'),(6,'SAKASJFJA','','2020-09-12',20.16,'EFECTIVO'),(7,'ASKAS','133','2020-09-13',67.59,'EFECTIVO'),(8,'JUANNN','133','2020-09-13',18.60,'EFECTIVO'),(9,'PEDRTO','55','2020-09-13',17.61,'EFECTIVO'),(10,'JDJSDJ','','2020-09-14',7.13,'EFECTIVO'),(11,'ASJ','4455','2020-09-30',8.00,'EFECTIVO'),(12,'ASK','ksak','2020-09-30',24.00,'EFECTIVO'),(13,'SAKSK','ksks','2020-09-30',7.80,'EFECTIVO'),(14,'ASK','kk','2020-09-30',5.00,'EFECTIVO'),(15,'ASSA','','2020-09-30',16.00,'EFECTIVO'),(16,'EDISON','1314542869','2020-09-30',2.50,'EFECTIVO'),(17,'EDISON','1314542869','2020-09-30',5.00,'EFECTIVO'),(18,'EDISON','1314542869','2020-09-30',7.50,'EFECTIVO'),(19,'EDISON','1314542869','2020-09-30',9.00,'EFECTIVO'),(20,'EDISON','1314542869','2020-10-01',36.00,'EFECTIVO'),(21,'EDISON','1314542869','2020-10-01',15.00,'EFECTIVO'),(22,'ANTHONY','1304586999','2020-10-01',40.00,'EFECTIVO'),(23,'ANTHONY','1304586999','2020-10-01',15.00,'EFECTIVO'),(24,'ANTHONY','1304586999','2020-10-01',7.50,'EFECTIVO'),(25,'ANTHONY','1304586999','2020-10-01',250.00,'EFECTIVO'),(26,'EDISON','1314542869','2020-10-01',500.00,'EFECTIVO'),(27,'JUANITO','1314542869','2020-10-01',33.00,'EFECTIVO'),(28,'JUANITO','1314542869','2020-10-01',11.00,'EFECTIVO'),(29,'EDISON','1314542869','2020-10-01',25.00,'EFECTIVO'),(30,'JUANITA','131452869','2020-10-02',10.00,'EFECTIVO'),(31,'ASKSAKD','','2020-10-02',267.50,'EFECTIVO'),(32,'ANTOHNY MARCELO ARANA GARCIA','1314576699','2020-10-02',31.00,'CREDITO');
/*!40000 ALTER TABLE `comprobante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallecomprobante`
--

DROP TABLE IF EXISTS `detallecomprobante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallecomprobante` (
  `IdDetalle` int(11) NOT NULL,
  `IdComprobante` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `Precio` decimal(5,2) NOT NULL,
  `Cantidad` decimal(5,2) NOT NULL,
  `Total` decimal(5,2) NOT NULL,
  PRIMARY KEY (`IdDetalle`),
  KEY `IdComprobante` (`IdComprobante`),
  KEY `IdProducto` (`IdProducto`),
  CONSTRAINT `detallecomprobante_ibfk_1` FOREIGN KEY (`IdComprobante`) REFERENCES `comprobante` (`IdComprobante`),
  CONSTRAINT `detallecomprobante_ibfk_2` FOREIGN KEY (`IdProducto`) REFERENCES `producto` (`IdProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallecomprobante`
--

LOCK TABLES `detallecomprobante` WRITE;
/*!40000 ALTER TABLE `detallecomprobante` DISABLE KEYS */;
INSERT INTO `detallecomprobante` VALUES (13,4,8,4.50,4.00,18.00),(14,5,8,3.50,6.00,28.44),(15,6,8,4.50,4.00,20.16),(18,3,4,6.00,5.00,30.00),(19,3,3,2.50,10.00,25.00),(20,3,5,5.00,7.00,35.00),(21,7,9,6.60,2.00,15.84),(22,7,8,4.50,11.50,51.75),(23,8,9,6.60,2.00,13.20),(24,8,8,4.50,1.20,5.40),(25,9,9,6.60,1.10,7.26),(26,9,8,4.50,2.30,10.35),(27,10,9,6.60,1.08,7.13),(28,11,10,4.00,2.00,8.00),(29,12,10,4.00,6.00,24.00),(30,13,10,3.90,2.00,7.80),(31,14,10,1.00,5.00,5.00),(32,15,10,4.00,4.00,16.00),(33,16,3,2.50,1.00,2.50),(34,17,3,2.50,2.00,5.00),(35,18,3,1.50,5.00,7.50),(36,19,3,1.50,6.00,9.00),(37,20,3,2.50,5.00,12.50),(38,20,7,3.00,2.00,6.00),(39,20,1,3.50,5.00,17.50),(40,21,3,2.50,6.00,15.00),(41,22,6,4.00,5.00,20.00),(42,22,5,5.00,4.00,20.00),(43,23,3,2.50,6.00,15.00),(44,24,3,1.50,5.00,7.50),(45,25,3,2.50,100.00,250.00),(46,26,3,2.50,200.00,500.00),(47,27,5,5.00,5.00,25.00),(48,27,7,3.00,1.00,3.00),(49,27,3,2.50,2.00,5.00),(50,28,5,5.00,1.00,5.00),(51,28,2,3.00,2.00,6.00),(52,29,3,2.50,10.00,25.00),(53,30,3,2.50,4.00,10.00),(54,31,1,3.50,5.00,17.50),(55,31,3,2.50,100.00,250.00),(56,32,5,5.00,5.00,25.00),(57,32,2,3.00,2.00,6.00),(58,2,6,4.00,4.00,16.00),(59,2,5,5.00,5.00,25.00),(60,1,3,2.50,6.00,15.00);
/*!40000 ALTER TABLE `detallecomprobante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `impresora`
--

DROP TABLE IF EXISTS `impresora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `impresora` (
  `idimpresora` int(11) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  PRIMARY KEY (`idimpresora`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `impresora`
--

LOCK TABLES `impresora` WRITE;
/*!40000 ALTER TABLE `impresora` DISABLE KEYS */;
INSERT INTO `impresora` VALUES (1,'L4150 Series(Network)');
/*!40000 ALTER TABLE `impresora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `IdProducto` int(11) NOT NULL,
  `Nombres` varchar(50) NOT NULL,
  `PrecioVenta` decimal(10,2) NOT NULL,
  `PrecioCompra` decimal(10,2) NOT NULL,
  `Cantidad` decimal(10,2) NOT NULL,
  `IdCategoria` int(11) NOT NULL,
  PRIMARY KEY (`IdProducto`),
  KEY `IdCategoria` (`IdCategoria`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`IdCategoria`) REFERENCES `categoria` (`IdCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'ALBACORA 1LB',3.50,3.00,1.00,1),(2,'WAHOO 1LB',3.00,2.75,6.00,1),(3,'DORADO 1LB',2.50,2.25,99548.00,1),(4,'CAMARON 21 1LB',6.00,5.10,0.00,2),(5,'CAMARON 26 1LB',5.00,4.25,1.00,2),(6,'FILETE DE PARGO',4.00,3.45,1.00,3),(7,'FILETE DE BASSA',3.00,2.15,1.00,3),(8,'CAMOTILLO',4.50,4.40,0.40,1),(9,'PRUEBA',6.60,5.00,10.92,1),(10,'DORADO NUEVO',4.00,3.40,1.00,1);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contrasena` varchar(45) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'kefish','123');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `v_clientedetalle`
--

DROP TABLE IF EXISTS `v_clientedetalle`;
/*!50001 DROP VIEW IF EXISTS `v_clientedetalle`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `v_clientedetalle` AS SELECT 
 1 AS `Pago`,
 1 AS `nombresP`,
 1 AS `nombres`,
 1 AS `fecha`,
 1 AS `IdProducto`,
 1 AS `Cantidad`,
 1 AS `precio`,
 1 AS `Total`,
 1 AS `Ganancia`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_listacredito`
--

DROP TABLE IF EXISTS `v_listacredito`;
/*!50001 DROP VIEW IF EXISTS `v_listacredito`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `v_listacredito` AS SELECT 
 1 AS `IdComprobante`,
 1 AS `NombresP`,
 1 AS `Cedula`,
 1 AS `Fecha`,
 1 AS `Total`,
 1 AS `Ganancia`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_listadiaria`
--

DROP TABLE IF EXISTS `v_listadiaria`;
/*!50001 DROP VIEW IF EXISTS `v_listadiaria`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `v_listadiaria` AS SELECT 
 1 AS `IdComprobante`,
 1 AS `NombresP`,
 1 AS `Cedula`,
 1 AS `Fecha`,
 1 AS `Total`,
 1 AS `Ganancia`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `v_clientedetalle`
--

/*!50001 DROP VIEW IF EXISTS `v_clientedetalle`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_clientedetalle` AS select if((`comprobante`.`Pago` = 'EFECTIVO'),'E','C') AS `Pago`,`comprobante`.`NombresP` AS `nombresP`,`producto`.`Nombres` AS `nombres`,`comprobante`.`Fecha` AS `fecha`,`producto`.`IdProducto` AS `IdProducto`,sum(`detallecomprobante`.`Cantidad`) AS `Cantidad`,`detallecomprobante`.`Precio` AS `precio`,sum(`detallecomprobante`.`Total`) AS `Total`,((`detallecomprobante`.`Precio` - `producto`.`PrecioCompra`) * sum(`detallecomprobante`.`Cantidad`)) AS `Ganancia` from ((`detallecomprobante` join `producto` on((`producto`.`IdProducto` = `detallecomprobante`.`IdProducto`))) join `comprobante` on((`comprobante`.`IdComprobante` = `detallecomprobante`.`IdComprobante`))) group by `detallecomprobante`.`IdDetalle` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_listacredito`
--

/*!50001 DROP VIEW IF EXISTS `v_listacredito`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_listacredito` AS select `comprobante`.`IdComprobante` AS `IdComprobante`,`comprobante`.`NombresP` AS `NombresP`,`comprobante`.`cedula` AS `Cedula`,`comprobante`.`Fecha` AS `Fecha`,`comprobante`.`Total` AS `Total`,if((`comprobante`.`Total` = 0),0.00,sum(((`detallecomprobante`.`Precio` - `producto`.`PrecioCompra`) * `detallecomprobante`.`Cantidad`))) AS `Ganancia` from ((`comprobante` join `detallecomprobante` on((`detallecomprobante`.`IdComprobante` = `comprobante`.`IdComprobante`))) join `producto` on((`producto`.`IdProducto` = `detallecomprobante`.`IdProducto`))) where (`comprobante`.`Pago` = 'CREDITO') group by `comprobante`.`IdComprobante` order by `comprobante`.`IdComprobante` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_listadiaria`
--

/*!50001 DROP VIEW IF EXISTS `v_listadiaria`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_listadiaria` AS select `comprobante`.`IdComprobante` AS `IdComprobante`,`comprobante`.`NombresP` AS `NombresP`,`comprobante`.`cedula` AS `Cedula`,`comprobante`.`Fecha` AS `Fecha`,`comprobante`.`Total` AS `Total`,if((`comprobante`.`Total` = 0),0.00,sum(((`detallecomprobante`.`Precio` - `producto`.`PrecioCompra`) * `detallecomprobante`.`Cantidad`))) AS `Ganancia` from ((`comprobante` join `detallecomprobante` on((`detallecomprobante`.`IdComprobante` = `comprobante`.`IdComprobante`))) join `producto` on((`producto`.`IdProducto` = `detallecomprobante`.`IdProducto`))) where (`comprobante`.`Pago` = 'EFECTIVO') group by `comprobante`.`IdComprobante` order by `comprobante`.`IdComprobante` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-02 19:15:10
