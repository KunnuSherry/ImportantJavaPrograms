class main {
    public static void main(String[] args) {
        int x = 1;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(x);
                x++;
            }
            System.out.println("");
        }
    }
}

// 1
// 23
// 456
// 78910
// 1112131415
