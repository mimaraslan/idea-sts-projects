package com.mimaraslan.crud;

import java.sql.*;

public class MyCrud {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    static final String DB_DRIVER_CLASS_NAME = "org.postgresql.Driver";
    static final String DB_NAME = "musteriDB";
    static final String DB_HOSTNAME_IP = "localhost";
    static final String DB_PORT = "5432";
    static final String DB_URL = "jdbc:postgresql://" + DB_HOSTNAME_IP + ":" + DB_PORT + "/" + DB_NAME;
    static final String USERNAME = "postgres";
    static final String PASSWORD = "123456789";


 private   boolean openConnection() {

        try {
            Driver.class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            return true;

        } catch (Exception e){
            System.out.println("Hata: "+ e);
            return false;
        }

    }

 private  boolean closeConnection() {

      try {
          if (!connection.isClosed())
              connection.close();
          return true;
      }catch (Exception e){
          System.out.println("Hata: "+ e);
          return false;
      }

    }


    // UPDATE (update, insert, delete)
    void executeQuery(String sql) throws SQLException {
       if (openConnection()){
           preparedStatement = connection.prepareStatement(sql);
           preparedStatement.executeUpdate();
           closeConnection();
       } else {
           System.out.println("Bağlantı kapalı.");
       }
    }

    // READ (select)
     ResultSet findFromTableRecordAll(String sql) throws SQLException {
        if (openConnection()){
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            closeConnection();
            return resultSet;
        } else {
            System.out.println("Bağlantı kapalı.");
            return null;
        }
    }

/*
    private ResultSet findFromTableRecordById(String sql) throws SQLException {
        if (openConnection()){
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            closeConnection();
            return resultSet;
        } else {
            System.out.println("Bağalantı kapalı.");
            return null;
        }
    }
    */

}
