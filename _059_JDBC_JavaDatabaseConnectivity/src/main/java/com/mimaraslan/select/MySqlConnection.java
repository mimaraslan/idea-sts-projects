package com.mimaraslan.select;
import java.sql.*;

public class MySqlConnection {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/companydb",
                    "root",
                    "123456789");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM customers");

            while(resultSet.next()){
                System.out.println(resultSet.getInt("customer_id")+" - "+resultSet.getString("first_name")+" "+resultSet.getString("last_name"));
            }
        }catch(Exception e){
            System.out.println("Hata: " + e);

        }finally {
            if(resultSet != null){
                resultSet.close();
            }if(statement != null){
                statement.close();
            }if(connection != null){
                connection.close();
            }
        }
    }
}
