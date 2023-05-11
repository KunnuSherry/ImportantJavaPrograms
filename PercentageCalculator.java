import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Fill Your Marks According to the Subjects");
        System.out.println("English Marks : ");
        float a = s.nextFloat();
        System.out.println("Hindi Marks : ");
        float b = s.nextFloat();
        System.out.println("maths marks : ");
        float c = s.nextFloat();
        System.out.println("Science marks : ");
        float d = s.nextFloat();
        System.out.println("Computer Science marks : ");
        float e = s.nextFloat();
        float f = ( a + b + c + d + e ) / 5 ;
        System.out.print("Your Percentage Is : ");
        System.out.println(f);


    }
}
