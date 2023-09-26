import java.util.* ;
public class Main {
    public static String primeOrNot(int a){
        boolean prime = true ;
        for (int i=2; i<=a/2; i++){
            if(a%i==0){
                prime = false ;
                break;
            }
        }
        if(prime){
            return "This is a Prime number ";

        }
        else{
            return "This is a Composite number ";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(primeOrNot(a));

    }

}
