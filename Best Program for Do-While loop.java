import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Type 1 for writing you marks and 0 to stop");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Write Your Marks");
                int x = sc.nextInt();
                if(x>=90){
                    System.out.println("This is good");
                }
                else if (x>=60 && x<=89) {
                    System.out.println("This is also good");
                    
                }
                else if (x>=0 && x<=59) {
                    System.out.println("This is good as well");

                }

            }


        }
        while (n != 0);
        System.out.println("process stopped");

    }
}
