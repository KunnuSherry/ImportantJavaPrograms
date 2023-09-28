import java.util.Scanner;
import java.math.* ;

public class Main{
    public static double power(int a, int b){
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        System.out.println("Write The two Numbers to be compared ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}
