
 INSERT INTO menu_item (price, name)
 VALUES(15, 'Tiramisu'), (13, 'Pasta di Carbonara'), (30, 'Filet Mignon'),
 (14, 'Apple pie'), (10, 'Pasta di Agliolio'), (24,'Streaploin');

 INSERT INTO order_tab(total, date)
 VALUES(83, '2020-12-28'), (100, '2020-12-28');

 INSERT INTO order_item (amount, cost, menu_item_id, order_tab_id)
 VALUES(0, 100, 1, 1), (31, 100, 2, 1), (61, 100, 3, 1),
 (1,101, 2, 2), (30,101, 4, 2), (60, 101, 5, 2);

 SELECT * FROM order_tab;
 SELECT * FROM order_item;
 SELECT * FROM menu_item;