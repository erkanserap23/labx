# sql 
* case insensitive
* on or and 
* desc asc 
* inner join
* left join
* rigth join
* count(*) 
* order by 
* group by 
* where
* join 

INSERT INTO musteriler (ad, soyad, telefon) VALUES ('se', 'ER', '555-555-5555');
UPDATE urunler SET stok_adedi = 100 WHERE urun_id = 1;
DELETE FROM siparisler WHERE siparis_id = 5;

Select *from Customer
* tüm üşterileri getir 

Select*from Customers where City='London'
* müşetilerden london sehri olanı getir

Select*from Products where categoryId=1 or CategoryID=3
* categoriy id 1 veya üç olanı getir

select*from Products where categoryId=2 and UnitPrice>=10
* category id 1 olanların ve  unitPrice 10 büyüklri getir

select*from Products order by CategoryID,ProductName
* sırala order by

select*from Products order by UnitPrice desc
select*from Products order by UnitPrice asc 
* ascending asc artan  , desc (d)üşen
group

select*from Products where CategoryID=1 order by UnitPrice desc
* categori id si 1 olanları azalana göre sırala

select count(*) from Products where CategoryID=2
* categoriy id 2 olan bütün ürünlerin toplam sayısı

select categoryID from products group by CategoryID
select categoryID,count(*) from products group by CategoryID
select categoryID,count(*) from products group by CategoryID having count(*)<10
select categoryID,count(*) from products where UnitPrice>20 group by CategoryID having count(*)<10
 * having count

select*
from Products inner join Categories 
on Products.CategoryID=Categories.CategoryID 

select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID=Categories.CategoryID 
where Products.UnitPrice>10
* eşleşenleri biraraya getirir,eşleşmeyen data varsa getirmez

* DTO, Data Transformation Object 

select*from [Order Details] 
* tabloyuda bitişik oldugunu gösterir []

select*from Products p inner join [Order Details] od 
on p.ProductID=od.ProductID 
* product için p order için o diyelim 


select*from Products p left join [Order Details] od 
on p.ProductID=od.ProductID
* left join solda olup sağda olmayanlar
* right join sağda olup solda olmayanlar

select*from Customers c inner join Orders o 
on c.CustomerID=o.CustomerID

select*from Products p inner join [Order Details] od
on p.ProductID=od.ProductID
inner join Orders o
on o.OrderID=od.OrderID

select*from Customers c left join Orders o 
on c.CustomerID=o.CustomerID

select*from Customers c left join Orders o 
on c.CustomerID=o.CustomerID
where o.CustomerID is null
* sipariş hiç vermeyen müşteri




