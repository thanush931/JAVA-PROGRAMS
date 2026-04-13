package prg1;

import java.util.ArrayList;

public class PlayerManager {
    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(Player p) {
        players.add(p);
        System.out.println("Player Added.");
    }

    public void viewPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players found.");
        } else {
            for (Player p : players) {
                p.displayPlayer();
            }
        }
    }

    public Player searchPlayer(String id) {
        for (Player p : players) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void deletePlayer(String id) {
        Player p = searchPlayer(id);
        if (p != null) {
            players.remove(p);
            System.out.println("Player deleted.");
        } else {
            System.out.println("Player not found.");
        }
    }
}