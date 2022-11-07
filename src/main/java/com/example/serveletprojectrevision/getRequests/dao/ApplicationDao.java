package com.example.serveletprojectrevision.dao;

import com.example.serveletprojectrevision.jdbc.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ApplicationDao {

    public List<String> getAll(String search){
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost",
                "hplussport", "postgres", "root123");
        try {
            Connection connection = dcm.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select count(*) from customer");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<String> stuff = new ArrayList<>();
        stuff.add("S");
        stuff.add("T");

        return stuff;

    }




}

