CREATE TABLE customer_roles(
    customer_id int not null,
    roles varchar(255) not null,
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);