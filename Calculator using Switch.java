import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;
        System.out.println("Enter The First Number ");
        a = sc.nextFloat();
        System.out.println("Enter The Second Number ");
        b = sc.nextFloat();
        System.out.println("Select The Operation tobe done, add, sub, mul, div ");
        String c = sc.next();
        switch (c) {
            case "add":
                System.out.println(a + b);
                break;

            case "sub" :
                System.out.println(a - b);
                break;

            case "mul" :
                System.out.println(a*b);
                break;

            case "div" :
                System.out.println(a/b);
                break;

            default :
                System.out.println("Error");
                break;

        }

    }
}
