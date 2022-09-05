package com.example.servlet;

import com.example.controller.DB;
import com.example.model.Item;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "NewInventory", value = "/NewInventory")
public class NewInventory extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String productID = request.getParameter("ProductID");
        String productName = request.getParameter("ProductName");
        String productCategory = request.getParameter("ProductCategory");
        int quantity = Integer.parseInt(request.getParameter("Quantity"));

        ServletContext scont = request.getServletContext();

        if(scont.getAttribute("db")!=null){

            DB db =(DB) scont.getAttribute("db");

            if(db.isAvailable(productID)==false){
                Item item = new Item(productID,productName,productCategory,quantity);
                System.out.println(db.addItem(item));
            }

            else{
                System.out.println("Already in the inventory");
                response.sendRedirect("/InventoryCheck.jsp");
            }

        }


    }
}
