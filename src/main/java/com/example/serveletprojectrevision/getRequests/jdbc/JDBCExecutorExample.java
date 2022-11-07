package com.example.serveletprojectrevision.jdbc;

public class JDBCExecutorExample {
    public static void main(String[] args) {
        com.example.serveletprojectrevision.jdbc.DatabaseConnectionManager dcm = new com.example.serveletprojectrevision.jdbc.DatabaseConnectionManager("localhost",
                "hplussport", "postgres", "root123");
//        try {
//            Connection connection = dcm.getConnection();
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select count(*) from customer");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}