package prg1;

public class Player {
    private String id;
    private String name;
    private String role; // Batsman, Bowler, All-rounder
    private int runs;

    public Player(String id, String name, String role, int runs) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.runs = runs;
    }

    public String getId() {
        return id;
    }

    public void displayPlayer() {
        System.out.println("Player ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Runs: " + runs);
    }
}