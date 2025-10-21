import java.util.Scanner;
public class ArrayQuestions2 {

    public static void main(String[] args) {

        int[] arr = {3, 6, 9, 2, 7};

        System.out.println("Enter element do you want search : ");
        Scanner scanner = new Scanner(System.in);
        int searchElement = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                System.out.println("Element found at index : " + i);
                System.out.println("Element found at position : " + (i + 1));
                System.out.println("=============================");
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                count++;
            }
        }

        System.out.println("Element found " + count + " times.");

        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        scanner.close();


    }
    
}
