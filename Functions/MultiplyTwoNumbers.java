import java.util.Scanner;

public class Main {
    public static int multiply(int a, int b){
        return a * b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product of the two numbers is " + multiply(a, b));

    }
}
