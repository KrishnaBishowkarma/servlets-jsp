package com.krishna;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i + j;

//        PrintWriter out = response.getWriter();
//        out.println("Result is: " + k);

        // Request Dispatcher and Redirect are two ways to send data from one servlet to another

        request.setAttribute("i", i);
        request.setAttribute("j", j);
        request.setAttribute("k", k);

        // Request Dispatcher
        RequestDispatcher rd = request.getRequestDispatcher("/square");
        rd.forward(request, response);

    }
}
