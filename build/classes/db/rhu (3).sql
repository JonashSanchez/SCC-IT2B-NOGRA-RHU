-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2025 at 10:28 AM
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
-- Table structure for table `tbl_appointments`
--

CREATE TABLE `tbl_appointments` (
  `a_id` int(11) NOT NULL,
  `a_date` date NOT NULL,
  `a_time` time NOT NULL,
  `a_reason` varchar(255) DEFAULT NULL,
  `u_id` int(11) NOT NULL,
  `appo_status` enum('pending','approved','done') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_appointments`
--

INSERT INTO `tbl_appointments` (`a_id`, `a_date`, `a_time`, `a_reason`, `u_id`, `appo_status`) VALUES
(1, '2026-01-01', '18:00:00', 'fever', 10, 'done'),
(2, '2027-01-01', '17:00:00', 'stomachache', 10, 'pending'),
(4, '2025-05-19', '18:00:00', 'Fever', 13, 'pending'),
(5, '2025-05-26', '18:00:00', 'stomachache', 13, 'pending');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `log_id` int(20) NOT NULL,
  `u_id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `action_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `log_action` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`log_id`, `u_id`, `name`, `action_time`, `log_action`) VALUES
(1, '11', 'Frans Ababa', '2025-04-17 13:37:37', 'Logged in to the system'),
(2, '11', 'Frans Ababa', '2025-04-22 14:06:15', 'Logged in to the system'),
(3, '11', 'Frans Ababa', '2025-04-22 14:14:05', 'Logged in to the system'),
(4, '11', 'Frans Ababa', '2025-04-22 14:15:31', 'Logged in to the system'),
(5, '11', 'Frans Ababa', '2025-04-22 14:35:37', 'Logged in to the system'),
(6, '11', 'Frans Ababa', '2025-04-22 14:40:23', 'Logged in to the system'),
(7, '11', 'Frans Ababa', '2025-04-24 17:56:36', 'Logged in to the system'),
(8, '11', 'Frans Ababa', '2025-04-25 16:20:17', 'Logged in to the system'),
(9, '11', 'Frans Ababa', '2025-04-30 11:14:55', 'Logged in to the system'),
(10, '11', 'Frans Ababa', '2025-04-30 11:21:20', 'Logged in to the system'),
(11, '11', 'Frans Ababa', '2025-04-30 11:33:14', 'Logged in to the system'),
(12, '11', 'Frans Ababa', '2025-04-30 11:37:06', 'Logged in to the system'),
(13, '11', 'Frans Ababa', '2025-04-30 11:41:06', 'Logged in to the system'),
(14, '11', 'Frans Ababa', '2025-04-30 11:41:37', 'Admin added an appointment'),
(15, '11', 'Frans Ababa', '2025-04-30 11:42:07', 'Logged in to the system'),
(16, '11', 'Frans Ababa', '2025-04-30 11:42:59', 'Logged in to the system'),
(17, '11', 'Frans Ababa', '2025-04-30 11:47:25', 'Logged in to the system'),
(18, '11', 'Frans Ababa', '2025-05-04 07:26:17', 'Logged in to the system'),
(19, '11', 'Frans Ababa', '2025-05-04 07:30:18', 'Logged in to the system'),
(20, '11', 'Frans Ababa', '2025-05-04 07:53:12', 'Logged in to the system'),
(21, '11', 'Frans Ababa', '2025-05-04 07:55:00', 'Logged in to the system'),
(22, '11', 'Frans Ababa', '2025-05-04 07:55:47', 'Logged in to the system'),
(23, '11', 'Frans Ababa', '2025-05-04 11:15:37', 'Logged in to the system'),
(24, '11', 'Frans Ababa', '2025-05-04 11:16:00', 'Logged in to the system'),
(25, '11', 'Frans Ababa', '2025-05-04 11:47:04', 'Logged in to the system'),
(26, '11', 'Frans Ababa', '2025-05-04 11:49:29', 'Logged in to the system'),
(27, '11', 'Frans Ababa', '2025-05-04 15:52:49', 'Logged in to the system'),
(28, '11', 'Frans Ababa', '2025-05-04 15:55:03', 'Logged in to the system'),
(29, '11', 'Frans Ababa', '2025-05-04 15:55:33', 'Logged in to the system'),
(30, '11', 'Frans Ababa', '2025-05-04 15:57:08', 'Logged in to the system'),
(31, '11', 'Frans Ababa', '2025-05-04 15:58:14', 'Logged in to the system'),
(32, '11', 'Frans Ababa', '2025-05-04 15:58:40', 'Logged in to the system'),
(33, '11', 'Frans Ababa', '2025-05-04 16:05:58', 'Logged in to the system'),
(34, '11', 'Frans Ababa', '2025-05-04 16:07:33', 'Logged in to the system'),
(35, '11', 'Frans Ababa', '2025-05-04 16:08:41', 'Logged in to the system'),
(36, '11', 'Frans Ababa', '2025-05-04 16:12:16', 'Logged in to the system'),
(37, '11', 'Frans Ababa', '2025-05-04 16:15:09', 'Logged in to the system'),
(38, '11', 'Frans Ababa', '2025-05-05 20:32:37', 'Logged in to the system'),
(39, '13', 'Juniel Nogra', '2025-05-16 15:51:07', 'Logged in to the system'),
(40, '13', 'Juniel Nogra', '2025-05-16 15:51:27', 'Logged in to the system'),
(41, '13', 'Juniel Nogra', '2025-05-16 15:52:30', 'Logged in to the system'),
(42, '13', 'Juniel Nogra', '2025-05-16 16:10:26', 'Logged in to the system'),
(43, '13', 'Juniel Nogra', '2025-05-16 16:12:18', 'Logged in to the system'),
(44, '13', 'Juniel Nogra', '2025-05-16 16:13:29', 'Admin added an appointment'),
(45, '13', 'Juniel Nogra', '2025-05-16 16:35:15', 'Logged in to the system'),
(46, '11', 'Frans Ababa', '2025-05-19 16:41:12', 'Logged in to the system'),
(47, '11', 'Frans Ababa', '2025-05-19 16:47:03', 'Logged in to the system'),
(48, '11', 'Frans Ababa', '2025-05-19 16:48:24', 'Logged in to the system'),
(49, '11', 'Frans Ababa', '2025-05-19 16:57:07', 'Logged in to the system'),
(50, '11', 'Frans Ababa', '2025-05-19 16:59:42', 'Logged in to the system'),
(51, '11', 'Frans Ababa', '2025-05-19 17:08:07', 'Logged in to the system'),
(52, '11', 'Frans Ababa', '2025-05-19 17:16:36', 'Logged in to the system'),
(53, '11', 'Frans Ababa', '2025-05-19 17:16:59', 'Logged in to the system'),
(54, '11', 'Frans Ababa', '2025-05-19 17:26:10', 'Logged in to the system'),
(55, '11', 'Frans Ababa', '2025-05-20 07:53:35', 'Logged in to the system'),
(56, '13', 'Juniel Nogra', '2025-05-20 07:54:45', 'Logged in to the system'),
(57, '11', 'Frans Ababa', '2025-05-20 07:57:39', 'Logged in to the system'),
(58, '13', 'Juniel Nogra', '2025-05-20 08:01:42', 'Logged in to the system'),
(59, '13', 'Juniel Nogra', '2025-05-24 06:26:31', 'Logged in to the system'),
(60, '13', 'Juniel Nogra', '2025-05-24 06:37:14', 'Logged in to the system'),
(61, '13', 'Juniel Nogra', '2025-05-24 06:40:46', 'Logged in to the system'),
(62, '11', 'Frans Ababa', '2025-05-24 06:45:47', 'Logged in to the system'),
(63, '13', 'Juniel Nogra', '2025-05-24 16:17:42', 'Logged in to the system'),
(64, '13', 'Juniel Nogra', '2025-05-24 16:18:16', 'Admin added an appointment'),
(65, '13', 'Juniel Nogra', '2025-05-24 16:51:19', 'Logged in to the system'),
(66, '13', 'Juniel Nogra', '2025-05-24 16:53:09', 'Logged in to the system'),
(67, '13', 'Juniel Nogra', '2025-05-24 16:53:50', 'Logged in to the system'),
(68, '11', 'Frans Ababa', '2025-05-24 17:03:31', 'Logged in to the system'),
(69, '11', 'Frans Ababa', '2025-05-24 17:05:23', 'Logged in to the system'),
(70, '11', 'Frans Ababa', '2025-05-24 17:06:41', 'Logged in to the system'),
(71, '11', 'Frans Ababa', '2025-05-24 17:08:00', 'Logged in to the system'),
(72, '11', 'Frans Ababa', '2025-05-24 17:09:58', 'Logged in to the system'),
(73, '11', 'Frans Ababa', '2025-05-24 17:11:43', 'Logged in to the system'),
(74, '11', 'Frans Ababa', '2025-05-24 17:12:33', 'Logged in to the system'),
(75, '11', 'Frans Ababa', '2025-05-24 17:15:00', 'Logged in to the system'),
(76, '11', 'Frans Ababa', '2025-05-24 17:16:19', 'Logged in to the system'),
(77, '11', 'Frans Ababa', '2025-05-24 17:16:59', 'Logged in to the system'),
(78, '11', 'Frans Ababa', '2025-05-24 17:18:21', 'Logged in to the system'),
(79, '11', 'Frans Ababa', '2025-05-25 07:53:29', 'Logged in to the system'),
(80, '11', 'Frans Ababa', '2025-05-25 07:55:10', 'Logged in to the system'),
(81, '11', 'Frans Ababa', '2025-05-25 07:57:25', 'Logged in to the system'),
(82, '11', 'Frans Ababa', '2025-05-25 07:57:52', 'Logged in to the system'),
(83, '11', 'Frans Ababa', '2025-05-25 07:58:13', 'Logged in to the system'),
(84, '11', 'Frans Ababa', '2025-05-25 07:58:46', 'Logged in to the system'),
(85, '11', 'Frans Ababa', '2025-05-25 07:59:25', 'Logged in to the system'),
(86, '11', 'Frans Ababa', '2025-05-25 07:59:52', 'Logged in to the system'),
(87, '11', 'Frans Ababa', '2025-05-25 08:01:29', 'Logged in to the system'),
(88, '11', 'Frans Ababa', '2025-05-25 08:01:45', 'Logged in to the system'),
(89, '11', 'Frans Ababa', '2025-05-25 08:04:04', 'Logged in to the system'),
(90, '11', 'Frans Ababa', '2025-05-25 08:04:23', 'Logged in to the system'),
(91, '11', 'Frans Ababa', '2025-05-25 08:06:01', 'Logged in to the system'),
(92, '11', 'Frans Ababa', '2025-05-25 08:06:40', 'Logged in to the system'),
(93, '11', 'Frans Ababa', '2025-05-25 08:08:03', 'Logged in to the system'),
(94, '11', 'Frans Ababa', '2025-05-25 08:08:55', 'Logged in to the system'),
(95, '11', 'Frans Ababa', '2025-05-25 08:11:19', 'Logged in to the system'),
(96, '11', 'Frans Ababa', '2025-05-25 08:26:24', 'Logged in to the system'),
(97, '11', 'Frans Ababa', '2025-05-25 08:26:51', 'Logged in to the system'),
(98, '11', 'Frans Ababa', '2025-05-25 08:27:53', 'Logged in to the system');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_medicines`
--

CREATE TABLE `tbl_medicines` (
  `m_id` int(11) NOT NULL,
  `m_name` varchar(100) NOT NULL,
  `m_desc` text NOT NULL,
  `m_qty` int(11) NOT NULL,
  `m_expiry` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_medicines`
--

INSERT INTO `tbl_medicines` (`m_id`, `m_name`, `m_desc`, `m_qty`, `m_expiry`) VALUES
(1, 'Paracetamol', 'For fever and mild pain', 200, '2023-01-01'),
(2, 'Amoxicillin', 'Antibiotic for infections', 157, '2028-01-01'),
(3, 'Lagundi', 'Herbal cough remedy', 300, '2027-01-01');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_medicine_release`
--

CREATE TABLE `tbl_medicine_release` (
  `mr_id` int(11) NOT NULL,
  `m_id` int(11) NOT NULL,
  `a_id` int(11) NOT NULL,
  `qty_released` int(11) NOT NULL,
  `released_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_medicine_release`
--

INSERT INTO `tbl_medicine_release` (`mr_id`, `m_id`, `a_id`, `qty_released`, `released_date`) VALUES
(4, 2, 4, 23, '2026-01-01'),
(5, 2, 1, 5, '2026-01-01');

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
  `u_pass` varchar(128) NOT NULL,
  `u_status` varchar(20) NOT NULL,
  `u_image` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_contact`, `u_type`, `u_username`, `u_pass`, `u_status`, `u_image`) VALUES
(1, 'Nash', 'Sanchez', 'nash2gmail.com', '09617294116', 'Municipal Health Officer', 'nashsu123', 'Nash12$', 'Active', ''),
(2, 'Jericho', 'Alcala', 'jericho@gmail.com', '12345678900', 'Frontdesk', 'imhimjericho', 'asas', 'Active', ''),
(3, 'Juniel', 'Nogra', 'juniel@gmail.com', '12345678900', 'Staff', 'juniell123', '12345678', 'Active', ''),
(8, 'Aaron', 'Requiroso', 'aaron@gmail.com', '09152199508', 'Municipal Health Officer', 'aaron123', 'aaron123567', 'Active', ''),
(9, 'Keycee', 'Bolambot', 'keycee@gmail.com', '09617294116', 'Frontdesk', 'keyceeflare', '123456789', 'Active', ''),
(10, 'Steve', 'Lyle', 'lyle@gmail.com', '09617294116', 'Patient', 'lyle123', 'lyle123456', 'Active', ''),
(11, 'Frans', 'Ababa', 'batiisjimin@gmail.com', '09784746432', 'Municipal Health Officer', 'frans123', '34c4e96ff5d8ffb08cda92e075c40c1faaf6bf0e1761e6544892440811a7ff8639900ac95cf0d0aaa793412545157a84d789b108dd3ef7561e7f0c1d9e3db596', 'Active', ''),
(12, 'Vinny', 'Nolson', 'vinny@gmail.com', '09617294116', 'Patient', 'vinny123', '', 'Active', 'src/userimages/admin.png'),
(13, 'Juniel', 'Nogra', 'junielgwaps@gmail.com', '1234568900', 'Patient', 'juniel12345', '51031aa1004af00c0c95ef92b051d868ce41a0e0260ebd8c79bf5def195d68292f08a5cf2a5b71fcd2b61e7d158f8037a1718dd71d40a0c277bfb86713334012', 'Active', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_appointments`
--
ALTER TABLE `tbl_appointments`
  ADD PRIMARY KEY (`a_id`),
  ADD KEY `fk_user_appointment` (`u_id`);

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `tbl_medicines`
--
ALTER TABLE `tbl_medicines`
  ADD PRIMARY KEY (`m_id`);

--
-- Indexes for table `tbl_medicine_release`
--
ALTER TABLE `tbl_medicine_release`
  ADD PRIMARY KEY (`mr_id`),
  ADD KEY `m_id` (`m_id`),
  ADD KEY `fk_medicine_release_appointment` (`a_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_appointments`
--
ALTER TABLE `tbl_appointments`
  MODIFY `a_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=99;

--
-- AUTO_INCREMENT for table `tbl_medicines`
--
ALTER TABLE `tbl_medicines`
  MODIFY `m_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_medicine_release`
--
ALTER TABLE `tbl_medicine_release`
  MODIFY `mr_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_appointments`
--
ALTER TABLE `tbl_appointments`
  ADD CONSTRAINT `fk_user_appointment` FOREIGN KEY (`u_id`) REFERENCES `users` (`u_id`) ON DELETE CASCADE;

--
-- Constraints for table `tbl_medicine_release`
--
ALTER TABLE `tbl_medicine_release`
  ADD CONSTRAINT `fk_medicine_release_appointment` FOREIGN KEY (`a_id`) REFERENCES `tbl_appointments` (`a_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `tbl_medicine_release_ibfk_1` FOREIGN KEY (`m_id`) REFERENCES `tbl_medicines` (`m_id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
