package com.mimaraslan;

import com.mimaraslan.arac.Motor;
import com.mimaraslan.arac.Otobus;
import com.mimaraslan.personel.Surucu;

public class AppMain {

    public static void main(String[] args) {

        Otobus otobus = new Otobus();
        otobus.setPlakaNo("34ABCDEF1453");
        otobus.setModel(2021);
        otobus.setTekerSayisi(16);
        otobus.setKoltukSayisi(54);

        Surucu surucu = new Surucu();
        surucu.setAdi("Burak");
        surucu.setSoyadi("Delice");
        surucu.setKimlikNo("123456789");
        surucu.setMaas(50000.0);
        surucu.setEhliyetYili(2000);
        otobus.setSurucu(surucu);

        System.out.println(otobus.getPlakaNo());
        System.out.println(otobus.getKoltukSayisi());
        System.out.println(otobus.getSurucu().getAdi());
        System.out.println(otobus.getSurucu().getSoyadi());
        System.out.println(otobus.getSurucu().getKimlikNo());
        System.out.println(otobus.getSurucu().getMaas());
        System.out.println(otobus.getSurucu().getEhliyetYili());
        System.out.println(otobus.getYurtDisiIzni());
        System.out.println("----------------------------------");


        System.out.println(otobus);
        System.out.println(surucu);

        System.out.println("----------------------------------");


        otobus = new Otobus();
        otobus.setPlakaNo("06ANKOOP1402");
        otobus.setModel(2023);
        otobus.setTekerSayisi(14);
        otobus.setKoltukSayisi(46);

        System.out.println(otobus.getPlakaNo());
        System.out.println(otobus.getKoltukSayisi());
        //--------------------------------------

        Motor motor = new Motor();
        motor.setPlakaNo("44DBA111111");
        motor.setModel(2021);
        motor.setTekerSayisi(2);
        motor.setKoltukSayisi(1);

        System.out.println(motor.getPlakaNo());
        System.out.println(motor.getKoltukSayisi());



    }
}
