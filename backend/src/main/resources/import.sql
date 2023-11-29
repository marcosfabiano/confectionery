INSERT INTO tb_category(name) VALUES ('Bolos');
INSERT INTO tb_category(name) VALUES ('Sobremesas');
INSERT INTO tb_category(name) VALUES ('Tortas');
INSERT INTO tb_category(name) VALUES ('Salgados');
INSERT INTO tb_category(name) VALUES ('Farinhas');
INSERT INTO tb_category(name) VALUES ('Chocolates');
INSERT INTO tb_category(name) VALUES ('Frutas');

INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Farinha de Trigo',  '1', 10.0,   5.0,  3,  22.98, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Açucar Refinado',   '2', 5.0,    1.0,  3,   3.89, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Margarina',         '3', 15.0, 500.0,  2,  25.0,  1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Ovo',               '4', 36,     1.5,  3,  16.0, 1 );
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Nescau',            '5', 5.0,  750.0,  2,  14.0, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Leite Condensado ', '6', 50.0,   348,  2,  7.89, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Leite em Pó',       '7', 6.0,    200,  2,  16.9, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Manteiga',          '8', 8.0,  150.0,  2, 10.27, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Abacaxi',           '9', 2.0,    1.0,  4,  5.65, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Creme de Leite',   '10', 11.0, 100.0,  2,  2.67, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Chantilly',        '11', 8,    300.0,  2,  16.0, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Aguá',             '12', 5.0,    1.0,  1,    2.9, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Açucar',           '13', 22.0,   1.0,  3,    5.6, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Maça',             '14', 7.0,    1.0,  4,  3.75, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Limão',            '15', 15.0,  12.0,  4,   6.7, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Cravo',            '16', 10.0,  20.0,  2,   9.8, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Canela',           '17', 5.0,   10.0,  2,   7.6, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Fermento em Pó',   '18', 4.0,   15.0,  2,  5.99, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Óleo',             '19', 18.0,   1.0,  1,   9.89, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Cenoura',          '20', 2.0,    1.0,  3,   6.89, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Chocolate',        '21', 8.0,    2.0,  3,   29.9, 1);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Bolo de Cenoura',  'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg', 2.0,    1.0,  3,   60.0, 0);
INSERT INTO tb_product (name, img_url, stock_Quantity, package_Quantity, measurement_Unit, price, product_type) VALUES ('Pudim de Leite Consensado','https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/2-big.jpg', 2.0,    1.0,  3,   20.0, 0);

INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 5);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (5, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (6, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (7, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (8, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (9, 7);
INSERT INTO tb_product_category (product_id, category_id) VALUES (10, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (11, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (12, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (13, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (14, 7);
INSERT INTO tb_product_category (product_id, category_id) VALUES (15, 7);
INSERT INTO tb_product_category (product_id, category_id) VALUES (16, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (17, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (18, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (19, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (20, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (21, 6);
INSERT INTO tb_product_category (product_id, category_id) VALUES (22, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (23, 1);

INSERT INTO tb_user (name, email, phone, password, birth_date) VALUES ('Renata Bernardes', 'resinha_ber@gmail.com', '988888888', '$2a$10$BZEayVp6X1Ry93e44/Rnze0hpK5J3ThbAdUm2OzH.GSWjA4zmtGHW', '2001-07-25');
INSERT INTO tb_user (name, email, phone, password, birth_date) VALUES ('Marcos Fabiano', 'marcos.fabiano67@outlook.com', '988888888', '$2a$10$BZEayVp6X1Ry93e44/Rnze0hpK5J3ThbAdUm2OzH.GSWjA4zmtGHW', '2001-07-25');

INSERT INTO tb_role (authority) VALUES ('ROLE_CLIENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);

INSERT INTO tb_order (moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-07-25T13:00:00Z', 1, 1);
INSERT INTO tb_order (moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-07-29T15:50:00Z', 3, 2);
INSERT INTO tb_order (moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-08-03T14:20:00Z', 0, 1);

INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (1, 1, 2, 90.5);
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (1, 3, 1, 1250.0);
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (2, 3, 1, 1250.0);
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (3, 1, 1, 90.5);

INSERT INTO tb_payment (order_id, moment) VALUES (1, TIMESTAMP WITH TIME ZONE '2022-07-25T15:00:00Z');
INSERT INTO tb_payment (order_id, moment) VALUES (2, TIMESTAMP WITH TIME ZONE '2022-07-30T11:00:00Z');

INSERT INTO tb_revenue (name, preparation) VALUES ('Massa Chiffon', 'Bata tudo até ficar consistente');
INSERT INTO tb_revenue (name, preparation) VALUES ('Recheio Chiffon', 'Prepare o recheio com muito carinho');
INSERT INTO tb_revenue (name, preparation) VALUES ('Calda Chiffon', 'Prepare a calda bem fina');
INSERT INTO tb_revenue (name, preparation) VALUES ('Massa Cenoura', 'Bata até ficar consistente');
INSERT INTO tb_revenue (name, preparation) VALUES ('Recheio Cenoura', 'Prepare o recheio com muito amor');

INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (1, 1, 240);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (1, 2, 360);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (1, 3, 150);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (1, 4, 200);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (1, 5, 225);

INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (2, 6, 395);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (2, 7, 150);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (2, 8, 35);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (2, 9, 870);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (2, 10, 100);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (2, 11, 1000);

INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (3, 12, 300);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (3, 13, 150);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (3, 14, 25);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (3, 15, 15);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (3, 16, 1);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (3, 17, 3);

INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (4, 1, 240);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (4, 2, 340);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (4, 4, 150);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (4, 18, 8);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (4, 19, 200);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (4, 20, 270);

INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (5, 6, 790);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (5, 8, 100);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (5, 10, 200);
INSERT INTO tb_revenue_item (revenue_id, product_id, quantity) VALUES (5, 21, 120);

