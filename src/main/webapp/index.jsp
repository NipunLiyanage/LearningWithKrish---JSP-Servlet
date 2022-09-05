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
<form method="POST", value="NewInventory">

    <span>Product ID</span>
    <input type = "text" name="ProductID" placeholder="Enter Product ID" />
    <br/>
    <span>Product Name</span>
    <input type = "text" name="ProductName" placeholder="Enter Product Name" />
    <br/>
    <span>Product Category</span>
    <input type = "text" name="ProductCategory" placeholder="Enter Product Category" />
    <br/>
    <span>Quantity</span>
    <input type = "number" name="Quantity" placeholder="Enter the Quantity" />
    <br/>
    <input type="submit" value="Submit" />


</form>
</center>

</body>
</html>