<%@ page import="java.time.LocalDateTime" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>


// Основные теги создания циклов, определения условий, вывода информации на страницу и т.д.
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

// Теги для форматирования и интернационализации информации (i10n и i18n)
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<body>
<h1>Hello Everyone!!!!</h1>

<%= LocalDateTime.now().toString() %>

<% for (int i = 0; i < 5; i++) { %>
<h2>Норвегия</h2>
<% } %>

<c:forEach items="${productList.products}" var="product">
    <li>${product}</li>
</c:forEach>

<c:url value="/index.jsp" var="Главная"/>

<a href="${Главная}">Main</a>

</body>
</html>
