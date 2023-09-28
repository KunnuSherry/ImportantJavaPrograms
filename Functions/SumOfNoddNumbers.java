import java.util.Scanner;

public class Main{
    public static int odd(int n){
        int sum = 0;
        int i = 1;
        while (i<=n){
            sum = sum + (2*i)-1 ;
            i++ ;
        }
        return sum ;
    }

    public static void main(String[] args) {
        System.out.println("Write The Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(odd(n) + " is the sum of " + n + " odd numbers.");
    }
}
