import java.util.Scanner;

public class Main{
    public static float average(float a, float b, float c){
        return (a + b + c)/3 ;
    }

    public static void main(String[] args) {
        System.out.println("Write The Three Numbers ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt() ;
        float b = sc.nextInt() ;
        float c = sc.nextInt() ;
        System.out.println(average(a,b,c)+ " is the average of the 3 numbers");
    }
}
