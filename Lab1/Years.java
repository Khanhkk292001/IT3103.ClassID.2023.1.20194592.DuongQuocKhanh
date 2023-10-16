
import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a month and year: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            String[] inputParts = input.split(" ");

            if (inputParts.length != 2) {
                System.out.println("Invalid input. Please enter both the month and year.");
                continue;
            }

            String month = inputParts[0];
            String yearString = inputParts[1];

            if (!isValidMonth(month) || !isValidYear(yearString)) {
                System.out.println("Invalid month or year. Please enter a valid month and year.");
                continue;
            }

            int year = Integer.parseInt(yearString);
            int monthIndex = getMonthIndex(month);

            int daysInMonth = calculateDaysInMonth(year, monthIndex);

            System.out.println("There are " + daysInMonth + " days in " + month + " " + year);
        }

        scanner.close();
    }

    private static boolean isValidMonth(String month) {
        return month.matches("January|February|March|April|May|June|July|August|September|October|November|December|Jan\\.|Feb\\.|Mar\\.|Apr\\.|May|Jun\\.|Jul\\.|Aug\\.|Sep\\.|Oct\\.|Nov\\.|Dec\\.|1|2|3|4|5|6|7|8|9|10|11|12");
    }

    private static int getMonthIndex(String month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < monthNames.length; i++) {
            if (month.equalsIgnoreCase(monthNames[i]) || month.equalsIgnoreCase(getAbbreviation(monthNames[i])) || month.equalsIgnoreCase(String.valueOf(i + 1))) {
                return i;
            }
        }
        return -1; // Invalid month
    }

    private static String getAbbreviation(String month) {
        return month.substring(0, 3);
    }

    private static boolean isValidYear(String year) {
        return year.matches("\\d{4}");
    }

    private static int calculateDaysInMonth(int year, int monthIndex) {
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[monthIndex];
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
