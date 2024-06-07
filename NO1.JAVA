import java.util.Scanner;

public class LeapMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get year and month from user
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        // Check for leap month using combined expression
        boolean isLeapMonth = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        // Display result
        if (isLeapMonth) {
            System.out.println(month + " is a leap month in year " + year);
        } else {
            System.out.println(month + " is not a leap month in year " + year);
        }

        scanner.close();
    }
}
