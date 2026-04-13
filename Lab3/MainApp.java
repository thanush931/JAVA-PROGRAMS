package prg3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int n = scanner.nextInt();

        UserThread[] threads = new UserThread[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nUser " + (i + 1));

            System.out.print("Enter operation (add/remove): ");
            String op = scanner.next();

            System.out.print("Enter quantity: ");
            int qty = scanner.nextInt();

            threads[i] = new UserThread(cart, qty, op);
            threads[i].setName("User" + (i + 1));
        }

        // Start threads
        for (int i = 0; i < n; i++) {
            threads[i].start();
        }

        // Wait for threads
        for (int i = 0; i < n; i++) {
            try {
                threads[i].join();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("\nFinal items in cart: " + cart.getItems());
        scanner.close();
    }
}
