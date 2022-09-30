import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Enter 10 integers");

        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
