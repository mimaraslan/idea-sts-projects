package com.mimaraslan.delete;

import java.sql.*;

public class JdbcDeletePostgreSql {

    static final String DB_DRIVER_CLASS_NAME = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/musteriDB";
    static final String USERNAME = "postgres";
    static final String PASSWORD = "123456789";
    static final String QUERY_SELECT_MUSTERI_ALL = "SELECT * FROM tblmusteri ORDER BY id";
    static final String QUERY_SELECT_ILETISIM_ALL = "SELECT * FROM tbliletisim ORDER BY id";
    static final String QUERY_UPDATE_MUSTERI_BY_ID = "UPDATE public.tblmusteri " +
            "SET " +
            "ad='Aminenur', " +
            "soyadi='Göynük', " +
            "aciklama='aminenur@gmail.com' " +
            "WHERE id=1003;";
    static final String QUERY_INSERT_MUSTERI = "INSERT INTO public.tblmusteri(ad, soyadi, aciklama)" +
            "VALUES ('Mehmet Caner', 'Öksüz', 'caner@gmail.com'); ";
    static final String QUERY_INSERT_MUSTERI2 = "INSERT INTO public.tblmusteri(ad, soyadi, aciklama)" +
            "VALUES ('Serkan', 'Zorlu', 'serkan@gmail.com'); ";
    static final String QUERY_INSERT_MUSTERI3 = "INSERT INTO public.tblmusteri(ad, soyadi, aciklama)" +
            "VALUES ('Ünal', 'Berk', 'unal@gmail.com'); ";


    static final String QUERY_DELETE_ILETISIM_BY_ID = "delete from tbliletisim " +
            " where id=26;";



    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName(DB_DRIVER_CLASS_NAME);
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            statement = connection.createStatement();
            //statement.executeUpdate(QUERY_UPDATE_MUSTERI_BY_ID);
           // statement.executeUpdate(QUERY_INSERT_MUSTERI);
           // statement.executeUpdate(QUERY_INSERT_MUSTERI2);
           // statement.executeUpdate(QUERY_INSERT_MUSTERI3);
            statement.executeUpdate(QUERY_DELETE_ILETISIM_BY_ID);
            resultSet = statement.executeQuery(QUERY_SELECT_ILETISIM_ALL);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("ad") + " " + resultSet.getString("il"));
            }

        } catch (Exception e) {
            System.out.println("Hata: " + e);
        } finally {

            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}