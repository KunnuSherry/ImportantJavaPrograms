import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your number to be checked: ");
        int n = sc.nextInt();
        boolean ded = true;


            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    ded = false;
//                    break;
                }


            }
            if (ded){
                System.out.println(n + " is a Prime Number");

            }
            else{
                System.out.println(n + " is a Composite Number");
            }

    }
}
