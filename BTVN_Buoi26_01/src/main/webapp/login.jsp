<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>
 <h1> Đăng nhập </h1>
 <c:if test="${not empty errorMessage}">
        <p style="color: red;">${errorMessage}</p>
    </c:if>
    <form action="login" method="post">
        <label for="username">Tên đăng nhập:</label>
        <input type="text" id="username" name="username" value="${cookieUsername}" required><br><br>
        <label for="password">Mật khẩu:</label>
        <input type="password" id="password" name="password" value="${cookiePassword}" required><br><br>
        <input type="checkbox" id="rememberMe" name="rememberMe" ${cookieRememberMe ? 'checked' : ''}>
        <label for="rememberMe">Remember Me</label><br><br>
        <input type="submit" value="Đăng nhập">
    </form>
</body>
</html>