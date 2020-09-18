package apcs.lucky7;

import java.util.Scanner;


public class GameRunner {
    /* I completed an extension: I asked what the user's lucky number was and used their lucky numbers as the "Magic Sum" that the dice need to add up to in order to win, and I also set a minimum limit on the number of dollars the user can input so I can make more money.*/
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String start;
        System.out.print("Welcome to Shriya Biddala's Gambling Game! \nWARNING! You are going to be SUPER RICH after this game! \n Enter 'Start' to Play: ");
        start = reader.next();
        if (start.equals("Start")){
            String res = "none";
            do {
            reader = new Scanner(System.in);
            int balance;
            System.out.print(" Enter the amount of money you're willing to gamble: $");
            balance = reader.nextInt();

               if (balance > 20) {
                reader = new Scanner(System.in);
                int lucky;
                System.out.print(" Enter your lucky number: ");
                lucky = reader.nextInt();

                int rolls = 0;


                int roll = 0;

                double max = balance;

                while (balance > 0) {
                    rolls++;
                    int dice1 = (int) (Math.random() * 6 + 1);
                    int dice2 = (int) (Math.random() * 6 + 1);
                    int total = dice1 + dice2;

                    if (total == lucky) {
                        balance = balance + 4;
                        System.out.println("Roll #" + rolls + ": " + dice1 + ", " + dice2 + "   Total: " + lucky + " WIN!     " + "Starting Balance: $" + balance);
                    } else if (total > 0) {
                        balance = balance - 1;
                        System.out.println("Roll #" + rolls + ": " + dice1 + ", " + dice2 + "   Total: " + total + " LOSE!    " + "Starting Balance: $" + balance);
                    }

                    if (balance > max) {
                        max = balance;
                        roll = rolls;
                    }
                }
                System.out.println("You are broke after " + rolls + " rolls.");
                System.out.println("You should have stopped at " + roll + " rolls " + "when you had $" + max);
                System.out.print("You want to play again? ");

                reader = new Scanner(System.in);
                res = reader.next();


            }
            } while (res.equals("Yes")) ;

        }
    }

}