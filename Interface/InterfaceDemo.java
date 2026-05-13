import java.util.Scanner;

// Interface
interface Exam {

    // Method declarations
    void setExam(String division, int mark);

    void showExam();
}

// Class implementing interface
class Test implements Exam {

    private String division;
    private int mark;

    // Implement setExam()
    @Override
    public void setExam(String division, int mark) {

        this.division = division;
        this.mark = mark;
    }

    // Implement showExam()
    @Override
    public void showExam() {

        System.out.println("\nExam Record");
        System.out.println("Division: " + division);
        System.out.println("Mark: " + mark);
    }
}

// Main class
public class InterfaceDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter division: ");
        String division = sc.nextLine();

        System.out.print("Enter mark: ");
        int mark = sc.nextInt();

        // Create object
        Test t = new Test();

        // Set values
        t.setExam(division, mark);

        // Display record
        t.showExam();

        sc.close();
    }
}