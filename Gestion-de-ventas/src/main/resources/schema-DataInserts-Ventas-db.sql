-- Insertar Clientes
INSERT INTO Customer (name, email) VALUES ('Alice Johnson', 'alice@example.com');
INSERT INTO Customer (name, email) VALUES ('Bob Smith', 'bob@example.com');
INSERT INTO Customer (name, email) VALUES ('Charlie Davis', 'charlie@example.com');

-- Insertar Productos
INSERT INTO Product (name, price) VALUES ('Laptop', 1200.50);
INSERT INTO Product (name, price) VALUES ('Mouse', 25.00);
INSERT INTO Product (name, price) VALUES ('Keyboard', 45.99);
INSERT INTO Product (name, price) VALUES ('Monitor', 300.00);
INSERT INTO Product (name, price) VALUES ('USB Drive', 15.50);

-- Insertar Pedidos
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-20', 1545.50, 1);
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-21', 65.99, 2);

-- Insertar Detalles de Pedido (CORREGIDO)
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 1200.50, 1, 1); -- Laptop
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 300.00, 1, 4);   -- Monitor
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 45.99, 2, 3);   -- Keyboard
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (2, 25.00, 2, 2);   -- Mouse
