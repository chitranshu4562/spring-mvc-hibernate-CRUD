package com.prakash;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet(name = "TestDbServlet", value = "/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // set up connection varible
        String username = "springstudent";
        String password = "springstudent";
        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimeZone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";

        // get connection to databse
        try {
            PrintWriter out = response.getWriter();
            out.println("Connecting to database..." + jdbcUrl);

            Class.forName(driver);
            Connection myConnection = DriverManager.getConnection(jdbcUrl, username, password);

            out.println("Connection is established successfully");
            myConnection.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
