-- Creación de tabla Categorias en la base de datos "bdmibiblioteca"
CREATE TABLE bdmibiblioteca.Categorias (
  Nombre VARCHAR(45) PRIMARY KEY,
  Descripcion VARCHAR(255) NOT NULL
);

-- Inserción de valores de ejemplo en la tabla Categorias
INSERT INTO bdmibiblioteca.Categorias (Nombre, Descripcion)
VALUES 
  ('Ficción', 'Libros de ficción'),
  ('No ficción', 'Libros de no ficción'),
  ('Autoayuda', 'Libros de autoayuda');

-- Creación de tabla Libros en la base de datos "bdmibiblioteca"
CREATE TABLE bdmibiblioteca.Libros (
  isbn VARCHAR(10) PRIMARY KEY,
  titulo VARCHAR(45) NOT NULL,
  autor VARCHAR(25) NOT NULL,
  precio INT NOT NULL,
  Categoria VARCHAR(45) NOT NULL,
  FOREIGN KEY (Categoria) REFERENCES bdmibiblioteca.Categorias(Nombre)
);

-- Inserción de valores de ejemplo en la tabla Libros
INSERT INTO bdmibiblioteca.Libros (isbn, titulo, autor, precio, Categoria)
VALUES
  ('1234567890', 'El nombre del viento', 'Patrick Rothfuss', 150, 'Ficción'),
  ('2345678901', 'Cien años de soledad', 'Gabriel García Márquez', 200, 'Ficción'),
  ('3456789012', 'Breve historia del tiempo', 'Stephen Hawking', 250, 'No ficción'),
  ('4567890123', 'El arte de amar', 'Erich Fromm', 100, 'Autoayuda');
