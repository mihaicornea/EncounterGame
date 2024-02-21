package main.java.com.encounters.v1;

import java.util.Scanner;

public class EncounterGame {
    Grid grid;
    Player player;
    Scanner scanner;

    public EncounterGame() {
        this.grid = new Grid(30, 30);
        this.player = new Player(14, 14);
        this.scanner = new Scanner(System.in);
        player.inputName(scanner);
        grid.placeOnGrid(player.getX(), player.getY(), player.name);
    }

    public void startGame() {
        System.out.println("==*== Welcome to Encounter Game ==*==");
        while (true) {
            grid.displayBoard();
            boolean endGame = grid.updatePlayerPosition(player, scanner);
            if (!endGame) {
                System.out.println("Game Over");
                break;
            }
        }
        scanner.close();
    }
}
