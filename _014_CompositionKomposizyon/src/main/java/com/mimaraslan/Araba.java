package com.mimaraslan;

import com.mimaraslan.Yakit;

public class Araba {
    
  //  Yakit yakit = new Yakit();

    private Yakit yakit = null;
    private Ayna ayna = null;
    private Far far = null;

    public Araba() {
         yakit = new Yakit();
         ayna = new Ayna();
         far = new Far();
        System.out.println("Araba");
    }
    
    public void hareketeGec(){
        yakit.depo();

        System.out.println("Harekete geç");
    }
}
