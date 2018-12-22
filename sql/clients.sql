-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 20, 2018 at 10:58 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pizza`
--

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `cli_cod` int(11) NOT NULL,
  `cli_name` varchar(80) NOT NULL,
  `cli_street` varchar(80) NOT NULL,
  `cli_region` varchar(80) NOT NULL,
  `cli_phone` varchar(80) NOT NULL,
  `cli_data_reg` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`cli_cod`, `cli_name`, `cli_street`, `cli_region`, `cli_phone`, `cli_data_reg`) VALUES
(1, 'Pedro Mauricio', 'Rathborne Drive', 'Ashtown', '(353)32 131-3131', '2018-10-03'),
(2, 'Geni Hogan', 'Rathborne Drive', 'Ashtown', '0851234567', '2018-10-04'),
(3, 'John Freitas', 'Parnell Street', 'City Center', '0876547896', '2018-10-04'),
(4, 'Pedro Tavares', 'Rathborne Street', 'Dublin', '(353)11 122-2333', '2018-12-17'),
(5, 'John Sean', 'Oconell Street', 'Dublin ', '(353)98 765-4321', '2018-12-17'),
(6, 'Mary Christmas', 'Limerick', 'Cork', '(353)65 241-2222', '2018-12-17');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`cli_cod`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `cli_cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
