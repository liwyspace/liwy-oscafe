<%--
  Created by IntelliJ IDEA.
  User: liwy
  Date: 2017/4/4
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/article" method="POST">
        <!-- lastname-email-gender-department.id 例如: GG-gg@atguigu.com-0-105 -->
        用户字符串: <input type="text" name="article" value="44,title123,liwy,contnent112"/>
        <input type="submit" value="Submit"/>
    </form>
    <br><br>

    <form:form action="${pageContext.request.contextPath}/article" method="POST" modelAttribute="article">
        <c:if test="${id != null }">
            <form:hidden path="id"/>
            <input type="hidden" name="_method" value="PUT"/>
        </c:if>
        Title：<form:input path="title"/><br/>
        <form:errors path="title"/>
        Author:<form:input path="author"/><br/>
        <form:errors path="author"/>
        Content:<form:textarea path="content"/><br/>
        time:<form:input path="time"/><br/>
        <input type="submit" value="提交" />
    </form:form>
</body>
</html>
