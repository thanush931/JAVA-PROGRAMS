package prg1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        PlayerManager manager = new PlayerManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Cricket Player Management ---");
            System.out.println("1. Add Player");
            System.out.println("2. View Players");
            System.out.println("3. Search Player");
            System.out.println("4. Delete Player");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Player ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Role (Batsman/Bowler/All-rounder): ");
                    String role = scanner.nextLine();

                    System.out.print("Enter Runs: ");
                    int runs = scanner.nextInt();

                    manager.addPlayer(new Player(id, name, role, runs));
                    break;

                case 2:
                    manager.viewPlayers();
                    break;

                case 3:
                    System.out.print("Enter Player ID to search: ");
                    String searchId = scanner.nextLine();
                    Player p = manager.searchPlayer(searchId);
                    if (p != null)
                        p.displayPlayer();
                    else
                        System.out.println("Player Not Found");
                    break;

                case 4:
                    System.out.print("Enter Player ID to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.deletePlayer(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}