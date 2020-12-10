MERGE INTO `role` VALUES (1,'USER');

INSERT INTO `product`(product_id, price, description, name, flavor, color, icing_flavor, cake_sprinkles, category, img_url, brand, quantity) SELECT * FROM csvread('database_v2.csv'); 


