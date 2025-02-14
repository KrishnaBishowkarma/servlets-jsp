package com.krishna;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DivideServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i / j;

        System.out.println("Result is: " + k);

        PrintWriter out = response.getWriter();
        out.println("Result is: " + k);
    }
}
