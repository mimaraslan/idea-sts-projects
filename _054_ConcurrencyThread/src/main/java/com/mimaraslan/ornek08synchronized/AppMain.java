package com.mimaraslan.ornek08synchronized;

class Table {

   synchronized void printTable (int n ){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n + " * " + i   + " = "  +   i*n);
            // 3 * 1 = 3
            // 3 * 2 = 6
        }
    }
}

class MyThread1 extends Thread{

    Table table = new Table();
    int number;

    public MyThread1(Table table, int number) {
        this.table = table;
        this.number = number;
    }

    @Override
    public void run() {
       table.printTable(number);
    }
}



class MyThread2 extends Thread{

    Table table = new Table();
    int number;

    public MyThread2(Table table, int number) {
        this.table = table;
        this.number = number;
    }

    @Override
    public void run() {
        table.printTable(number);
    }

}



public class AppMain {

    public static void main(String[] args) {
        Table table = new Table();

        MyThread1 myThread1 = new MyThread1(table, 3);
        myThread1.start();

        MyThread2 myThread2 = new MyThread2(table, 8);
        myThread2.start();
    }
}
