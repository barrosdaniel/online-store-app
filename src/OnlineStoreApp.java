import java.util.Scanner;

public class OnlineStoreApp {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            printHeader();
            int userOption = getUserOption();
            if (userOption == 3) {
                System.out.println("Thank you for using the Online Store App. "
                        + "Goodbye.");
                break;
            } else {
                System.out.println("Selected option: " + userOption);
            }
        }
    }

    private static void printHeader() {
        System.out.println("==================================================");
        System.out.println("ONLINE STORE APP");
        System.out.println("==================================================");
        System.out.println("MAIN MENU");
        System.out.println("Select from the following options:");
        System.out.println("1. Purchase Book");
        System.out.println("2. Purchase Movie");
        System.out.println("3. Exit application");
        System.out.println("*****");
    }

    private static int getUserOption() {
        int userOption;
        while (true) {
            System.out.print("Enter your option > ");
            if (scanner.hasNextInt()) {
                userOption = scanner.nextInt();
                if (userOption >= 1 && userOption <= 3) {
                    break;
                } else {
                    System.out.println("ERROR: Invalid option entered. Try "
                            + "again.\n");
                }
            } else {
                System.out.println("ERROR: Invalid option entered. Try again."
                        + "\n");
                scanner.next(); // This is required to remove the but where an 
                                // invalid option stays is kept in the scanner 
                                // buffer.
            }
        }
        return userOption;
    }
}