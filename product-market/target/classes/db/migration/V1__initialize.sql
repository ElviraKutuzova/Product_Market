create table customers (
    id                      bigserial,
    name                    varchar(255) not null,
    primary key (id)
   );

create table products(
    id              bigserial primary key,
    title           varchar (255),
    price           int
);

create table orders(
    id                  bigserial primary key,
    customer_id         bigint references customers(id),
    product_id          bigint references products(id),
    current_price       int
);

insert into customers(name)
values
('Mascha'),
('John'),
('Lisa');

insert into products (title, price)
values
('Apple', 35),
('Milk', 41),
('Orange', 33),
('Water', 22),
('Bread', 15),
('Grape', 81),
('Mango', 43),
('Pear', 19),
('Plum', 75),
('Lime', 69),
('Coconut', 67),
('Banana', 33),
('Nictarine', 94),
('Strawberry', 71),
('Watermelon', 58),
('Cherry', 49),
('Cucumber', 44),
('Tomato', 32),
('Nut', 92),
('Melon', 29);

insert into orders(customer_id, product_id, current_price)
values
(1,1,24);
