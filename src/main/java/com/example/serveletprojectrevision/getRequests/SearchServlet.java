package com.example.serveletprojectrevision.getRequests;

import com.example.serveletprojectrevision.dao.ApplicationDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String search = req.getParameter("search");
        ApplicationDao applicationDao = new ApplicationDao();
        List<String> all = applicationDao.getAll(search);
        try {
            String htmlString = getHTMLString(search, all);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getHTMLString(String filePath, List<String> all) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = "";
        StringBuffer buffer = new StringBuffer();
        while((line = reader.readLine())!= null){
            buffer.append(line);
        }
        reader.close();
        return buffer.toString();
    }
}
