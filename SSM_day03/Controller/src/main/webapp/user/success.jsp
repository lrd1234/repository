<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功页面</title>

    <c:forEach items="${users}" var="user">
        ${user.id},${user.username},${user.password}
    </c:forEach>

</head>
<body>

</body>

</html>
