import java.util.Scanner;

// Generic Class
class GenericClass<T> {

    private T data;

    // Constructor
    public GenericClass(T data) {
        this.data = data;
    }

    // Method to display data
    public void display() {
        System.out.println("Data = " + data);
        System.out.println("Type = " + data.getClass().getName());
    }
}

public class GenericDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer type object
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        GenericClass<Integer> intObj =
            new GenericClass<>(num);

        // String type object
        sc.nextLine(); // consume newline

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        GenericClass<String> strObj =
            new GenericClass<>(text);

        // Display data
        System.out.println("\nInteger Object:");
        intObj.display();

        System.out.println("\nString Object:");
        strObj.display();

        sc.close();
    }
}