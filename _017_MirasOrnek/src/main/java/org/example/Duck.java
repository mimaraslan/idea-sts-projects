package org.example;

public class Duck {
    private String beakColor = "yellow";

    public String getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(String beakColor) {
        this.beakColor = beakColor;
    }
    public void swim(){
        System.out.println("swim metodu");
    }
    public void quack(){
        System.out.println("quack metodu");
    }
}
