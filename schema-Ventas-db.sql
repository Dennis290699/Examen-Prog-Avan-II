
    create table Customer (
        id integer,
        email varchar(255),
        name varchar(255),
        primary key (id)
    );

    create table OrderItem (
        id integer,
        order_id integer,
        product_id integer,
        quantity integer,
        unitPrice numeric(38,2),
        primary key (id)
    );

    create table Orders (
        customer_id integer,
        id integer,
        totalAmount numeric(38,2),
        orderDate varchar(255),
        primary key (id)
    );

    create table Product (
        id integer,
        price numeric(38,2),
        name varchar(255),
        primary key (id)
    );
INSERT INTO Customer (name, email) VALUES ('Alice Johnson', 'alice@example.com');
INSERT INTO Customer (name, email) VALUES ('Bob Smith', 'bob@example.com');
INSERT INTO Customer (name, email) VALUES ('Charlie Davis', 'charlie@example.com');
INSERT INTO Product (name, price) VALUES ('Laptop', 1200.50);
INSERT INTO Product (name, price) VALUES ('Mouse', 25.00);
INSERT INTO Product (name, price) VALUES ('Keyboard', 45.99);
INSERT INTO Product (name, price) VALUES ('Monitor', 300.00);
INSERT INTO Product (name, price) VALUES ('USB Drive', 15.50);
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-20', 1545.50, 1);
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-21', 65.99, 2);
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 1200.50, 1, 1); -- Laptop;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 300.00, 1, 4);   -- Monitor;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 45.99, 2, 3);   -- Keyboard;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (2, 25.00, 2, 2);   -- Mouse;

    create table Customer (
        id integer,
        email varchar(255),
        name varchar(255),
        primary key (id)
    );

    create table OrderItem (
        id integer,
        order_id integer,
        product_id integer,
        quantity integer,
        unitPrice numeric(38,2),
        primary key (id)
    );

    create table Orders (
        customer_id integer,
        id integer,
        totalAmount numeric(38,2),
        orderDate varchar(255),
        primary key (id)
    );

    create table Product (
        id integer,
        price numeric(38,2),
        name varchar(255),
        primary key (id)
    );
INSERT INTO Customer (name, email) VALUES ('Alice Johnson', 'alice@example.com');
INSERT INTO Customer (name, email) VALUES ('Bob Smith', 'bob@example.com');
INSERT INTO Customer (name, email) VALUES ('Charlie Davis', 'charlie@example.com');
INSERT INTO Product (name, price) VALUES ('Laptop', 1200.50);
INSERT INTO Product (name, price) VALUES ('Mouse', 25.00);
INSERT INTO Product (name, price) VALUES ('Keyboard', 45.99);
INSERT INTO Product (name, price) VALUES ('Monitor', 300.00);
INSERT INTO Product (name, price) VALUES ('USB Drive', 15.50);
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-20', 1545.50, 1);
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-21', 65.99, 2);
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 1200.50, 1, 1); -- Laptop;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 300.00, 1, 4);   -- Monitor;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 45.99, 2, 3);   -- Keyboard;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (2, 25.00, 2, 2);   -- Mouse;

    create table Customer (
        id integer,
        email varchar(255),
        name varchar(255),
        primary key (id)
    );

    create table OrderItem (
        id integer,
        order_id integer,
        product_id integer,
        quantity integer,
        unitPrice numeric(38,2),
        primary key (id)
    );

    create table Orders (
        customer_id integer,
        id integer,
        totalAmount numeric(38,2),
        orderDate varchar(255),
        primary key (id)
    );

    create table Product (
        id integer,
        price numeric(38,2),
        name varchar(255),
        primary key (id)
    );
INSERT INTO Customer (name, email) VALUES ('Alice Johnson', 'alice@example.com');
INSERT INTO Customer (name, email) VALUES ('Bob Smith', 'bob@example.com');
INSERT INTO Customer (name, email) VALUES ('Charlie Davis', 'charlie@example.com');
INSERT INTO Product (name, price) VALUES ('Laptop', 1200.50);
INSERT INTO Product (name, price) VALUES ('Mouse', 25.00);
INSERT INTO Product (name, price) VALUES ('Keyboard', 45.99);
INSERT INTO Product (name, price) VALUES ('Monitor', 300.00);
INSERT INTO Product (name, price) VALUES ('USB Drive', 15.50);
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-20', 1545.50, 1);
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-21', 65.99, 2);
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 1200.50, 1, 1); -- Laptop;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 300.00, 1, 4);   -- Monitor;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 45.99, 2, 3);   -- Keyboard;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (2, 25.00, 2, 2);   -- Mouse;

    create table Customer (
        id integer,
        email varchar(255),
        name varchar(255),
        primary key (id)
    );

    create table OrderItem (
        id integer,
        order_id integer,
        product_id integer,
        quantity integer,
        unitPrice numeric(38,2),
        primary key (id)
    );

    create table Orders (
        customer_id integer,
        id integer,
        totalAmount numeric(38,2),
        orderDate varchar(255),
        primary key (id)
    );

    create table Product (
        id integer,
        price numeric(38,2),
        name varchar(255),
        primary key (id)
    );
INSERT INTO Customer (name, email) VALUES ('Alice Johnson', 'alice@example.com');
INSERT INTO Customer (name, email) VALUES ('Bob Smith', 'bob@example.com');
INSERT INTO Customer (name, email) VALUES ('Charlie Davis', 'charlie@example.com');
INSERT INTO Product (name, price) VALUES ('Laptop', 1200.50);
INSERT INTO Product (name, price) VALUES ('Mouse', 25.00);
INSERT INTO Product (name, price) VALUES ('Keyboard', 45.99);
INSERT INTO Product (name, price) VALUES ('Monitor', 300.00);
INSERT INTO Product (name, price) VALUES ('USB Drive', 15.50);
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-20', 1545.50, 1);
INSERT INTO Orders (orderDate, totalAmount, customer_id) VALUES ('2025-02-21', 65.99, 2);
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 1200.50, 1, 1); -- Laptop;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 300.00, 1, 4);   -- Monitor;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (1, 45.99, 2, 3);   -- Keyboard;
INSERT INTO OrderItem (quantity, unitPrice, order_id, product_id) VALUES (2, 25.00, 2, 2);   -- Mouse;
