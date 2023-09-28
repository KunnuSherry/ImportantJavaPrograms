import java.util.Scanner;
import java.math.* ;

public class Main{
    public static void Fibonacci(int a){
        int x = 0;
        int b = 1;
        int c ;
        for (int i = 0; i<a; i++){
            System.out.print(x+" ");
            c=x+b;
            x=b;
            b=c;

        }
    }

    public static void main(String[] args) {
        System.out.println("Write The two Numbers to be compared ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Fibonacci(a);
    }
}
