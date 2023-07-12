package com.mimaraslan;
import java.sql.*;

public class PostgreSqlConnection {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/musteriDB",
                    "postgres",
                    "123456789");

            statement = connection.createStatement();
            String sqlMusteriler = "SELECT * FROM tblmusteri";
            resultSet = statement.executeQuery(sqlMusteriler);

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("ad") + " " + resultSet.getString("soyadi"));
            }

        } catch (Exception e){
            System.out.println("Hata: "+ e);
        } finally {
            if(resultSet != null){
                resultSet.close();
            }

            if(statement != null){
                statement.close();
            }

            if(connection != null){
                connection.close();
            }
        }




    }

}
