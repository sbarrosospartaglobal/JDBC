package com.sparta.sb.db;

import java.sql.*;

public class DAO
{
    private final String  QUERY = "insert into employee.employee values (?,?,?,?,?,?,?,?,?,?)";
    private final String  URL = "jdbc:mysql://localhost/employee?user=root&password=123eol/oamis890";

    public void runSQLQuery(String id)
    {
        try(Connection connection = DriverManager.getConnection(URL))
        {
            PreparedStatement statement = connection.prepareStatement(QUERY);
            statement.setString(1,id);
            ResultSet resultSet = statement.executeQuery();
        }catch (SQLException e) { e.printStackTrace(); }
    }
}