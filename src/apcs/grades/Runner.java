package apcs.grades;

import java.util.Arrays;
import java.util.Scanner;

// The extension I completed is the one where I prompt the user to input as many scores as they would like to input without any restrictions on the quantity of grades. I added a scanner in the main method which enables the user to input the number of grades they would like to. Then, I take their input and assign their input as the size of the array so the array wouldn't have more or less 'space' for the list of grades. Then I modified the toString method to print out the array elements in an appealing way, of which doesn't include the brackets the system usually prints when printing an array (basically, I printed the array in a different, more appealing/comprehensible way.

public class Runner {
    public static double min (double[] arr) {
        double arr_min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr_min) {
                arr_min = arr[i];
            }
        }
        return arr_min;
    }

    public static double max (double[] arr) {
        double arr_max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++){
            if (arr[i] > arr_max) {
                arr_max = arr[i];
            }
        }
        return arr_max;
    }

    public static double average(double[] arr){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];
        }
        double arr_average = sum / arr.length;
        return arr_average;
    }

    public static String toString(double[] five_doubles) {
        String grades = " ";
        for (int i = 1; i < five_doubles.length; i++){
           grades = grades + ", " + five_doubles[i];
        }
        // Here I added the first index out of the loop so the grades would print properly with the commas printed in the right places.
        return "GRADES: " + five_doubles[0] + grades;
    }

    public static void main(String[] args) {

        System.out.println("DIRECTIONS: Enter your grades between 0.0 and 100.0. If your grade isn't within that range, an exception would occur.");
        System.out.println("");

        Scanner reader = new Scanner(System.in);
        int numb_of_grades;
        System.out.print("How many grades do you want to enter: ");
        numb_of_grades = reader.nextInt();

        System.out.println(" ");

        double[] five_doubles = new double[numb_of_grades];

        for (int i = 0; i < five_doubles.length; i++) {
            double grade;
            System.out.print("Enter your grade: ");
            grade = reader.nextDouble();
            if (grade >= 0.0 && grade <= 100.0) {
                five_doubles[i] = grade;

            } else {
                throw new IllegalArgumentException();
            }
        }
        System.out.println("");

        System.out.println(Runner.toString (five_doubles));

        double minimum = min(five_doubles);
        double maximum = max(five_doubles);
        double average = average(five_doubles);

        System.out.println("");

        System.out.println("MAXIMUM: The maximum score is: " + maximum);
        System.out.println("MINIMUM: The minimum score is: " + minimum);
        System.out.println("AVERAGE: The average score is: " + average);

    }

}
