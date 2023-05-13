public class Main {
    public static void main(String[] args) {
        int[] marks = {100, 90, 80, 70, 60};
        int element = 100;
        for( int i = 0 ; i < marks.length ; i++) {
            if ( element == marks[i] ){
                System.out.println(element + " is in array");
                break;
            }
            else{
                System.out.println("not in array");
            }

        }



    }
}
