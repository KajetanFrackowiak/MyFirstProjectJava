package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define the earned amounts for each item
        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;

        // Calculate the total earnings
        double revenues = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;

        // Print the header
        System.out.println("Earned amount:");

        // Print each item and its earned amount
        printItem("Bubblegum", bubblegum);
        printItem("Toffee", toffee);
        printItem("Ice cream", iceCream);
        printItem("Milk chocolate", milkChocolate);
        printItem("Doughnut", doughnut);
        printItem("Pancake", pancake);

        // Print the total income
        System.out.printf("\nIncome: $%.1f\n", revenues);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();

        int netIncome = (int) (revenues - staffExpenses - otherExpenses);
        System.out.printf("Net income: $%d", netIncome);
    }

    // Helper function to print an item and its earned amount
    private static void printItem(String itemName, int amount) {
        System.out.printf("%s: $%d%n", itemName, amount);
    }
}
