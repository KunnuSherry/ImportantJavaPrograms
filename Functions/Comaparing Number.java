import java.util.Scanner;

public class Main{
    public static void odd(int a, int b){
        if(a>b){
            System.out.println(a + " is greater than " + b);
        }
        else {
            System.out.println(b + " is greater than " + a);
        }
    }

    public static void main(String[] args) {
        System.out.println("Write The two Numbers to be compared ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        odd(a,b);
    }
}
