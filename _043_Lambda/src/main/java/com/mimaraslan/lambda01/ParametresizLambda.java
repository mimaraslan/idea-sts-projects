package com.mimaraslan.lambda01;

public class ParametresizLambda {

    public static void main(String[] args) {

        Sekil sekil1 = new Sekil() {
            @Override
            public void dikdortgen() {
                System.out.println("Parametresiz Lambda Örneği");
            }
        };
        sekil1.dikdortgen();


        Sekil sekil2  = () -> System.out.println("Parametresiz Lambda Örneği 2");
        sekil2.dikdortgen();


    }

}