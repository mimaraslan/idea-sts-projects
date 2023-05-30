package com.mimaraslan.v1;


// Generic class
public class JenerikSinifOrnegi <T> {

    T nesne;

    /*
    public JenerikSinifOrnegi() {
    }
    */

    public JenerikSinifOrnegi(T nesne) {
        this.nesne = nesne;
    }

    public T getNesne() {
        return nesne;
    }

    public void setNesne(T nesne) {
        this.nesne = nesne;
    }

    @Override
    public String toString() {
        return "JenerikSinifOrnegi{" +
                "nesne=" + nesne +
                '}';
    }

}
