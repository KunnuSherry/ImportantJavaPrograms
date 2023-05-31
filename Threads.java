package org.example;
class thread1 extends Thread {
    public void run(){
        while (true){
         System.out.println("good morning");}
    }
}
class thread2 extends Thread {
    public void run(){
        while (true){
        System.out.println("welcome");}
    }
}
public class Main {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
