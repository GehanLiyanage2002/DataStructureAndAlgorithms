import java.util.Scanner;

public class StackQuestion2 {

    int top;
    int capacity;
    char arr[];


    StackQuestion2(int size) {
        capacity = size;
        top = -1;
        arr = new char[size];
    }

    public boolean isFull() {
        return top + 1 == capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char x) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            top++;
            arr[top] = x;
            //System.out.println("Inserting : " + x);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.print(arr[top]);
            top--;
        }
    }
    
    public void stackSize() {
        System.out.println("Stack size: " + (top + 1));
    }


    public static void main(String[] args) {

        StackQuestion2 myStack = new StackQuestion2(5);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        for (char c : word.toCharArray()) {
            myStack.push(c);
        }
        
        System.out.print("Reverse Word : ");
        myStack.pop();
        myStack.pop();
        myStack.pop();

       scan.close();
    }
}
