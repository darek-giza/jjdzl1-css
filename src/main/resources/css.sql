-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: asgard-mysql
-- Czas generowania: 21 Lut 2019, 18:52
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
  `body_type` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `seats` int(2) NOT NULL,
  `transmission` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `reservation_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Zrzut danych tabeli `cars`
--

INSERT INTO `cars` (`car_id`, `car_type`, `make`, `model`, `year`, `mileage`, `fuel_source`, `engine_power`, `color`, `body_type`, `seats`, `transmission`, `reservation_id`) VALUES
(1, 1, 'BMW', 'M5', 2015, 65000, 'PETROL', 350, 'WHITE', 'SEDAN', 5, 'MANUAL', '1'),
(2, 1, 'Audi', 'R8', 2015, 35000, 'PETROL', 435, 'RED', 'COUPE', 5, 'AUTOMATIC', '2'),
(3, 1, 'BMW', 'E90', 2011, 65000, 'DIESEL', 220, 'WHITE', 'SEDAN', 5, 'MANUAL', '3'),
(4, 1, 'Audi', 'Q5', 2017, 60000, 'DIESEL', 240, 'SILVER', 'COUPE', 5, 'AUTOMATIC', '4'),
(5, 1, 'BMW', 'M3', 2015, 120000, 'DIESEL', 435, 'BLACK', 'COUPE', 4, 'MANUAL', '5'),
(6, 1, 'BMW', 'X3', 2016, 15000, 'DIESEL', 200, 'SILVER', 'SUV', 7, 'AUTOMATIC', '6'),
(7, 1, 'Opel', 'Astra', 2018, 15000, 'PETROLANDGAS', 75, 'RED', 'SEDAN', 5, 'MANUAL', '7'),
(8, 1, 'Opel', 'Meriva', 2014, 35000, 'DIESEL', 130, 'BEIGE', 'SEDAN', 7, 'AUTOMATIC', '8'),
(9, 1, 'Opel', 'Insignia', 2019, 5000, 'DIESEL', 180, 'BLACK', 'COUPE', 5, 'AUTOMATIC', '9'),
(10, 1, 'Toyota', 'C-HR', 2017, 25000, 'DIESEL', 170, 'WHITE', 'SUV', 7, 'AUTOMATIC', '10'),
(101, 2, 'Mercedes', 'ML350', 2016, 115000, 'PETROL', 280, 'BLACK', 'SUV', 7, 'AUTOMATIC', '12'),
(102, 2, 'Jeep', 'Cherokee', 2018, 15000, 'DIESEL', 180, 'RED', 'SUV', 7, 'AUTOMATIC', '13'),
(103, 2, 'Mitsubishi', 'L200', 2013, 76000, 'DIESEL', 235, 'BLACK', 'SUV', 7, 'AUTOMATIC', '14'),
(104, 2, 'Mercedes', 'GLK', 2009, 160000, 'DIESEL', 265, 'BLACK', 'SUV', 7, 'AUTOMATIC', '15'),
(201, 1, 'Porsche', 'Cayenne', 2016, 35000, 'PETROL', 280, 'BLACK', 'SUV', 5, 'AUTOMATIC', '11'),
(301, 3, 'Mercedes', 'Sprinter', 2016, 60000, 'DIESEL', 190, 'WHITE', 'WAGON', 3, 'MANUAL', '16'),
(302, 3, 'Mercedes', 'Sprinter', 2018, 35000, 'DIESEL', 180, 'WHITE', 'WAGON', 3, 'MANUAL', '17'),
(303, 3, 'Mercedes', 'Vito', 2013, 130000, 'DIESEL', 130, 'WHITE', 'WAGON', 3, 'MANUAL', '18'),
(304, 3, 'Iveco', 'Daily', 2015, 235000, 'DIESEL', 280, 'WHITE', 'WAGON', 3, 'MANUAL', '19');

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
  `reservation_id` varchar(100) NOT NULL,
  `car_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `reservations`
--

INSERT INTO `reservations` (`reservation_id`, `car_id`, `user_id`, `start_date`, `end_date`) VALUES
('1', 10, 1, '2018-10-10', '2018-10-15'),
('10', 9, 1, '2018-10-10', '2018-10-30'),
('11', 1, 1, '2018-10-10', '2018-10-20'),
('12', 101, 2, '2019-04-05', '2019-04-06'),
('13', 201, 1, '2018-10-10', '2018-10-30'),
('2', 5, 1, '2018-10-10', '2018-10-15'),
('3', 301, 1, '2018-10-10', '2018-10-15'),
('4', 3, 1, '2018-10-10', '2018-10-20'),
('5', 201, 2, '2018-12-01', '2018-12-01'),
('6', 101, 1, '2019-02-04', '2019-02-09'),
('7', 201, 1, '2019-01-20', '2019-03-10'),
('8', 2, 1, '2018-10-10', '2019-12-30'),
('9', 4, 2, '2018-10-10', '2018-11-01');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `users`
--

CREATE TABLE `users` (
  `user_id` int(12) NOT NULL,
  `login` varchar(25) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phone_number` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `first_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `birth_date` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `street_address` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `post_code` varchar(6) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `reservation_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `users`
--

INSERT INTO `users` (`user_id`, `login`, `password`, `email`, `phone_number`, `first_name`, `last_name`, `birth_date`, `street_address`, `post_code`, `city`, `reservation_id`) VALUES
(1, 'admin', '12345', 'admin@example.com', '601001001', 'Admin', 'Aplikacji', '1980-01-01', 'Chopina 10', '20-140', 'Lublin', '1'),
(2, 'marek', 'maro123', 'marek@example.com', '691029123', 'Marek', 'Kowalski', '1980-01-01', 'Koncertowa 4', '20-155', 'Lublin', '2'),
(3, 'Ewa', 'eww11.', 'ewa@example.com', '691029123', 'Ewa', 'Konieczna', '1980-01-01', 'Nadbystrzycka 48A', '20-123', 'Lublin', '3'),
(4, 'darek', '0000', 'darek_giza@op.pl', '772123124', 'Darek', 'Giza', '1980-01-01', 'Al. Królewska 41', '20-121', 'Lublin', '4');

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
-- Indeksy dla tabeli `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`reservation_id`);

--
-- Indeksy dla tabeli `users`
--
ALTER TABLE `users`
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
-- AUTO_INCREMENT dla tabeli `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
