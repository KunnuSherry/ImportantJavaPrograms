package org.example;
public class Main {
    public static void main(String[] args) {
        ;
        try{
            int a = 69/0 ;
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
        catch(ArithmeticException e){
            System.out.println("haha");
        }
    }
}
