<%@ page import="com.example.controller.DB" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<%

    if(application.getAttribute("db")==null){
        DB db = new DB();
        application.setAttribute("db", db);
    }

%>


<!DOCTYPE html>
<html>
<head>
    <title>New Inventory</title>
</head>
<body>
<center>
<form method="POST", value="inventoryCheck">

    <span>Product ID</span>
    <input type = "text" name="ProductID" placeholder="Enter Product ID" />
    <br/>
    <input type="submit" value="Submit" />


</form>
</center>
</body>
</html>
