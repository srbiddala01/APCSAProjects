package apcs.fraction;

public class FractionRunner {
    public static void main(String[] args) {
        Fraction f1 = new Fraction (1, 2);         // represents one-half
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

    }
}
