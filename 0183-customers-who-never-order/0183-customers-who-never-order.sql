Select Customers.name AS Customers from Customers left join orders on 
(Customers.id = orders.Customerid) where orders.id is null;