package com.krishna;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MultiplyServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        double i = Double.parseDouble(request.getParameter("num1"));
        double j = Double.parseDouble(request.getParameter("num2"));

        double k = i * j;

        PrintWriter out = response.getWriter();
        out.println("Result is: " + k);
    }
}
