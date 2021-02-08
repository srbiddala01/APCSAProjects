package apcs.penny;

import java.util.Scanner;
import java.lang.Math;

public class Runner {
    public static void main(String[] args) {
        Square[][] board = {{new Square (1), new Square (1), new Square(1), new Square(1), new Square(1)},
                {new Square(1), new Square(2), new Square(2), new Square(2), new Square(1)},
                {new Square(1), new Square(2), new Square(3), new Square(2), new Square(1)},
                {new Square(1), new Square(2), new Square(2), new Square(2), new Square(1)},
                {new Square(1), new Square(1), new Square(1), new Square(1), new Square(1)}};

        for (int r = 0; r < board.length; r++){
            for (int c = 0; c < board[0].length; c++){
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }

        int runningTotal = 0;
        for (int i = 0; i < 5; i++){
            Scanner reader = new Scanner(System.in);
            System.out.print("Press 'Enter' to begin");
            String response = reader.nextLine();

            double row = (Math.random() * 5);
            double column = (Math.random() * 5);

            Square score = new Square(board[(int) row][(int) column].getScore());
            System.out.println("Selected Location: " + "[" + (int)row + "]" + "[" + (int)column + "]" + " Score: " + score);

            int score2 = board[(int) row][(int) column].getScore();
            boolean isOccupied = board[(int) row][(int) column].isOccupied();
            if (board[(int) row][(int) column].isOccupied() == false){
                runningTotal += score2;
                isOccupied = true;
            }

            for (int r = 0; r < board.length; r++){
                for (int c = 0; c < board[0].length; c++){
                    System.out.print(board[r][c] + " ");
                }
                System.out.println();
            }

            System.out.println("Your total score is: " + runningTotal);
            System.out.println("");
        }

        if (runningTotal >= 9){
            System.out.println("YOU'RE A WINNER!");
        }
    }



}
