public class ImpStack {

    private int maxSize;
    private int[] Sarray;
    private int top;
    
    public ImpStack(int size) {
        maxSize = size;
        Sarray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (maxSize - 1) == top;
    }

    public void push(int data) {
        if ((isFull())) {
            System.out.println("Stack is Full");
        } else {
            Sarray[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return Sarray[top--];
        }
    }
}
