-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: asgard-mysql
-- Czas generowania: 30 Sty 2019, 13:52
-- Wersja serwera: 8.0.14
-- Wersja PHP: 7.2.13

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
  `make` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `model` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `year` int(4) NOT NULL,
  `mileage` int(10) NOT NULL,
  `fuel_source` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `engine_power` float NOT NULL,
  `seats` int(2) DEFAULT NULL,
  `drive` int(2) DEFAULT NULL,
  `has_winch` tinyint(1) NOT NULL DEFAULT '0',
  `has_trunk` tinyint(1) NOT NULL DEFAULT '0',
  `car_type` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `cars`
--

INSERT INTO `cars` (`car_id`, `make`, `model`, `year`, `mileage`, `fuel_source`, `engine_power`, `seats`, `drive`, `has_winch`, `has_trunk`, `car_type`) VALUES
(1, 'Audi', 'A4', 2004, 160000, 'PETROL', 1.6, NULL, NULL, 0, 0, 0),
(2, 'Audi', 'R8', 2014, 60000, 'PETROL', 2, NULL, NULL, 0, 0, 0),
(3, 'Honda', 'Civic', 2010, 115000, 'DIESEL', 1.9, NULL, NULL, 0, 0, 0);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `car_types`
--

CREATE TABLE `car_types` (
  `type_id` int(2) NOT NULL,
  `type` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Zrzut danych tabeli `car_types`
--

INSERT INTO `car_types` (`type_id`, `type`) VALUES
(1, 'passenger'),
(2, 'offroad'),
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
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Zrzut danych tabeli `users`
--

INSERT INTO `users` (`user_id`, `login`, `email`, `password`) VALUES
(1, 'admin', 'admin@google.com', '12345'),
(2, 'user1', 'user1@google.com', 'pass123'),
(3, 'user2', 'user2@google.com', '123pass');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`car_id`);

--
-- Indeksy dla tabeli `car_types`
--
ALTER TABLE `car_types`
  ADD PRIMARY KEY (`type_id`);

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
  MODIFY `car_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

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
