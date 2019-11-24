
 INSERT INTO menuitem (id, price, name)
 VALUES(0, 15, 'Tiramisu'), (30, 13, 'Pasta di Carbonara'), (60, 30, 'Filet Mignon'),
 (1, 14, 'Apple pie'), (31, 10, 'Pasta di Agliolio'), (61, 24,'Streaploin');

 INSERT INTO ordertab
 VALUES(100,'2020-12-28', 83), (101, '2020-12-28', 100);

 INSERT INTO orderitem (id, MenuItem_id, Order_id, amount, price)
 VALUES(500, 0, 100, 1, 15), (501, 31, 100, 2, 20), (502, 61, 100, 2, 48),
 (503, 1,101, 1, 14), (504, 30,101, 2, 26), (505, 60, 101, 2, 60);

 SELECT * FROM ordertab;
 SELECT * FROM orderitem;
 SELECT * FROM menuitem;