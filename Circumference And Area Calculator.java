import java.util.* ;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Type the radius");
        Scanner sc = new Scanner(System.in);
        double radius, cir, area ;
        radius = sc.nextDouble();
        cir = 2 * radius * 22/7 ;
        area = 22/7 * radius*radius ;
        System.out.print("circumference = " + cir + "\nArea = " + area);
    }
}
