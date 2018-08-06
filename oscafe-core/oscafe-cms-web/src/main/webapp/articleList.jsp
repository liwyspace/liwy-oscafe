<%--
  Created by IntelliJ IDEA.
  User: liwy
  Date: 2017/4/4
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>文章列表页面</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $(".delete").click(function(){
                var href = $(this).attr("href");
                $("form").attr("action", href).submit();
                return false;
            });
        })
    </script>
</head>
<body>
    <a href="article">添加文章</a>
    <form action="" method="POST">
        <input type="hidden" name="_method" value="DELETE"/>
    </form>
    <c:if test="${empty requestScope.articles}">
        没有任何文章！
    </c:if>
    <c:if test="${!empty requestScope.articles}">
        <table border="1">
            <tr>
                <td>ID</td>
                <td><fmt:message key="i18n.title"/> </td>
                <td><fmt:message key="i18n.author"/> </td>
                <td>CONTENT</td>
                <td>TIME</td>
                <td></td>
            </tr>
            <c:forEach items="${requestScope.articles}" var="article">
                <tr>
                    <td>${article.id}</td>
                    <td>${article.title}</td>
                    <td>${article.author}</td>
                    <td>${article.content}</td>
                    <td>${article.time}</td>
                    <td>
                        <a href="article/${article.id}">修改</a>
                        <a class="delete" href="article/${article.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

</body>
</html>
