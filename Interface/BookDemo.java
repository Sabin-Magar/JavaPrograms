import java.util.Scanner;

// Book class
class Book {

    // Instance variables
    private String title;
    private double price;

    // Method to set values
    public void setVar(String title,
                       double price) {

        this.title = title;
        this.price = price;
    }

    // Method to display values
    public void showVar() {

        System.out.println(
            "Title: " + title
        );

        System.out.printf(
            "Price: %.2f\n",
            price
        );
    }

    // Getter method for title
    public String getTitle() {

        return title;
    }
}

// Main class
public class BookDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 4 books
        Book[] books = new Book[4];

        // Input book details
        for (int i = 0; i < 4; i++) {

            books[i] = new Book();

            System.out.println(
                "\nEnter details of Book "
                + (i + 1)
            );

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            sc.nextLine(); // consume newline

            books[i].setVar(title, price);
        }

        // Display books starting with "Java"
        System.out.println(
            "\nBooks starting with \"Java\":"
        );

        for (int i = 0; i < 4; i++) {

            if (books[i]
                    .getTitle()
                    .startsWith("Java")) {

                books[i].showVar();

                System.out.println();
            }
        }

        sc.close();
    }
}