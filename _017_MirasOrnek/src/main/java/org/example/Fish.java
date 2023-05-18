package org.example;

public class Fish {
    private int sizeInFt;
    private Boolean canEat;

    public int getSizeInFt() {
        return sizeInFt;
    }

    public void setSizeInFt(int sizeInFt) {
        this.sizeInFt = sizeInFt;
    }

    public Boolean getCanEat() {
        return canEat;
    }

    public void setCanEat(Boolean canEat) {
        this.canEat = canEat;
    }
    public void swim(){
        System.out.println("swim metodu");
    }
}
