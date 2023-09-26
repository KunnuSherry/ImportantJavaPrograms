import java.util.* ;
public class Main {
    public static String oddOrEven(int a){
        if(a%2==0){
            return "This is an even number";
        }
        else{
            return "This is an odd number";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(oddOrEven(a));

    }

}
