package com.example.serveletprojectrevision.getRequests;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetServlet", value = "/get-servlet")
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String htmlResponse = "<html><h1>Hello Html Response is here!</h1></html>";
        resp.getWriter().write(htmlResponse + " " + name);
    }
}
