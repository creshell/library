-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2023 at 04:09 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `logger`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_books`
--

CREATE TABLE `tbl_books` (
  `ISBN` int(20) NOT NULL,
  `b_name` varchar(100) NOT NULL,
  `b_author` varchar(100) NOT NULL,
  `b_quantity` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_books`
--

INSERT INTO `tbl_books` (`ISBN`, `b_name`, `b_author`, `b_quantity`) VALUES
(1, 'cress', 'hii', 5),
(2, 'crt1', 'resd', 12);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `l_id` int(50) NOT NULL,
  `st_id` int(50) NOT NULL,
  `ISBN` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`l_id`, `st_id`, `ISBN`) VALUES
(1, 54564, 1),
(2, 12345440, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_student`
--

CREATE TABLE `tbl_student` (
  `st_id` int(10) NOT NULL,
  `st_name` varchar(50) NOT NULL,
  `st_address` varchar(100) NOT NULL,
  `st_contact` varchar(20) NOT NULL,
  `st_gender` varchar(10) NOT NULL,
  `st_in` varchar(10) NOT NULL,
  `st_out` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_student`
--

INSERT INTO `tbl_student` (`st_id`, `st_name`, `st_address`, `st_contact`, `st_gender`, `st_in`, `st_out`) VALUES
(54564, 'Creshell Mae Albiso', 'Brgy. Bairan City of Naga, Cebu', '097525646651', 'Female', '12:30 Pm', '3:30 Pm'),
(12345440, 'NIEL', 'SITIO.SAMBAG', '0975268206', 'MALE', '9:30 AM  ', '10:30PM ');

-- --------------------------------------------------------

--
-- Table structure for table `user_tbl`
--

CREATE TABLE `user_tbl` (
  `id` int(11) NOT NULL,
  `U_fname` varchar(50) NOT NULL,
  `U_lname` varchar(50) NOT NULL,
  `U_address` varchar(100) NOT NULL,
  `U_username` varchar(50) NOT NULL,
  `U_gender` varchar(50) NOT NULL,
  `U_img` varchar(500) NOT NULL,
  `U_pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_tbl`
--

INSERT INTO `user_tbl` (`id`, `U_fname`, `U_lname`, `U_address`, `U_username`, `U_gender`, `U_img`, `U_pass`) VALUES
(27, 'rico', 'zen', 'naga', 'totoy12', 'Male', '', '$2a$10$p/A2yLM8Fxl/5ZPsLptgN./ZqlhRilfgH33ZSMLlcGk3bqTzRpjn.'),
(28, 'cre', 'cre', 'cre', 'cre', 'female', '', '$2a$10$hPRazPO/0ZU486lBvntm0.TjYSYdIr/RBBs3/5FC0Nym5lzmMYvbi'),
(29, 'cre', 'cre', 'cre', 'cre', 'female', '', '$2a$10$eNNbOJIjq.bgqWZOXPhxQuTQh7quIAEjs/HnV/zXk3lrpMjOUHQW2'),
(30, 'cre', 'cre', 'cre', 'cre', 'female', '', '$2a$10$5wGqvQz1LdJvI3pXOt.hbOux18KSb6pbUSbHnnWVlLJdsz6Iy2dFK'),
(31, 'a', 'a', 'a', 'a', 'female', '', '$2a$10$aeClosgs2kHlvP6gFYXJJOWDf/lWZ1qN3B7yuEOKJ8EfdIAduUIdi'),
(32, 'a', 'a', 'a', 'a', 'female', 'C:\\Users\\SCC-PC10\\Pictures\\Screenshots\\Screenshot (1).png', '$2a$10$Ae4jPTWm3i.sZVJLkmQyV.I2QaoIHBb3WQmaLLdelL/QYJA416sYa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_books`
--
ALTER TABLE `tbl_books`
  ADD PRIMARY KEY (`ISBN`);

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`l_id`),
  ADD KEY `ISBN` (`ISBN`),
  ADD KEY `st_id` (`st_id`);

--
-- Indexes for table `tbl_student`
--
ALTER TABLE `tbl_student`
  ADD PRIMARY KEY (`st_id`);

--
-- Indexes for table `user_tbl`
--
ALTER TABLE `user_tbl`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_books`
--
ALTER TABLE `tbl_books`
  MODIFY `ISBN` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `l_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_student`
--
ALTER TABLE `tbl_student`
  MODIFY `st_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12345442;

--
-- AUTO_INCREMENT for table `user_tbl`
--
ALTER TABLE `user_tbl`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD CONSTRAINT `tbl_logs_ibfk_1` FOREIGN KEY (`ISBN`) REFERENCES `tbl_books` (`ISBN`),
  ADD CONSTRAINT `tbl_logs_ibfk_2` FOREIGN KEY (`st_id`) REFERENCES `tbl_student` (`st_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
