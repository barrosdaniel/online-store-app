import java.util.Scanner;

public class OrderClient {
    private static Scanner scanner;
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        while (true) {
            printHeader();
            int userOption = getUserOption();

            if (userOption == 3) {
                break;
            } else {
                processOrder(userOption);
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
        String input;
        while (true) {
            System.out.print("Enter your option > ");
            input = scanner.nextLine().trim();
            
            // Check is user left option field blank
            if (input.isBlank() || input.isEmpty()) {
                System.out.println("ERROR: No option entered. Try again.\n");
                continue;
            }
            
            // Check if user input is integer
            if (input.matches("\\d+")) {
                userOption = Integer.parseInt(input);
                
                // Check if user input is 1, 2, or 3
                if (userOption >= 1 && userOption <= 3) {
                    break;
                } else {
                    System.out.println("ERROR: Invalid option entered. Try "
                            + "again.\n");
                }
            } else {
                System.out.println("ERROR: Invalid option entered. Option must "
                        + "be an integer.\n");
            }
        }
        return userOption;
    }

    private static void processOrder(int orderType) {
        if (orderType == 1) {
            System.out.println("Processing book order");
        } else if (orderType == 2) {
            System.out.println("Processing movie order");
        }
    }
}