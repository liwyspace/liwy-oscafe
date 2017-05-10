<%--
  Created by IntelliJ IDEA.
  User: liwy
  Date: 2017/4/4
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    file:<input type="file" name="file"/><br/>
    desc:<input type="text" name="desc"/><br/>
    <input type="submit" value="提交" />
</form>
</body>
</html>
