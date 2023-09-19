class Main{
    public static void main(String[] args) {
        int n=5 ;
        int m=9 ;
        float i;
        for(i=1; i<=n; i++){
            for(float j=1; j<=m-n-i+1; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

//     *****
//    ***** 
//   *****  
//  *****   
// *****
