package main.java.com.encounters.v1;

import java.util.Scanner;

public class Grid {
    int rows;
    int columns;
    char[][] board;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new char[rows][columns];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = '.';
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void placeOnGrid(int x, int y, String character) {
        this.board[x][y] = character.charAt(0);
    }

    public boolean updatePlayerPosition(Player player, Scanner scanner) {
        System.out.println("Enter move (w,s,a,d,q): ");
        char command = scanner.next().charAt(0);
        if (command == 'q') {
            return false;
        }
        int newX = player.getX();
        int newY = player.getY();

        switch (command) {
            case 'w':
                if (newX > 0) {
                    newX--;
                }
                break;
            case 's':
                if (newX < rows - 1) {
                    newX++;
                }
                break;
            case 'a':
                if (newY > 0) {
                    newY--;
                }
                break;
            case 'd':
                if (newY < columns - 1) {
                    newY++;
                }
                break;
            default:
                System.out.println("Invalid command.");

        }
        this.board[player.getX()][player.getY()] = '_';
        player.setX(newX);
        player.setY(newY);
        this.board[newX][newY] = player.getName();
        return true;
    }
}