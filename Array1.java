import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        int size = 5;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("This is element " + (i+1) + ": " + arr[i]);
        }

        System.out.println("Enter the index : ");
        int index = scanner.nextInt();
        System.out.println("Enter the element : ");
        int element = scanner.nextInt();

        size++;

        for (int i  = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = element;
        System.out.println("==================== After Insertion ====================");
        for (int i = 0; i < size; i++) {
            System.out.println("This is element " + (i+1) + ": " + arr[i]);
        }


        scanner.close();


    }
    
}
