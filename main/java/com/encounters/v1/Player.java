package main.java.com.encounters.v1;

import java.util.Scanner;

public class Player {
    int xPosition;
    int yPosition;
    String name;

    //constructorii
    public Player(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    //metoda de input name din scanner
    public void inputName(Scanner scanner) {
        System.out.println("Enter player's name: ");
        this.name = scanner.nextLine();
    }

    public int getX() {
        return xPosition;
    }

    public void setX(int x) {
        this.xPosition = x;
    }

    public int getY() {
        return yPosition;
    }

    public void setY(int y) {
        this.yPosition = y;
    }

    public char getName() {
        return name.charAt(0);
    }
}