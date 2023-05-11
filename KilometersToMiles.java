import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of kilometres : ");
        double km = sc.nextDouble();
        System.out.println("The number in miles is : " + km * 0.621371);


    }
}
