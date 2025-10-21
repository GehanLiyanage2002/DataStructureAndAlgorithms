public class ArrayQuestions {

    public static void main(String[] args) {
        
        int[] arr = {3, 6, 9, 2, 7};

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

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

        System.out.println("Total: " + total);
        System.out.println("Average: " + (double)total/ (arr.length - 1));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}