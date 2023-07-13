package com.mimaraslan.update;

import java.sql.*;

public class JdbcUpdatePostgreSql {

    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/musteriDB";
    static final String USERNAME = "postgres";
    static final String PASSWORD = "123456789";
    static final String QUERY_SELECT_MUSTERI_ALL = "SELECT * FROM tblmusteri";

    static final String QUERY_UPDATE_MUSTERI_BY_ID = "SELECT * FROM tblmusteri";


    public static void main(String[] args) throws SQLException {

        try (
                Connection  connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(QUERY_SELECT_MUSTERI_ALL);
        ) {

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("ad") + " " + resultSet.getString("soyadi"));
            }


        } catch (Exception e) {
            System.out.println("Hata: " + e);
        } finally {
            //FIXME BU KISMA BAKILACAK.
/*
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null)
                statement.close();

            if (connection != null) connection.close();
            */

        }
    }
}
