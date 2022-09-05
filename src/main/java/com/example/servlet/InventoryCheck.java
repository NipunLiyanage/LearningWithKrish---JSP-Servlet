package com.example.servlet;

import com.example.controller.DB;
import com.example.model.Item;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "InventoryCheck", value = "/InventoryCheck")
public class InventoryCheck extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String productId = request.getParameter("ProductID");

        ServletContext scont = request.getServletContext();

        if (scont.getAttribute("db")!=null){

            DB db = (DB) scont.getAttribute("db");

            boolean isThere = db.isAvailable(productId);

            if(isThere==true){

                Item item = db.getItem(productId);

                if(productId.equals(item.getProductID())){

                    request.setAttribute("pName",item.getProductName());
                    request.setAttribute("pCategory",item.getProductCategory());
                    request.setAttribute("quantity",item.getQuantity());

                    request.getRequestDispatcher("/ItemPage.jsp").forward(request, response);

                }

            }else{
                response.sendRedirect("/Index.jsp");
            }


        }

    }
}
