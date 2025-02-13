package com.krishna;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i + j;

        PrintWriter out = response.getWriter();
        out.println("Result is: " + k);
    }
}
