-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 18-Fev-2023 às 23:47
-- Versão do servidor: 8.0.31
-- versão do PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `meubanco`
--
DROP DATABASE IF EXISTS `meubanco`;
CREATE DATABASE IF NOT EXISTS `meubanco` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `meubanco`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `Nome` varchar(30) COLLATE utf8mb4_general_ci NOT NULL,
  `Sexo` enum('M','F') COLLATE utf8mb4_general_ci NOT NULL,
  `Conta` int NOT NULL,
  `Telefone` varchar(11) COLLATE utf8mb4_general_ci NOT NULL,
  `ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Nome` (`Nome`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`Nome`, `Sexo`, `Conta`, `Telefone`, `ID`) VALUES
('Maria', 'F', 23456123, '318992231', 1),
('Kaiky', 'M', 445787422, '314589544', 2),
('Gabriela', 'F', 567253411, '215755568', 3),
('Lucas', 'M', 315473456, '4126562567', 4);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
