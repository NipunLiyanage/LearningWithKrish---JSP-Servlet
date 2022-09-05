<%--
  Created by IntelliJ IDEA.
  User: Nipun Liyanage
  Date: 9/5/2022
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Item Details</title>
</head>
<body>

<h1><% request.getAttribute("pName")%></h1>
<h1><% request.getAttribute("pCategory")%></h1>
<h1><% request.getAttribute("quantity")%></h1>

</body>
</html>
