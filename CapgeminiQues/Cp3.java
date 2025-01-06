/*
 * Question 3 Problem Statement – Mayuri buys “N” no of products from a shop. The shop offers a different percentage of discount on each item.
 *  She wants to know the item that has the minimum discount offer, so that she can avoid buying that and save money.
[Input Format: The first input refers to the no of items; the second input is the item name, price and discount percentage separated by comma(,)]
Assume the minimum discount offer is in the form of Integer.
Note: There can be more than one product with a minimum discount.
Sample Input 1:
4
mobile,10000,20
shoe,5000,10
watch,6000,15
laptop,35000,5

Sample Output 1:
shoe

Explanation: The discount on the mobile is 2000, the discount on the shoe is 500, 
the discount on the watch is 900 and the discount on the laptop is 1750. So the discount on the shoe is the minimum.
Sample Input 2:
4
Mobile,5000,10
shoe,5000,10
WATCH,5000,10
Laptop,5000,10

Sample Output 2:
Mobile
shoe
WATCH
Laptop
 */
package CapgeminiQues;

import java.util.*;

public class Cp3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of items
        System.out.println("Enter the number of items:");
        int numOfItems = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] items = new String[numOfItems]; // To store the input details of items
        double[] discounts = new double[numOfItems]; // To store the discount amount of each item

        System.out.println("Enter item details (name,price,discount%):");
        double minDiscount = Double.MAX_VALUE;

        // Reading input and calculating discounts
        for (int i = 0; i < numOfItems; i++) {
            String itemDetails = scanner.nextLine();
            items[i] = itemDetails;

            String[] parts = itemDetails.split(",");
            String name = parts[0];
            double price = Double.parseDouble(parts[1]);
            double discountPercent = Double.parseDouble(parts[2]);

            // Calculate the discount amount
            double discount = (price * discountPercent) / 100;
            discounts[i] = discount;

            // Update minimum discount
            if (discount < minDiscount) {
                minDiscount = discount;
            }
        }

        // Print items with the minimum discount
        System.out.println("Items with the minimum discount:");
        for (int i = 0; i < numOfItems; i++) {
            if (discounts[i] == minDiscount) {
                String[] parts = items[i].split(",");
                System.out.println(parts[0]); // Print the item name
            }
        }
        scanner.close();
    }
}

