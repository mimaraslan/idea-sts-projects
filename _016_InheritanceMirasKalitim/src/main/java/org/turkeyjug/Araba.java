package org.turkeyjug;

public class Araba extends Tasit {

    public Araba() {
        super();
    }

    @Override
    void yazdir(){
        System.out.println("Araba sınıfının içi: "+ getTekerSayisi());
    }
}
