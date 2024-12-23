CREATE  DATABASE bt_buoi_20
USE bt_buoi_20
CREATE TABLE Customers (
  CustomerID INT AUTO_INCREMENT PRIMARY KEY,
  CustomerName VARCHAR(100) NOT NULL,
  ContactName VARCHAR(100),
  Country VARCHAR(50)
);
CREATE TABLE Suppliers (
  SupplierID INT AUTO_INCREMENT PRIMARY KEY,
  SupplierName VARCHAR(100),
  ContactName VARCHAR(100),
  Country VARCHAR(50)
);
CREATE TABLE Categories (
  CategoryID INT AUTO_INCREMENT PRIMARY KEY,
  CategoryName VARCHAR(100)
);
CREATE TABLE Products (
  ProductID INT AUTO_INCREMENT PRIMARY KEY,
  ProductName VARCHAR(100) NOT NULL,
  SupplierID INT,
  CategoryID INT,
  Unit VARCHAR(50),
  Price DECIMAL(10, 2),
  FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID),
  FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);
CREATE TABLE Orders (
  OrderID INT AUTO_INCREMENT PRIMARY KEY,
  CustomerID INT,
  OrderDate DATE,
  ShipperID INT,
  FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);
CREATE TABLE OrderDetails (
  OrderDetailID INT AUTO_INCREMENT PRIMARY KEY,
  OrderID INT,
  ProductID INT,
  Quantity INT,
  FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
  FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);
INSERT INTO Customers (CustomerID, CustomerName, ContactName, Country)
VALUES
(1, 'Around the Horn', 'Thomas Hardy', 'UK'),
(2, 'Berglunds snabbköp', 'Christina Berglund', 'Sweden'),
(3, 'Blauer See Delikatessen', 'Hanna Moos', 'Germany'),
(4, 'Blondel père et fils', 'Frédérique Citeaux', 'France'),
(5, 'Bólido Comidas preparadas', 'Martín Sommer', 'Spain'),
(6, 'Bon app''', 'Laurence Lebihan', 'France'),
(7, 'Bottom-Dollar Markets', 'Elizabeth Lincoln', 'Canada'),
(8, 'Cactus Comidas para llevar', 'Patricio Simpson', 'Argentina'),
(9, 'Centro comercial Moctezuma', 'Francisco Chang', 'Mexico'),
(10, 'Chop-suey Chinese', 'Yang Wang', 'Switzerland');
INSERT INTO Suppliers (SupplierID, SupplierName, ContactName, Country)
VALUES
(1, 'Grandma Kelly''s Homestead', 'Regina Murphy', 'USA'),
(2, 'Tokyo Traders', 'Yoshi Nagase', 'Japan'),
(3, 'Cooperativa de Quesos ''Las Cabras''', 'Antonio del Valle Saaved', 'Spain'),
(4, 'Mayumi''s', 'Mayumi Ohno', 'Japan'),
(5, 'Pavlova, Ltd.', 'Ian Devling', 'Australia'),
(6, 'Specialty Biscuits, Ltd.', 'Peter Wilson', 'UK'),
(7, 'PB Knäckebröd AB', 'Lars Peterson', 'Sweden'),
(8, 'Refrescos Americanas LTDA', 'Carlos Diaz', 'Brazil'),
(9, 'Heli Süßwaren GmbH & Co. KG', 'Petra Winkler', 'Germany'),
(10, 'Plutzer Lebensmittelgroßmärkte AG', 'Martin Bein', 'Germany');
INSERT INTO Categories (CategoryID, CategoryName)
VALUES
(1, 'Grains/Cereals'),
(2, 'Condiments'),
(3, 'Confections'),
(4, 'Dairy Products'),
(5, 'Seafood'),
(6, 'Beverages'),
(7, 'Produce'),
(8, 'Meat/Poultry');
INSERT INTO Products (ProductName, SupplierID, CategoryID, Unit, Price)
VALUES
('Chef Anton''s Cajun Seasoning', 2, 2, '48 - 6 oz jars', 22.00),
('Chef Anton''s Gumbo Mix', 2, 2, '36 boxes', 21.35),
('Grandma''s Boysenberry Spread', 3, 2, '12 - 8 oz jars', 25.00),
('Uncle Bob''s Organic Dried Pears', 3, 7, '12 - 1 lb pkgs.', 30.00),
('Northwoods Cranberry Sauce', 3, 2, '12 - 12 oz jars', 40.00),
('Mishi Kobe Niku', 4, 6, '18 - 500 g pkgs.', 97.00),
('Ikura', 4, 8, '12 - 200 ml jars', 31.00),
('Queso Cabrales', 5, 4, '1 kg pkg.', 21.00),
('Queso Manchego La Pastora', 5, 4, '10 - 500 g pkgs.', 38.00),
('Konbu', 6, 8, '2 kg box', 6.00);
INSERT INTO Orders (CustomerID, OrderDate, ShipperID)
VALUES
(1, '2024-05-20', 1),
(1, '2024-05-21', 1),
(2, '2024-05-22', 2),
(3, '2024-05-23', 2),
(4, '2024-05-24', 3),
(5, '2024-05-25', 3),
(6, '2024-05-26', 1),
(7, '2024-05-27', 1),
(8, '2024-05-28', 2),
(9, '2024-05-29', 2);

INSERT INTO OrderDetails (OrderID, ProductID, Quantity)
VALUES
(1, 1, 10),
(1, 2, 5),
(2, 3, 20),
(3, 4, 15),
(4, 5, 12),
(5, 6, 8),
(6, 7, 30),
(7, 8, 25),
(8, 9, 18),
(9, 10, 7);

-- 1)	Liệt kê tên sản phẩm và tên nhà cung cấp cho tất cả các sản phẩm có giá lớn hơn 15.00
SELECT p.ProductName, s.SupplierName, p.Price
FROM Products p
JOIN Suppliers s ON s.SupplierID= p.SupplierID
WHERE p.Price>15.00
GROUP BY p.ProductName, s.SupplierName, p.Price
ORDER BY p.price ASC;
-- 2)	Tìm tất cả các đơn hàng được thực hiện bởi khách hàng ở "Mexico"
SELECT o.*, c.CustomerName, c.Country
FROM Orders o
JOIN Customers c ON c.CustomerId = o.CustomerId
WHERE c.Country= "Mexico";
-- -- 3) Tìm số lượng đơn hàng được thực hiện trong mỗi quốc gia
SELECT c.country AS Country, COUNT(o.OrderID) AS OrderCount
FROM Orders o JOIN Customers c ON o.CustomerID=c.CustomerID
GROUP BY c.Country
-- 4) Liệt kê tất cả các nhà cung cấp và số lượng sản phẩm mà họ cung cấp
SELECT s.SupplierName, COUNT(p.ProductID) AS ProductCount
FROM Suppliers s 
LEFT JOIN Products p ON s.SupplierID=p.SupplierID
GROUP BY s.SupplierID, s.SupplierName
-- 5) Liệt kê tên sản phẩm và giá của các sản phẩm đắt hơn sản phẩm "Chang"
SELECT p1.ProductName AS ProductName, p1.Price AS Price
FROM Products p1
WHERE p1.Price > (SELECT p2.Price FROM Products p2
WHERE p2.ProductName= 'Chang');
-- 6) Tìm tổng số lượng sản phẩm bán ra trong tháng 5 năm 2024
SELECT SUM(od.Quantity) AS TotalQuantity  
FROM OrderDetails od
JOIN Orders o ON od.OrderID=o.OrderID
WHERE MONTH(o.OrderDate)=5 AND YEAR(o.OrderDate)=2024
-- 7) Tìm tên của các khách hàng chưa từng đặt hàng
SELECT c.CustomerName  
FROM Customers c
LEFT JOIN Orders o ON c.CustomerID=o.CustomerID
WHERE o.OrderID IS NULL
-- 8) Liệt kê các đơn hàng với tổng số tiền lớn hơn 200.00
SELECT o.OrderID AS OrderID, SUM(od.Quantity*p.Price) AS TotalAmount 
FROM Orders o
JOIN OrderDetails od ON od.OrderID=o.OrderID
JOIN Products p ON p.ProductID=od.ProductID
GROUP BY o.OrderID
HAVING TotalAmount>200.00
-- 9) Tìm tên sản phẩm và số lượng trung bình được đặt hàng cho mỗi đơn hàng
SELECT p.ProductName, AVG(od.Quantity) AS AverageQuantity
FROM OrderDetails od
JOIN Products p ON od.ProductID= p.ProductID
GROUP BY p.ProductID, p.ProductName
-- 10) Tìm khách hàng có tổng giá trị đơn hàng cao nhất
SELECT c.CustomerName, SUM(od.Quantity*p.Price)AS Tong_gia_tri
FROM Customers c
JOIN Orders o ON o.CustomerID =c.CustomerID
JOIN OrderDetails od ON od.OrderID=o.OrderID
JOIN Products p ON p.ProductID=od.ProductID
GROUP BY c.CustomerName
ORDER BY Tong_gia_tri DESC
LIMIT 1;
-- 11)	Tìm các đơn hàng có tổng giá trị nằm trong top 10 cao nhất
SELECT o.OrderID, SUM(od.Quantity*p.Price)AS TongGiaTri
FROM Orders o
JOIN Customers c ON o.CustomerID = c.CustomerID
JOIN OrderDetails od ON o.OrderID = od.OrderID
JOIN Products p ON od.ProductID = p.ProductID
GROUP BY o.OrderID
ORDER BY TongGiaTri DESC
LIMIT 10;

-- 12)	Tìm tên khách hàng và số lượng đơn hàng của họ, chỉ bao gồm các khách hàng có số lượng đơn hàng lớn hơn mức trung bình
SELECT c.CustomerName, COUNT(o.OrderID) AS OrderCount
FROM Customers c
JOIN Orders o ON o.CustomerID=c.CustomerID
GROUP BY c.CustomerName
HAVING OrderCount> (SELECT AVG(SoLuong) FROM(
SELECT CustomerID,COUNT(OrderID) as SoLuong 
FROM Orders GROUP BY CustomerID) as TrungBinh)

WITH 
  SoLuongDonHang AS (
    SELECT CustomerID, COUNT(OrderID) AS SoLuong
    FROM Orders
    GROUP BY CustomerID
  ),
  TrungBinh AS (
    SELECT AVG(SoLuong) AS TrungBinhSoLuong
    FROM SoLuongDonHang
  )
SELECT c.CustomerName, COUNT(o.OrderID) AS SoLuongDonHang
FROM Customers c
JOIN Orders o ON c.CustomerID = o.CustomerID
GROUP BY c.CustomerID
HAVING COUNT(o.OrderID) > (SELECT TrungBinhSoLuong FROM TrungBinh);
 -- 13)Tìm sản phẩm có giá trị đơn hàng trung bình cao nhất (dựa trên giá sản phẩm và số lượng).
 SELECT p.ProductName AS ProductName, AVG(od.Quantity* p.Price) AS AverageOrderValue
 FROM OrderDetails od
 JOIN Products p ON od.ProductID=p.ProductID
 GROUP BY p.ProductID, p.ProductName
 ORDER BY AverageOrderValue DESC
 LIMIT 1;
 -- 14) Liệt kê các sản phẩm chưa bao giờ được đặt hàng bởi khách hàng đến từ "USA"
SELECT p.ProductID, p.ProductName
FROM Products p
LEFT JOIN OrderDetails od ON p.ProductID = od.ProductID
LEFT JOIN Orders o ON od.OrderID = o.OrderID
LEFT JOIN Customers c ON o.CustomerID = c.CustomerID
WHERE (c.Country!= 'USA' AND c.CustomerID IS NULL )
--  15)	Tìm nhà cung cấp có số lượng sản phẩm cung cấp nhiều nhất.
SELECT s.SupplierID, s.SupplierName, COUNT(p.ProductID) AS ProductCount
FROM Suppliers s
LEFT JOIN Products p ON s.SupplierID = p.SupplierID 
GROUP BY s.SupplierID, s.SupplierName
ORDER BY ProductCount DESC
LIMIT 1;


