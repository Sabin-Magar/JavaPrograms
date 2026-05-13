import java.util.Scanner;
class Stack {
    private int[] arr;
    private int top;
    private int size;
    // Constructor
    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            System.out.println();
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed into stack.");
            System.out.println();
        }
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            System.out.println();
        } else {
            System.out.println(arr[top] + " popped from stack.");
            top--;
            System.out.println();
        }
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            System.out.println();
        } else {
            System.out.println("\nStack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
            System.out.println();
        }
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input stack size
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        int choice;
        System.out.println("\n1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print( "Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
        sc.close();
    }
}