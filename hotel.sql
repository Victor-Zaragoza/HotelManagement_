-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-07-2021 a las 04:58:02
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `NAME` varchar(50) DEFAULT NULL,
  `CIUDAD` varchar(50) DEFAULT NULL,
  `HABITACION` int(3) NOT NULL,
  `DIAS` int(2) NOT NULL,
  `TOTPERSONAS` int(2) NOT NULL,
  `COSTOEXTRA` int(4) NOT NULL,
  `INGRESO` date NOT NULL,
  `SALIDA` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`NAME`, `CIUDAD`, `HABITACION`, `DIAS`, `TOTPERSONAS`, `COSTOEXTRA`, `INGRESO`, `SALIDA`) VALUES
('Manuel Ramirez', 'Toronto', 119, 5, 1, 0, '2021-06-15', '2021-06-20'),
('Anita Macia', 'Denver', 123, 4, 1, 0, '2021-06-16', '2021-06-20'),
('Jose Zaragoza ', 'Paris', 214, 1, 3, 1800, '2021-06-17', '2021-06-18'),
('Elen Chufe', 'Yucatan', 218, 1, 3, 1500, '2021-06-17', '2021-06-18'),
('Armando Mendez', 'Monterrey', 225, 1, 5, 5400, '2021-06-17', '2021-06-18');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `cuenta` varchar(10) NOT NULL,
  `password` varchar(32) NOT NULL,
  `foto` varchar(30) NOT NULL,
  `Puesto` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cuenta`, `password`, `foto`, `Puesto`) VALUES
('Victor', '0c9c10a5577ad446d18da14540de9c84', 'Victor.png', 'Gerente general');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `galeria`
--

CREATE TABLE `galeria` (
  `ID` int(2) NOT NULL,
  `RUTA` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `galeria`
--

INSERT INTO `galeria` (`ID`, `RUTA`) VALUES
(1, 'imagen1.png'),
(2, 'imagen2.png'),
(3, 'imagen3.png'),
(4, 'imagen4.png'),
(5, 'imagen5.png'),
(6, 'imagen6.png'),
(7, 'imagen7.png'),
(8, 'imagen8.png'),
(9, 'imagen9.png'),
(10, 'imagen10.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `TIPO` int(1) NOT NULL,
  `HABITACION` int(2) NOT NULL,
  `COSTOHAB` int(4) NOT NULL,
  `DISPONIBLE` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`TIPO`, `HABITACION`, `COSTOHAB`, `DISPONIBLE`) VALUES
(3, 111, 9000, 0),
(2, 112, 5000, 0),
(2, 113, 5000, 0),
(1, 114, 3000, 0),
(2, 115, 5000, 0),
(2, 116, 5000, 0),
(2, 117, 5000, 0),
(3, 118, 9000, 1),
(1, 119, 3000, 1),
(1, 120, 3000, 0),
(1, 121, 3000, 0),
(2, 122, 5000, 0),
(2, 123, 5000, 1),
(1, 124, 3000, 0),
(3, 125, 9000, 0),
(1, 211, 3000, 0),
(1, 212, 3000, 0),
(2, 213, 5000, 0),
(1, 214, 3000, 1),
(1, 215, 3000, 0),
(3, 216, 9000, 1),
(2, 217, 5000, 0),
(2, 218, 5000, 1),
(3, 219, 9000, 0),
(1, 220, 3000, 0),
(1, 221, 3000, 0),
(1, 222, 3000, 1),
(2, 223, 5000, 0),
(3, 224, 9000, 1),
(3, 225, 9000, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`HABITACION`);

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD PRIMARY KEY (`cuenta`);

--
-- Indices de la tabla `galeria`
--
ALTER TABLE `galeria`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`HABITACION`,`TIPO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
