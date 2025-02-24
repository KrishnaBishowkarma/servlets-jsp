package com.krishna;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = (String) request.getParameter("name");
        String greeting = (String) request.getParameter("greeting");

        PrintWriter out = response.getWriter();

        out.println("Hello " + name + ", " + greeting + "!");
    }
}
