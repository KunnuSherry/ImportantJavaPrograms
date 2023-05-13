public class Main {
    public static void main(String[] args) {
        float[] marks = {100f, 90f, 80f, 70f, 60f};
        float sum = 0f;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];

        }
        System.out.println("The sum is : " + sum);


    }
}
