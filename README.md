# MBRestaurant

Task description:
№21 Система Ресторан. Клиент осуществляет заказ из Меню. 
Администратор подтверждает Заказ и отправляет его на кухню для исполнения. 
Администратор выставляет Счет. Клиент производит его оплату. 


Business logic: 
1. Customer could use application as an anon User
1. User could login as Manager. - LoginCommand
2. User could register as a Manager. - RegisterCommand
3. All could see menu page. - MenuCommand (GET)
4. All could see specific menu item page. - MenuItemCommand (GET)
5. User could make an order.  - OrderCommand (POST)
6. User could cancel his order. - OrderCommand (DELETE)
6. User could see his specific order status page (GET)
6. Manager could see list of all orders - OrderListCommand (GET)
9. Manager could change order status - OrderCommand(UPDATE)
10. Manager could use function to generate a invoice
11. User can see invoice of his order
13. User on site could change language - LanguageCommand
15. Manager could logout 