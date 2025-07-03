-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-07-2025 a las 21:23:30
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `punto_venta_java`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `ID` int(11) NOT NULL,
  `DNI` int(20) NOT NULL,
  `NOMBRE` varchar(100) NOT NULL,
  `TELEFONO` bigint(15) NOT NULL,
  `DIRECCION` varchar(100) NOT NULL,
  `RAZON_SOCIAL` varchar(100) NOT NULL,
  `FECHA` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`ID`, `DNI`, `NOMBRE`, `TELEFONO`, `DIRECCION`, `RAZON_SOCIAL`, `FECHA`) VALUES
(14, 703052443, 'violeta', 9635276375, 'villa el salvador', '', '2025-06-11 12:14:59'),
(15, 43434, 'vanesa', 5989665634, 'lirios', '.', '2025-06-11 12:25:37'),
(16, 3346, 'manuel', 97567319, 'lima', '', '2025-06-11 12:26:05'),
(17, 842, 'melisa', 19735463, 'san juan', '', '2025-06-11 12:26:27'),
(18, 4546, 'juan', 566788980, 'lima', '', '2025-06-11 12:58:02');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `configuracion`
--

CREATE TABLE `configuracion` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(100) NOT NULL,
  `RUT` bigint(20) DEFAULT NULL,
  `TELEFONO` bigint(20) DEFAULT NULL,
  `DIRECCION` varchar(100) NOT NULL,
  `RAZON_SOCIAL` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `configuracion`
--

INSERT INTO `configuracion` (`ID`, `NOMBRE`, `RUT`, `TELEFONO`, `DIRECCION`, `RAZON_SOCIAL`) VALUES
(1, 'sede principal', 234, 4456679898, 'lima', 'distribuidora de productos'),
(2, 'sede sur', 234, 4456679898, 'san juan', 'distribuidora de productos ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE `detalle` (
  `ID` int(11) NOT NULL,
  `CODIGO_PRODUCTO` varchar(30) DEFAULT NULL,
  `CANTIDAD` int(11) NOT NULL,
  `PRECIO` decimal(10,2) NOT NULL,
  `ID_VENTA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`ID`, `CODIGO_PRODUCTO`, `CANTIDAD`, `PRECIO`, `ID_VENTA`) VALUES
(26, '', 5, 25000.00, 0),
(27, '', 5, 25.00, 0),
(28, '100', 8, 32.00, 0),
(29, 'prueba', 13, 27.89, 0),
(30, '202', 4, 8.00, 0),
(31, '204', 1, 15.00, 0),
(32, '67', 6, 18.00, 0),
(33, '623', 1, 10.00, 0),
(34, '089', 3, 13.00, 0),
(35, 't67', 3, 1200.00, 0),
(36, '82', 1, 2.00, 0),
(37, '012', 2, 12.00, 0),
(38, '231', 124, 1200.00, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `ID` int(11) NOT NULL,
  `CODIGO` varchar(50) NOT NULL,
  `DESCRIPCION` varchar(255) NOT NULL,
  `PROVEEDOR` varchar(100) NOT NULL,
  `STOCK` int(11) NOT NULL,
  `PRECIO` decimal(10,2) NOT NULL,
  `FECHA` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`ID`, `CODIGO`, `DESCRIPCION`, `PROVEEDOR`, `STOCK`, `PRECIO`, `FECHA`) VALUES
(2, 't67', 'Jabon Palmolive', 'Margot Robbie', 115, 1200.00, '2025-05-01 17:18:22'),
(43, '102', '6x leche evaporada', 'Ideal', 9, 15.00, '2025-06-01 17:18:22'),
(44, '463', '1l de aceite', 'mirasol', 6, 9.00, '2025-06-05 17:18:22'),
(45, '117', '1k de arroz', 'Alicorp', 20, 3.50, '2025-06-11 17:18:22'),
(46, '201', '1pack de pasta dental', 'Colgate', 34, 12.00, '2025-06-11 17:18:22'),
(47, '204', '3L de agua', 'Cielo', 19, 4.00, '2025-06-01 17:20:22'),
(48, '205', '1pack x 3 gaseosa', 'Fanta', 3, 15.00, '2025-06-01 17:20:22'),
(49, '901', 'shampoon pantene de 1L', 'Alicorp', 6, 12.00, '2025-06-01 17:23:22'),
(50, '343', '3l de agua', 'Alicorp', 7, 4.00, '2025-06-11 12:59:22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `ID` int(20) NOT NULL,
  `RUT` bigint(20) NOT NULL,
  `NOMBRE` varchar(100) NOT NULL,
  `TELEFONO` bigint(15) NOT NULL,
  `DIRECCION` varchar(100) NOT NULL,
  `RAZON_SOCIAL` varchar(100) NOT NULL,
  `FECHA` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`ID`, `RUT`, `NOMBRE`, `TELEFONO`, `DIRECCION`, `RAZON_SOCIAL`, `FECHA`) VALUES
(8, 36348, 'gloria', 464677, 'lima', 'distribucion de productos lacteos', '2025-06-11 12:16:06'),
(9, 102, 'pepsico', 578893424, 'lima', 'distribuidora de gaseosa', '2025-06-11 12:27:12'),
(10, 104, 'vega', 387463495, 'lima', 'productos alimenticios', '2025-06-11 12:28:11'),
(11, 104, 'Alicorp', 387463495, 'lima', 'variaedad de productos', '2025-06-11 12:28:11'),
(12, 658874, 'coca cola', 56676887, 'lima', 'distribuidora de gaseosa', '2025-06-11 12:58:40');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(100) NOT NULL,
  `CORREO` varchar(100) NOT NULL,
  `PASSWORD` varchar(100) NOT NULL,
  `ROL` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID`, `NOMBRE`, `CORREO`, `PASSWORD`, `ROL`) VALUES
(11, 'Prueba', 'prueba@mail.com', '1234', 'Asistente'),
(12, 'vanesa', 'vanesa13@gmail.com', '12345', 'Administrador'),
(14, 'carlos', 'carlos12@gmail.com', '2010', 'Administrador'),
(20, 'violeta', 'violeta12@gmail.com', '2010', 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `ID` int(11) NOT NULL,
  `CLIENTE` varchar(100) NOT NULL,
  `VENDEDOR` varchar(100) NOT NULL,
  `TOTAL` decimal(12,2) NOT NULL,
  `FECHA` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `configuracion`
--
ALTER TABLE `configuracion`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `detalle`
--
ALTER TABLE `detalle`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `configuracion`
--
ALTER TABLE `configuracion`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `detalle`
--
ALTER TABLE `detalle`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
