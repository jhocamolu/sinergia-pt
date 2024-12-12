# sinergia-pt

Script mysql:


-- Tabla de clientes
CREATE TABLE clientes (
id_cliente INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100),
telefono VARCHAR(20),
direccion VARCHAR(200),
email VARCHAR(100)
);

-- Tabla de tipos de productos
CREATE TABLE tipos_productos (
id_tipo_producto INT PRIMARY KEY AUTO_INCREMENT,
descripcion VARCHAR(100)
);

-- Tabla de bodegas
CREATE TABLE bodegas (
id_bodega INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100),
direccion VARCHAR(200),
pais VARCHAR(50),
ciudad VARCHAR(50)
);

-- Tabla de puertos
CREATE TABLE puertos (
id_puerto INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100),
pais VARCHAR(50),
ciudad VARCHAR(50)
);

-- Tabla de envíos
CREATE TABLE envios (
id_envio INT PRIMARY KEY AUTO_INCREMENT,
id_cliente INT,
id_tipo_producto INT,
cantidad INT,
fecha_registro DATE,
fecha_entrega DATE,
precio_normal DECIMAL(10,2),
precio_descuento DECIMAL(10,2),
numero_guia VARCHAR(10) UNIQUE,
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
FOREIGN KEY (id_tipo_producto) REFERENCES tipos_productos(id_tipo_producto)
);

-- Tabla de envios_terrestres (hereda de envios)
CREATE TABLE envios_terrestres (
id_envio INT PRIMARY KEY,
id_bodega INT,
placa VARCHAR(6),
FOREIGN KEY (id_envio) REFERENCES envios(id_envio),
FOREIGN KEY (id_bodega) REFERENCES bodegas(id_bodega)
);

-- Tabla de envios_maritimos (hereda de envios)
CREATE TABLE envios_maritimos (
id_envio INT PRIMARY KEY,
id_puerto INT,
numero_flota VARCHAR(8),
FOREIGN KEY (id_envio) REFERENCES envios(id_envio),
FOREIGN KEY (id_puerto) REFERENCES puertos(id_puerto)
);