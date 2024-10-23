package Stack;

public class Implementation {

    public static int top = -1;
    public static final int MAX_SIZE = 5;
    public static int[] arr = new int[MAX_SIZE];

    public static void push(int num) {
        if (top < MAX_SIZE - 1) {
            arr[++top] = num;
        } else {
            throw new RuntimeException("Stack is full");
        }
    }

    public static int pop() {
        if (top >= 0) {
            return arr[top--];
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public static int peek() {
        if (top >= 0) {
            return arr[top];
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // push(1);
        // push(2);
        // push(3);
        // System.out.println(pop());
        // System.out.println(peek());
        
        System.out.println(isEmpty());

        System.out.println();
        display();
    }
}
