package apcs.fraction;
import java.util.Scanner;

public class FractionRunner {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter a numerator: ");
            int fraction1numerator = reader.nextInt();

            reader = new Scanner(System.in);
            System.out.print("Enter a denominator: ");
            int fraction1denominator = reader.nextInt();

            reader = new Scanner(System.in);
            System.out.print("Enter an operation (enter Add, Subtract, Multiply or Divide)- make sure you capitalize the first letter of the name of the operator (only the first letter): ");
            String operator = reader.next();

            reader = new Scanner(System.in);
            System.out.print("Enter another numerator: ");
            int fraction2numerator = reader.nextInt();

            reader = new Scanner(System.in);
            System.out.print("Enter another denominator: ");
            int fraction2denominator = reader.nextInt();


            Fraction fraction1 = new Fraction(fraction1numerator, fraction1denominator);
            fraction1.setNumerator(fraction1numerator);
            fraction1.setDenominator(fraction1denominator);
            int numerator1 = fraction1.getNumerator();
            int denominator1 = fraction1.getDenominator();

            Fraction fraction2 = new Fraction(fraction2numerator, fraction2denominator);
            fraction2.setNumerator(fraction2numerator);
            fraction2.setDenominator(fraction2denominator);
            int numerator2 = fraction2.getNumerator();
            int denominator2 = fraction2.getDenominator();

            if (operator.equals("Add")) {
                Fraction addition = fraction1.add(fraction2);
                System.out.println(numerator1 + "/" + denominator1 + " + " + numerator2 + "/" + denominator2 + " = " + addition);

                reader = new Scanner(System.in);
                System.out.print("Do you want your fraction as a mixed number (yes or no)? ");
                String resp = reader.next();
                if (resp.equals("yes")) {
                    System.out.println("Your fraction as a mixed number is: " + addition.getMixednum());
                }
            }
            if (operator.equals("Subtract")) {
                Fraction subtraction = fraction1.subtract(fraction2);
                System.out.println(numerator1 + "/" + denominator1 + " - " + numerator2 + "/" + denominator2 + " = " + subtraction);

                reader = new Scanner(System.in);
                System.out.print("Do you want your fraction as a mixed number (yes or no)? ");
                String resp = reader.next();
                if (resp.equals("yes")) {
                    System.out.println("Your fraction as a mixed number is: " + subtraction.getMixednum());
                }
            }
            if (operator.equals("Multiply")) {
                Fraction multiplication = fraction1.multiply(fraction2);
                System.out.println(numerator1 + "/" + denominator1 + " * " + numerator2 + "/" + denominator2 + " = " + multiplication);

                reader = new Scanner(System.in);
                System.out.print("Do you want your fraction as a mixed number (yes or no)? ");
                String resp = reader.next();
                if (resp.equals("yes")) {
                    System.out.println("Your fraction as a mixed number is: " + multiplication.getMixednum());
                }
            }
            if (operator.equals("Divide")) {
                Fraction division = fraction1.divide(fraction2);
                System.out.println(numerator1 + "/" + denominator1 + " / " + numerator2 + "/" + denominator2 + " = " + division);

                reader = new Scanner(System.in);
                System.out.print("Do you want your fraction as a mixed number (yes or no)? ");
                String resp = reader.next();
                if (resp.equals("yes")) {
                    System.out.println("Your fraction as a mixed number is: " + division.getMixednum());
                }
            }

       /* Fraction f1 = new Fraction (1, 2);         // represents one-half
        System.out.print ("One Half = ");
        System.out.println (f1);                   // should output   1 / 2
        f1.setNumerator (3);                       // change numerator to 3
        f1.setDenominator (4);                     // change denominator to 4
        int num = f1.getNumerator ();              // get the numerator
        int den = f1.getDenominator ();            // get the denominator
        System.out.print ("Three Quarters = ");
        System.out.println (num + "/" + den);      // should output 3 / 4

        Fraction f2 = new Fraction (2, 3);
        System.out.print ("Two Thirds = ");
        System.out.println (f2);
        Fraction sum = f1.add(f2);
        System.out.println (f1 + " + " + f2 + " = " + sum);

        f2 = new Fraction (1, 2);
        sum = f1.add(f2);
        Fraction difference = f1.subtract(f2);
        Fraction product = f1.multiply(f2);
        Fraction quotient = f1.divide(f2);

        System.out.println ("f1: " + f1);
        System.out.println ("f2: " + f2);
        System.out.println ("sum: " + sum);
        System.out.println ("difference: " + difference);
        System.out.println ("product: " + product);
        System.out.println ("quotient: " + quotient);


        f1 = new Fraction (1, 2);
        f2 = new Fraction (1, 2);
        System.out.println (f1 + "==" + f2 + " = " + f1.equals (f2));
        System.out.println (f2 + "==" + f1 + " = " + f2.equals (f1));

        f2 = new Fraction (1, 3);
        System.out.println (f1 + "==" + f2 + " = " + f1.equals (f2));
        System.out.println (f2 + "==" + f1 + " = " + f2.equals (f1));

        f2 = new Fraction (2, 4);
        System.out.println (f1 + "==" + f2 + " = " + f1.equals (f2));
        System.out.println (f2 + "==" + f1 + " = " + f2.equals (f1));
*/
    }
}
