import java.util.Scanner;

public class Main {
    public static int factorial(int a){
        int fac = 1;
        if (a<0){
            System.out.println("Invalid Number");
        }
        else if (a==0) {
            return 1;
        }
        else{
            for (int i =1; i<=a; i++){
                fac = fac * i;
            }
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The factorial of "+ a + " is " + factorial(a));

    }

}
