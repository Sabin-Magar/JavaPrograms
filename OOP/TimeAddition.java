import java.util.Scanner;

class Time {
    int hr;
    int min;
    int sec;

    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        normalize();
    }

    private void normalize() {
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
    }

    public Time add(Time other) {
        return new Time(this.hr + other.hr, this.min + other.min, this.sec + other.sec);
    }

    @Override
    public String toString() {
        return String.format("%02d : %02d : %02d", hr, min, sec);
    }
}

public class TimeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first time:");
        System.out.print("Hours: ");
        int h1 = sc.nextInt();
        System.out.print("Minutes: ");
        int m1 = sc.nextInt();
        System.out.print("Seconds: ");
        int s1 = sc.nextInt();

        System.out.println("\nEnter the second time:");
        System.out.print("Hours: ");
        int h2 = sc.nextInt();
        System.out.print("Minutes: ");
        int m2 = sc.nextInt();
        System.out.print("Seconds: ");
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);
        Time sum = t1.add(t2);

        System.out.println("\nFirst time: " + t1);
        System.out.println("Second time: " + t2);
        System.out.println("Sum of times: " + sum);

        sc.close();
    }
}
