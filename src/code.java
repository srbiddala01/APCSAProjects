import java.util.Scanner;
/*
public class code {
    package apcs.lucky7;

import java.util.Scanner;


    public class GameRunner {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            String play;
            play = reader.next();
            System.out.println("Welcome to Shriya Biddala's Gambling Game! /n Are you ready to play? (yes/no)");
            if (play.equals("Yes")) {
                reader = new Scanner(System.in);
                int balance;
                System.out.print("Enter the amount of money you're willing to gamble: $");
                balance = reader.nextInt();

                if (balance > 20) {
                    int rolls = 0;


                    int roll = 0;

                    double max = balance;

                    while (balance > 0) {
                        rolls++;
                        int dice1 = (int) (Math.random() * 6 + 1);
                        int dice2 = (int) (Math.random() * 6 + 1);
                        int total = dice1 + dice2;

                        if (total == 7) {
                            balance = balance + 4;
                            System.out.println("Roll #" + rolls + ": " + dice1 + ", " + dice2 + "   Total: 7" + " WIN!     " + "Starting Balance:" + balance);
                        } else if (total > 0) {
                            balance = balance - 1;
                            System.out.println("Roll #" + rolls + ": " + dice1 + ", " + dice2 + "   Total: " + total + " LOSE!    " + "Starting Balance:" + balance);
                        }

                        if (balance > max) {
                            max = balance;
                            roll = rolls;
                        }

                    }
                } else {
                    return;
                }

            } else {
                System.out.println("Ok, come back when your ready");
            }
        }
    }


} */
