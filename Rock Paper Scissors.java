package org.example;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Type: 0 for rock/ 1 for paper/ 2 for scissors");
        Random a = new Random();
        int computerinput = a.nextInt(3);
        Scanner sc = new Scanner(System.in);
        int uinput = sc.nextInt();
        if(computerinput==uinput){
            System.out.println("draw");
        } else if (computerinput==0&&uinput==1||computerinput==0&&uinput==2||computerinput==1&&uinput==2) {
            System.out.println("you win !");

        }
        else{
            System.out.println("you lose !");
        }




    }
}
