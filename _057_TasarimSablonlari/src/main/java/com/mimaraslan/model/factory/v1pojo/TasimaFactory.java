package com.mimaraslan.model.factory.v1pojo;

public class TasimaFactory {

    public static Tasima builder(TasimaTipi tasimaTipi) {

        switch (tasimaTipi) {
            case KARA:
                return new Kamyon();
            case DENIZ:
                return new Gemi();
            case HAVA:
                return new Ucak();
            default:
                return new Kamyonet();
        }

    }
}
