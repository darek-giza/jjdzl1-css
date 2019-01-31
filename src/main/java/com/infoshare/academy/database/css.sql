-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: asgard-mysql
-- Czas generowania: 30 Sty 2019, 23:55
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
-- Struktura tabeli dla tabeli `car`
--

CREATE TABLE `car` (
  `id` int(3) NOT NULL,
  `make` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `model` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `year` int(4) NOT NULL,
  `mileage` int(6) NOT NULL,
  `fuelSourceEnum` text CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `enginePower` int(3) NOT NULL,
  `colorEnum` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bodyTypeEnum` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `seats` int(1) NOT NULL,
  `transmissionEnum` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `drive` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hasWinch` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hasTrunk` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `capacity` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cargoSpace` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hasLift` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Zrzut danych tabeli `car`
--

INSERT INTO `car` (`id`, `make`, `model`, `year`, `mileage`, `fuelSourceEnum`, `enginePower`, `colorEnum`, `bodyTypeEnum`, `seats`, `transmissionEnum`, `drive`, `hasWinch`, `hasTrunk`, `capacity`, `cargoSpace`, `hasLift`) VALUES
(101, 'Audi      ', 'A4      ', 2004, 160000, 'PETROL      ', 163, 'BLACK ', 'SEDAN    ', 5, 'MANUAL   ', ' ', '     ', '     ', '    ', '  ', ''),
(102, 'Audi      ', 'A4      ', 2006, 317000, 'DIESEL      ', 140, 'RED   ', 'WAGON    ', 5, 'SEMIAUTO ', ' ', '     ', '     ', '    ', '  ', ''),
(103, 'Audi      ', 'R8      ', 2014, 113000, 'PETROL      ', 435, 'SILVER', 'COUPE    ', 5, 'AUTOMATIC', ' ', '     ', '     ', '    ', '  ', ''),
(104, 'BMW       ', 'E90     ', 2008, 270000, 'DIESEL      ', 210, 'WHITE ', 'SEDAN    ', 5, 'MANUAL   ', ' ', '     ', '     ', '    ', '  ', ''),
(105, 'BMW       ', 'X3      ', 2010, 193000, 'DIESEL      ', 140, 'WHITE ', 'SUV      ', 5, 'AUTOMATIC', ' ', '     ', '     ', '    ', '  ', ''),
(106, 'Opel      ', 'Astra   ', 2003, 205000, 'PETROLANDGAS', 125, 'RED   ', 'HATCHBACK', 5, 'MANUAL   ', ' ', '     ', '     ', '    ', '  ', ''),
(107, 'Opel      ', 'Meriva  ', 2004, 240000, 'PETROL      ', 101, 'BLACK ', 'MINIVAN  ', 5, 'SEMIAUTO ', ' ', '     ', '     ', '    ', '  ', ''),
(108, 'Opel      ', 'Vectra  ', 1998, 320000, 'PETROL      ', 85, 'BIEGE ', 'SEDAN    ', 5, 'MANUAL   ', ' ', '     ', '     ', '    ', '  ', ''),
(109, 'Toyota    ', 'C-HR    ', 2017, 18000, 'HYBRID      ', 136, 'PURPLE', 'CROSSOVER', 5, 'AUTOMATIC', ' ', '     ', '     ', '    ', '  ', ''),
(110, 'Porsche   ', 'Cayenne ', 2013, 139000, 'DIESEL      ', 385, 'ORANGE', 'SUV      ', 5, 'SEMIAUTO ', ' ', '     ', '     ', '    ', '  ', ''),
(201, 'Mercedes  ', 'ML350   ', 2010, 100000, 'PETROL      ', 250, 'BLACK ', 'SUV      ', 5, 'AUTOMATIC', '4', 'false', 'false', '    ', '  ', ''),
(202, 'Jeep      ', 'Cherokee', 2010, 100000, 'DIESEL      ', 180, 'RED   ', 'SUV      ', 5, 'AUTOMATIC', '4', 'false', 'false', '    ', '  ', ''),
(203, 'Mitsubishi', 'L200    ', 2012, 100000, 'DIESEL      ', 220, 'RED   ', 'SUV      ', 5, 'AUTOMATIC', '4', 'true ', 'true ', '    ', '  ', ''),
(301, 'Mercedes  ', 'Sprinter', 2005, 150000, 'DIESEL      ', 150, 'WHITE ', 'WAGON    ', 3, 'AUTOMATIC', '2', '     ', '     ', '1000', '15', 'false'),
(302, 'Mercedes  ', 'Vito    ', 2010, 150000, 'DIESEL      ', 150, 'WHITE ', 'WAGON    ', 3, 'AUTOMATIC', '2', '     ', '     ', '1000', '10', 'false'),
(303, 'Iveco     ', 'Daily   ', 2010, 150000, 'DIESEL      ', 200, 'WHITE ', 'WAGON    ', 3, 'MANUAL   ', '2', '     ', '     ', '2500', '25', 'true');

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
-- Struktura tabeli dla tabeli `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `login` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `first_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `last_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `adult` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `users`
--

INSERT INTO `users` (`user_id`, `login`, `email`, `password`, `phone_number`, `first_name`, `last_name`, `address`, `adult`) VALUES
(1, 'admin', 'admin@google.com', '12345', '0', '0', '0', '0', NULL),
(2, 'user1', 'user1@google.com', 'pass123', '0', '0', '0', '0', NULL),
(3, 'user2', 'user2@google.com', '123pass', '0', '0', '0', '0', NULL);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `car_types`
--
ALTER TABLE `car_types`
  ADD PRIMARY KEY (`type_id`),
  ADD UNIQUE KEY `type` (`type`);

--
-- Indeksy dla tabeli `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `car_types`
--
ALTER TABLE `car_types`
  MODIFY `type_id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT dla tabeli `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
