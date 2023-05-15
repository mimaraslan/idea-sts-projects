package com.mimaraslan.ornekler;

public class SwitchCaseDurum {
    public static void main(String[] args) {
        int sayi1 = 25;

        switch (sayi1){
            case 1: System.out.println("1"); break;
            case 2: System.out.println("2"); break;
            case 3: System.out.println("3"); break;
            case 4: System.out.println("4"); break;
            case 5: System.out.println("Cuma"); break;
            case 6: System.out.println("6"); break;
            case 7: System.out.println("7"); break;
            default: System.out.println("OLMAZ"); break;
        }
    }
}
