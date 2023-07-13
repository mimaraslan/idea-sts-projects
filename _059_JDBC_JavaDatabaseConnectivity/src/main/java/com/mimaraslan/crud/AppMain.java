package com.mimaraslan.crud;

import java.sql.ResultSet;
import java.sql.SQLException;

// insert,  select, update,  delete (SQL dünyasinda)
// Create,  Read,   Update,  Delete (CRUD) -- Web dunyasi
public class AppMain {

    static final String QUERY_SELECT_MUSTERI_ALL = "SELECT * FROM tblmusteri ORDER BY id";
    static final String QUERY_SELECT_ILETISIM_ALL = "SELECT * FROM tbliletisim ORDER BY id";
    static final String QUERY_UPDATE_MUSTERI_BY_ID = "UPDATE public.tblmusteri " +
            "SET " +
            "ad='Aminenur', " +
            "soyadi='Göynük', " +
            "aciklama='aminenur@gmail.com' " +
            "WHERE id=1001;";
    static final String QUERY_INSERT_MUSTERI = "INSERT INTO public.tblmusteri(ad, soyadi, aciklama)" +
            "VALUES ('Mehmet Caner', 'Öksüz', 'caner@gmail.com'); ";
    static final String QUERY_INSERT_MUSTERI2 = "INSERT INTO public.tblmusteri(ad, soyadi, aciklama)" +
            "VALUES ('Serkan', 'Zorlu', 'serkan@gmail.com'); ";
    static final String QUERY_INSERT_MUSTERI3 = "INSERT INTO public.tblmusteri(ad, soyadi, aciklama)" +
            "VALUES ('Ünal', 'Berk', 'unal@gmail.com'); ";


    static final String QUERY_DELETE_ILETISIM_BY_ID = "delete from tbliletisim " +
            " where id=26;";


    public static void main(String[] args) throws SQLException {
        MyCrud myCrud = new MyCrud();

   /*
      ResultSet resultSet = myCrud.findFromTableRecordAll("SELECT * FROM tblmusteri ORDER BY id DESC");

      while (resultSet.next()){
          System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("ad") + " " + resultSet.getString("soyadi"));
      }
      */

/*
        ResultSet resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_MUSTERI_ALL);

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("ad") + " " + resultSet.getString("soyadi"));
        }
*/


        //myCrud.executeQuery(QUERY_INSERT_MUSTERI);
        myCrud.executeQuery(QUERY_UPDATE_MUSTERI_BY_ID);

        ResultSet resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_MUSTERI_ALL);
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("ad") + " " + resultSet.getString("soyadi"));
        }


    }
}
