-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2017 at 04:43 PM
-- Server version: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `lojaderoupas`
--

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
`id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `CPF` varchar(255) NOT NULL,
  `RG` varchar(255) NOT NULL,
  `telefone` varchar(255) NOT NULL,
  `celular` varchar(255) NOT NULL,
  `debito` double NOT NULL,
  `rua` varchar(255) NOT NULL,
  `bairro` varchar(255) NOT NULL,
  `cidade` varchar(255) NOT NULL,
  `estado` varchar(255) NOT NULL,
  `numero` int(11) NOT NULL,
  `cep` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `CPF`, `RG`, `telefone`, `celular`, `debito`, `rua`, `bairro`, `cidade`, `estado`, `numero`, `cep`) VALUES
(1, 'Gabriel Nogueira', '398.068.608-6', '521103150', '(87)99802-9417', '(87)99802-9417', 0, 'Rua Doutora Maria de Fátima Vieira Costa', 'São Brás', 'Afogados da Ingazeira', 'Pernambuco', 57, '56800-000');

-- --------------------------------------------------------

--
-- Table structure for table `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
`id` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `tipo` varchar(255) NOT NULL,
  `tamanho` varchar(255) NOT NULL,
  `marca` varchar(255) NOT NULL,
  `modelo` varchar(255) NOT NULL,
  `material` varchar(255) NOT NULL,
  `cor` varchar(255) NOT NULL,
  `preco` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `produto`
--

INSERT INTO `produto` (`id`, `quantidade`, `tipo`, `tamanho`, `marca`, `modelo`, `material`, `cor`, `preco`) VALUES
(1, 100, 'Calça', 'M', 'Nike', 'Flat', 'Jeans', 'verde', 200);

-- --------------------------------------------------------

--
-- Table structure for table `venda`
--

CREATE TABLE IF NOT EXISTS `venda` (
  `id` int(12) NOT NULL,
  `tipoPagamento` varchar(60) NOT NULL,
  `data` date NOT NULL,
  `produto` varchar(60) NOT NULL,
  `cliente` varchar(60) NOT NULL,
  `quantidade` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produto`
--
ALTER TABLE `produto`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `venda`
--
ALTER TABLE `venda`
 ADD PRIMARY KEY (`id`), ADD KEY `cliente` (`cliente`), ADD KEY `produto` (`produto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `produto`
--
ALTER TABLE `produto`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
