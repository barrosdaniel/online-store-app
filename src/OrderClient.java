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
                getOrderDetails(userOption);
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

    private static void getOrderDetails(int orderType) {
        int quantity;
        double price;
        String product = "";
        
        if (orderType == 1) {
            product = "book";
        } else if (orderType == 2) {
            product = "movie";
        }
        
        System.out.println("\n***** NEW ORDER *****");
        
        quantity = getQuantity(product);
        price = getPrice(product);
        System.out.println("Quantity entered is: " + quantity);
        System.out.println("Price entered is: " + price);
    }

    private static int getQuantity(String product) {
        String input;
        int quantity;
        
        while (true) {
            System.out.print("Enter the number of " + product + "s > ");
            input = scanner.nextLine().trim();
            
            // Check is user left quantity field blank
            if (input.isBlank() || input.isEmpty()) {
                System.out.println("ERROR: No quantity entered. Try again.\n");
                continue;
            }
            
            // Check if user input is integer
            if (input.matches("-?\\d+")) {
                quantity = Integer.parseInt(input);
                
                // Check if quantity is positive
                if (quantity > 0) {
                    break;
                } else {
                    System.out.println("""
                                       ERROR: Invalid quantity entered. Quantity
                                       must be positive.
                                       """);
                }
            } else {
                System.out.println("""
                                   ERROR: Invalid quantity entered. Quantity 
                                   must be a positive integer.
                                   """);
            }
        }
        return quantity;
    }

    private static double getPrice(String product) {
        String input;
        double price;
        
        while (true) {
            System.out.print("Enter the " + product + " price > ");
            input = scanner.nextLine().trim();
            
            // Check is user left price field blank
            if (input.isBlank() || input.isEmpty()) {
                System.out.println("ERROR: No price entered. Try again.\n");
                continue;
            }
            
            // Check if user input is double or integer
            if (input.matches("-?\\d+(\\.\\d+)?")) {
                price = Double.parseDouble(input);
                
                // Check if price is positive
                if (price > 0) {
                    break;
                } else {
                    System.out.println("""
                                       ERROR: Invalid price entered. Price must 
                                       be positive.
                                       """);
                }
            } else {
                System.out.println("""
                                   ERROR: Invalid price entered. Price must be 
                                   a positive numeric value.
                                   """);
            }
        }
        return price;
    }
}