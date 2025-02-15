package com.krishna;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int i = (int) request.getAttribute("i");
        int j = (int) request.getAttribute("j");
        int k = (int) request.getAttribute("k");


        PrintWriter out = response.getWriter();
        out.println("Sum of " + i + " and " + j + " is: " + k);

        k = k * k;
        out.println("Square of the sum is: " + k);
    }
}
