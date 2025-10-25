public class StackQuestion {

    int top;
    int capacity;
    String arr[];


    StackQuestion(int size) {
        capacity = size;
        top = -1;
        arr = new String[size];
    }

    public boolean isFull() {
        return top + 1 == capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(String x) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            top++;
            arr[top] = x;
            System.out.println("Inserting : " + x);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Removing : " + arr[top]);
            top--;
        }
    }
    
    public void stackSize() {
        System.out.println("Stack size: " + (top + 1));
    }


    public static void main(String[] args) {

        StackQuestion myStack = new StackQuestion(5);
        myStack.push("Ace of Spades");
        myStack.push("King of Hearts");
        myStack.push("Queen of Diamonds");
        myStack.push("Jack of Clubs");
        myStack.push("10 of Spades");
        myStack.push("9 of Hearts"); // This should show Stack Overflow

        myStack.stackSize();

        myStack.pop();
        myStack.pop();

        myStack.stackSize();
    }
}
