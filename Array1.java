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


        


        System.out.println("Enter the Index do you want delete : ");
        int deleteIndex = scanner.nextInt();

        for (int i = deleteIndex; i < size; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("==================== After Deletion ====================");
        for (int i = 0; i < size; i++) {
            System.out.println("This is element " + (i+1) + ": " + arr[i]);
        }


        System.out.println("What a index you want to search : ");
        int searchData = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == searchData) {
                System.out.println("Data found at index : " + i);
                System.out.println("Data found at position : " + (i + 1));
                System.out.println("You searched data is : " + arr[i]);
                break;
            }
        }  

        System.out.println("Enter the index do you want update : ");
        int updateIndex = scanner.nextInt();
        System.out.println("Enter the new value : ");
        int newValue = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (i == updateIndex) {
                arr[i] = newValue;
                System.out.println("This is element " + (i+1) + ": " + arr[i]);
                break;
            }
        }

        System.out.println("==================== After Updation ====================");

        for (int i = 0; i < size; i++) {
            System.out.println("This is element " + (i+1) + ": " + arr[i]);
        }






        scanner.close();

    }
    
}
