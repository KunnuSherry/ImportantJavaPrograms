public class Main {
    public static void main(String[] args) {
        int n = 4;
        int row;
        int col ;
        for (row = 1; row <= n ; row++){
            for(col =1 ; col <= n-row+1 ; col++){
                System.out.print("* ");
                
            }
            System.out.print("\n");
        }


    }

}

/* pattern
****
***
**
*   */
