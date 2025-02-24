package com.krishna;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class GreetingServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String n = request.getParameter("name");
        String g = request.getParameter("greeting");

        request.setAttribute("name", n);
        request.setAttribute("greeting", g);


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("greet");
        requestDispatcher.forward(request, response);
    }
}