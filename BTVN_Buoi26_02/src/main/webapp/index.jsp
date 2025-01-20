<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Java_Servlet_HW_02</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<h1> Quản lý sản phẩm</h1>
  <form action="ProductServlet" method="POST">
        <label for="name">Tên sản phẩm</label>
        <input type="text" id="name" name="name" required>
        <br>
        <label for="quantity">Số lượng</label>
        <input type="number" id="quantity" name="quantity" required>
        <br>
        <label for="price">Giá bán</label>
        <input type="number" id="price" name="price" required>
        <br>
        <button type="submit">Lưu lại</button>
    </form>

    <table>
        <thead>
            <tr>
                <th>STT</th>
                <th>Tên Sản Phẩm</th>
                <th>Số Lượng</th>
                <th>Giá Bán</th>
            </tr>
        </thead>
        <tbody>
                <c:forEach var="product" items="${products}" varStatus="status">
                    <tr>
                        <td>${status.index + 1}</td>
                        <td>${product.name}</td>
                        <td>${product.quantity}</td>
                        <td>${product.price}</td>
                    </tr>
                </c:forEach>
        </tbody>
    </table>
</body>
</html>