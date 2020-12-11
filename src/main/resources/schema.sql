MERGE INTO `role` VALUES (1,'USER');

CREATE TABLE IF NOT EXISTS `product` (
    product_id bigint primary key,
    product_name varchar(255),
    price float,
    description varchar(2000),
    flavor varchar(255),
    color varchar(255),
    icing_flavor varchar(255),
    cake_sprinkles varchar(255),
    category varchar(255),
    brand varchar(255)
)
AS SELECT * FROM CSVREAD('classpath:database_product_large_v2.csv');
CREATE TABLE IF NOT EXISTS `category` (
    category_id bigint primary key,
    category_description varchar(2000),
    img_url varchar(2000),
    category varchar(255)
)
AS SELECT * FROM CSVREAD('classpath:database_category_small.csv');