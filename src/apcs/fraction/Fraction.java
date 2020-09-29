package apcs.fraction;

public class Fraction {
    private int numerator = 0;
    private int denominator = 0;

    public Fraction (int num, int denom){
        numerator = num;
        denominator = denom;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getNumerator () {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int getDenominator(){
        return denominator;
    }

    public Fraction add (Fraction other){
        int numeratorsum = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int denominatorsum = this.denominator * other.denominator;
        Fraction sum1 = new Fraction(numeratorsum, denominatorsum);
        return sum1;
    }
    public Fraction subtract (Fraction other){
        int numeratordifference = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int denominatordifference = this.denominator * other.denominator;
        Fraction difference1 = new Fraction(numeratordifference, denominatordifference);
        return difference1;
    }
    public Fraction multiply (Fraction other){
        int numeratorproduct = this.numerator * other.numerator;
        int denominatorproduct = this.denominator * other.denominator;
        Fraction product1 = new Fraction(numeratorproduct, denominatorproduct);
        return product1;
    }
    public Fraction divide (Fraction other){
        int numeratorquotient = this.numerator * other.denominator;
        int denominatorquotient = this.denominator * other.numerator;
        Fraction quotient1 = new Fraction(numeratorquotient, denominatorquotient);
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
