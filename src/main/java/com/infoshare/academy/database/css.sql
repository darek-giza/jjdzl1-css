-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: asgard-mysql
-- Czas generowania: 04 Lut 2019, 21:32
-- Wersja serwera: 8.0.14
-- Wersja PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `css`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `cars`
--

CREATE TABLE `cars` (
  `car_id` int(11) NOT NULL,
  `car_type` int(4) NOT NULL,
  `make` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `model` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `year` int(4) NOT NULL,
  `mileage` int(10) NOT NULL,
  `fuel_source` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `engine_power` float NOT NULL,
  `color` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `body_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
  `seats` int(2) NOT NULL,
  `transmission` varchar(30) CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
  `capacity` int(4) DEFAULT NULL,
  `cargo_space` int(4) DEFAULT NULL,
  `has_lift` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `drive` int(2) DEFAULT NULL,
  `has_winch` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `has_trunk` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_reserved` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `cars`
--

INSERT INTO `cars` (`car_id`, `car_type`, `make`, `model`, `year`, `mileage`, `fuel_source`, `engine_power`, `color`, `body_type`, `seats`, `transmission`, `capacity`, `cargo_space`, `has_lift`, `drive`, `has_winch`, `has_trunk`, `is_reserved`) VALUES
(1, 1, 'BMW', 'M5', 2015, 65000, 'PETROL', 350, 'WHITE', 'SEDAN', 5, 'MANUAL', 0, 0, NULL, NULL, NULL, NULL, NULL),
(2, 1, 'Audi', 'R8', 2015, 35000, 'PETROL', 435, 'RED', 'COUPE', 5, 'AUTOMATIC', 0, 0, NULL, NULL, NULL, NULL, NULL),
(3, 1, 'BMW', 'E90', 2011, 65000, 'DIESEL', 220, 'WHITE', 'SEDAN', 5, 'MANUAL', 0, 0, NULL, NULL, NULL, NULL, NULL),
(4, 1, 'Audi', 'Q5', 2017, 60000, 'DIESEL', 240, 'SILVER', 'COUPE', 5, 'AUTOMATIC', 0, 0, NULL, NULL, NULL, NULL, NULL),
(5, 1, 'BMW', 'M3', 2015, 120000, 'DIESEL', 435, 'BLACK', 'COUPE', 4, 'MANUAL', 0, 0, NULL, NULL, NULL, NULL, NULL),
(6, 1, 'BMW', 'X3', 2016, 15000, 'DIESEL', 200, 'SILVER', 'SUV', 7, 'AUTOMATIC', 0, 0, NULL, NULL, NULL, NULL, NULL),
(7, 1, 'Opel', 'Astra', 2018, 15000, 'PETROLANDGAS', 75, 'RED', 'SEDAN', 5, 'MANUAL', 0, 0, NULL, NULL, NULL, NULL, NULL),
(8, 1, 'Opel', 'Meriva', 2014, 35000, 'DIESEL', 130, 'BEIGE', 'SEDAN', 7, 'AUTOMATIC', 0, 0, NULL, NULL, NULL, NULL, NULL),
(9, 1, 'Opel', 'Insignia', 2019, 5000, 'DIESEL', 180, 'BLACK', 'COUPE', 5, 'AUTOMATIC', 0, 0, NULL, NULL, NULL, NULL, NULL),
(10, 1, 'Toyota', 'C-HR', 2017, 25000, 'DIESEL', 170, 'WHITE', 'SUV', 7, 'AUTOMATIC', 0, 0, NULL, NULL, NULL, NULL, NULL),
(11, 1, 'Porsche', 'Cayenne', 2016, 35000, 'PETROL', 280, 'BLACK', 'SUV', 5, 'AUTOMATIC', 0, 0, NULL, NULL, NULL, NULL, NULL),
(101, 2, 'Mercedes', 'ML350', 2016, 115000, 'PETROL', 280, 'BLACK', 'SUV', 7, 'AUTOMATIC', NULL, NULL, NULL, 4, 'false', 'false', NULL),
(102, 2, 'Jeep', 'Cherokee', 2018, 15000, 'DIESEL', 180, 'RED', 'SUV', 7, 'AUTOMATIC', NULL, NULL, NULL, 4, 'true', 'false', NULL),
(103, 2, 'Mitsubishi', 'L200', 2013, 76000, 'DIESEL', 235, 'BLACK', 'SUV', 7, 'AUTOMATIC', NULL, NULL, NULL, 4, 'true', 'true', NULL),
(104, 2, 'Mercedes', 'GLK', 2009, 160000, 'DIESEL', 265, 'BLACK', 'SUV', 7, 'AUTOMATIC', NULL, NULL, NULL, 4, 'true', 'true', NULL),
(301, 3, 'Mercedes', 'Sprinter', 2016, 60000, 'DIESEL', 190, 'WHITE', 'WAGON', 3, 'MANUAL', 1000, 16, 'false', NULL, NULL, NULL, NULL),
(302, 3, 'Mercedes', 'Sprinter', 2018, 35000, 'DIESEL', 180, 'WHITE', 'WAGON', 3, 'MANUAL', 1200, 20, 'false', NULL, NULL, NULL, NULL),
(303, 3, 'Mercedes', 'Vito', 2013, 130000, 'DIESEL', 130, 'WHITE', 'WAGON', 3, 'MANUAL', 700, 10, 'false', NULL, NULL, NULL, NULL),
(304, 3, 'Iveco', 'Daily', 2015, 235000, 'DIESEL', 280, 'WHITE', 'WAGON', 3, 'MANUAL', 2500, 30, 'true', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `car_types`
--

CREATE TABLE `car_types` (
  `type_id` int(2) NOT NULL,
  `type` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Zrzut danych tabeli `car_types`
--

INSERT INTO `car_types` (`type_id`, `type`) VALUES
(2, 'offroad'),
(1, 'passenger'),
(3, 'truck');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `reservations`
--

CREATE TABLE `reservations` (
  `reservation_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `car_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `reservations`
--

INSERT INTO `reservations` (`reservation_id`, `car_id`, `user_id`, `start_date`, `end_date`) VALUES
('cac876bc-de38-40e7-8981-4008168c3393', 1, 1, '2018-10-10', '2018-10-20'),
('b7a7b093-6b54-47c8-b74a-e57f4c09cb2d', 2, 1, '2018-10-10', '2019-12-30'),
('2ebcdfcd-56a8-4b71-9b92-eef637b00d70', 3, 1, '2018-10-10', '2018-10-20'),
('b7f1d99d-fab5-45e7-ae1f-a9906631b4e3', 4, 1, '2018-10-10', '2018-11-01'),
('22c1abdd-306b-4c7c-a9c7-7cb2d08cd2bd', 301, 1, '2018-10-10', '2018-10-15'),
('19eda3f0-df70-4e37-adcb-c7d8ee7aea43', 5, 1, '2018-10-10', '2018-10-15'),
('181755fa-c277-4364-a908-f9cd92901fc2', 10, 1, '2018-10-10', '2018-10-15'),
('c85a534f-ff5c-4c28-81f1-da1fc11612e2', 9, 1, '2018-10-10', '2018-10-30'),
('fd0ba65a-7be1-440a-bf74-43a5fb1d988b', 201, 1, '2018-10-10', '2018-10-30'),
('49f36477-baed-4814-9bd7-dbac416244bb', 201, 1, '2018-12-01', '2018-12-01'),
('713ac524-e3c8-4b54-b95c-354f600f7d91', 201, 1, '2019-01-20', '2019-03-10'),
('675cfee3-42b1-4166-9d90-0cdb78833046', 101, 1, '2019-02-04', '2019-02-09'),
('de44fcfb-d3a3-4a30-9817-df1967d538d4', 101, 1, '2019-04-05', '2019-04-06');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `login` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `first_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `last_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `house_number` int(10) NOT NULL,
  `parcel_number` int(10) NOT NULL,
  `post_code` varchar(10) NOT NULL,
  `city` varchar(20) NOT NULL,
  `adult` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `user`
--

INSERT INTO `user` (`user_id`, `login`, `email`, `password`, `phone_number`, `first_name`, `last_name`, `address`, `house_number`, `parcel_number`, `post_code`, `city`, `adult`) VALUES
(1, 'admin', 'admin@google.com', '12345', '0', '0', '0', '0', 0, 0, '0', '', NULL),
(2, 'user1', 'user1@google.com', 'pass123', '0', '0', '0', '0', 0, 0, '0', '', NULL),
(3, 'user2', 'user2@google.com', '123pass', '0', '0', '0', '0', 0, 0, '0', '', NULL);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`car_id`) USING BTREE;

--
-- Indeksy dla tabeli `car_types`
--
ALTER TABLE `car_types`
  ADD PRIMARY KEY (`type_id`),
  ADD UNIQUE KEY `type` (`type`);

--
-- Indeksy dla tabeli `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `cars`
--
ALTER TABLE `cars`
  MODIFY `car_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=305;

--
-- AUTO_INCREMENT dla tabeli `car_types`
--
ALTER TABLE `car_types`
  MODIFY `type_id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT dla tabeli `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
