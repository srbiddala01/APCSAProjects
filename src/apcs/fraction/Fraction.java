package apcs.fraction;
/* I did the mixed number extension (the medium one). */

/**
 * This class takes a Fraction and performs arithmetic operations, such as adding, subtracting, multiplying and dividing, with another fraction.
 * @author Shriya Biddala
 */
public class Fraction {
    private int numerator = 0;
    private int denominator = 0;
    private String mixednum = "0/0";

    /**
     * Creates a new instance of a Fraction with an assigned numerator and denominator.
     * @param numer The numerator
     * @param denom The denominator
     */
    public Fraction (int numer, int denom){
        numerator = numer;
        denominator = denom;
    }

    /**
     * Creates a new instance of a Fraction with and assigned numerator and denominator.
     * @param mixednumber A mixed number conversion of a sum, difference, product or quotient.
     */
    public Fraction (String mixednumber) {
        mixednumber = mixednum;
    }

    /**
     * Gets the newly-converted mixed number
     * @return Returns the newly-converted as a String.
     */
    public String getMixednum() {
        return mixednum;
    }

    /**
     * Updates the numerator value.
     * @param numerator The numerator with a new assigned value.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    /**
     * Gets the numerator the newly assigned [value].
     * @return Returns the newly assigned numerator.
     */
    public int getNumerator () {
        return numerator;
    }

    /** Updates the denominator value.
     * Preconditions:
     * - the denominator must be an integer
     * - the denominator cannot be 0
     * @param denominator The denominator with a new assigned value.
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * Gets the newly assigned numerator [value].
     * @return Returns the newly assigned denominator.
     */
    public int getDenominator(){
        return denominator;
    }

    /**
     * Converts the sum, product, difference or quotient into a mixed number, at user's request.
     * @param numer1 The numerator of the sum, product, quotient, difference
     * @param denom1 The denominator of the sum, quotient, difference, product
     * @return Returns the newly-converted mixed-number.
     */
    public String mixednumber1 (int numer1, int denom1){
        int whole_num = numer1/denom1;
        int reminder = numer1%denom1;
        return (whole_num + " " + reminder+"/" + denom1);
    }

    /**
     * This method adds the 2 given fractions.
     * @param other The other given fraction.
     * @return Returns the solution (sum) of the 2 given fraction
     */
    public Fraction add (Fraction other){
        int numeratorsum = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int denominatorsum = this.denominator * other.denominator;
        Fraction sum1 = new Fraction(numeratorsum, denominatorsum);
        sum1.mixednum = sum1.mixednumber1(numeratorsum, denominatorsum);
        return sum1;
    }

    /**
     * This method subtracts the 2 given fractions.
     * @param other The other given fraction.
     * @return Returns the solution (difference) of the 2 given fraction
     */
    public Fraction subtract (Fraction other){
        int numeratordifference = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int denominatordifference = this.denominator * other.denominator;
        Fraction difference1 = new Fraction(numeratordifference, denominatordifference);
        difference1.mixednum = difference1.mixednumber1(numeratordifference, denominatordifference);
        return difference1;
    }
    /**
     * This method multiplies the 2 given fractions.
     * @param other The other given fraction.
     * @return Returns the solution (product) of the 2 given fractions.
     */
    public Fraction multiply (Fraction other){
        int numeratorproduct = this.numerator * other.numerator;
        int denominatorproduct = this.denominator * other.denominator;
        Fraction product1 = new Fraction(numeratorproduct, denominatorproduct);
        product1.mixednum = product1.mixednumber1(numeratorproduct, denominatorproduct);
        return product1;
    }
    /**
     * This method divides the 2 given fractions.
     * @param other The other given fraction.
     * @return Returns the solution (quotient) of the 2 given fractions.
     */
    public Fraction divide (Fraction other){
        int numeratorquotient = this.numerator * other.denominator;
        int denominatorquotient = this.denominator * other.numerator;
        Fraction quotient1 = new Fraction(numeratorquotient, denominatorquotient);
        quotient1.mixednum = quotient1.mixednumber1(numeratorquotient, denominatorquotient);
        return quotient1;
    }


    public boolean equals (Fraction other) {
        if ((this.numerator * other.denominator) == (other.numerator * this.denominator)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String info = numerator + "/" + denominator;
        return info;

    }

}
