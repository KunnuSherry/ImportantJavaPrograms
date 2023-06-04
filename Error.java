package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       // int a = 69    // syntax error
        Scanner sc = new Scanner(System.in); //program to print first n prime numbers
        int b = sc.nextInt();
        int i;
        for (i = 0; i<b; i++){
            System.out.println(2*i+1); //logical error

        }


    }
}
