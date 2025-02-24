-- Insert data into the usuario table
INSERT INTO usuario (nombre, email, fecha_registro) VALUES ('Juan', 'juan@gmail.com', '2023-01-01');
INSERT INTO usuario (nombre, email, fecha_registro) VALUES ('Pedro', 'pedro@gmail.com', '2023-01-01');
INSERT INTO usuario (nombre, email, fecha_registro) VALUES ('Maria', 'maria@gmail.com', '2023-01-01');


-- Insert data into the libro table
INSERT INTO libro (titulo, autor, categoria, disponible) VALUES ('Cien años de soledad', 'Gabriel García Márquez', 'Ficción', TRUE);
INSERT INTO libro (titulo, autor, categoria, disponible) VALUES ('Don Quijote de la Mancha', 'Miguel de Cervantes', 'Clásico', TRUE);
INSERT INTO libro (titulo, autor, categoria, disponible) VALUES ('1984', 'George Orwell', 'Distopía', FALSE);
INSERT INTO libro (titulo, autor, categoria, disponible) VALUES ('El principito', 'Antoine de Saint-Exupéry', 'Infantil', FALSE);
INSERT INTO libro (titulo, autor, categoria, disponible) VALUES ('La sombra del viento', 'Carlos Ruiz Zafón', 'Misterio', TRUE);

-- Insert data into the prestamo table

INSERT INTO prestamo (fecha_prestamo, fecha_devolucion, estado, libro_id, user_id) VALUES ('2024-01-01', '2024-01-15', 'PRESTADO', 1, 1);
INSERT INTO prestamo (fecha_prestamo, fecha_devolucion, estado, libro_id, user_id) VALUES ('2024-02-01', '2024-02-14', 'DEVUELTO', 2, 2);
INSERT INTO prestamo (fecha_prestamo, fecha_devolucion, estado, libro_id, user_id) VALUES ('2024-03-01', '2024-03-15', 'PRESTADO', 3, 3);
INSERT INTO prestamo (fecha_prestamo, fecha_devolucion, estado, libro_id, user_id) VALUES ('2024-04-01', '2024-04-10', 'DEVUELTO', 4, 2);
INSERT INTO prestamo (fecha_prestamo, fecha_devolucion, estado, libro_id, user_id) VALUES ('2024-05-01', '2024-05-12', 'PRESTADO', 5, 1);