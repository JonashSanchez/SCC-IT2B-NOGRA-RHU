-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 16, 2025 at 01:18 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rhu`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(100) NOT NULL,
  `u_contact` varchar(11) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_username` varchar(100) NOT NULL,
  `u_pass` varchar(150) NOT NULL,
  `u_status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_contact`, `u_type`, `u_username`, `u_pass`, `u_status`) VALUES
(1, 'Nash', 'Sanchez', 'nash2gmail.com', '09617294116', 'Municipal Health Officer', 'nashsu123', 'Nash12$', 'Active'),
(2, 'Jericho', 'Alcala', 'jericho@gmail.com', '12345678900', 'Frontdesk', 'imhimjericho', 'asas', 'Active'),
(3, 'Juniel', 'Nogra', 'juniel@gmail.com', '12345678900', 'Staff', 'juniell123', 'asas', 'Active'),
(8, 'Aaron', 'Requiroso', 'aaron@gmail.com', '09152199508', 'Municipal Health Officer', 'aaron123', 'aaron123567', 'Active'),
(9, 'Keycee', 'Bolambot', 'keycee@gmail.com', '09617294116', 'Frontdesk', 'keyceeflare', '123456789', 'Active'),
(10, 'Steve', 'Lyle', 'lyle@gmail.com', '09617294116', 'Municipal Health Officer', 'lyle123', 'lyle123456', 'Active'),
(11, 'Frans', 'Ababa', 'frans@gmail.com', '09784746432', 'User', 'frans123', 'L7xecK1hu7Y93WTep1xe2Iuc00FlEKnYX0o+xex5P6U=', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
