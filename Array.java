import java.util.Scanner;
public class Array {
    
    public static void main(String[] args) {

        // int[] arr = {10, 20, 30, 40, 50};
        // System.out.println(arr[0]); // Output: 30
        // System.out.println(arr[1] + arr[3]); // Output: 60
        // System.out.println("This array length is : " + arr.length);

        // char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        // System.out.println(charArray[2]); // Output: c
        // System.out.println("This char array length is : " + charArray.length);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("This is Element " + (i+1) + ": " + arr[i] + "\n");
        // }

        // int size = charArray.length;

        // for (int i = 0; i < charArray.length; i++) {
        //     System.out.println("This is Element " + (i+1) + ": " + charArray[i] + "\n");
        // }

        int[] arr = new int[5];

        int size = 5;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("This is element " + (i+1) + ": " + arr[i]);
        }



        scanner.close();

    }
}
