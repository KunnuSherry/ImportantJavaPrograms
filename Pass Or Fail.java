
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in three subjects:");
        System.out.print("english: ");
        Float eng = sc.nextFloat();
        System.out.print("hindi: ");
        Float hin = sc.nextFloat();
        System.out.print("maths: ");
        Float maths = sc.nextFloat();
        Float percentage = (eng + hin + maths)/3 ;
        System.out.println("your percentage is : " + percentage);


        if ( percentage < 40 || eng < 33 || hin < 33 || maths <33) {
            System.out.println("you are failed");
        }
        else {
            System.out.println("Congratulations you are passed");
        }

    }
}
