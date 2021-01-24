package apcs;

import apcs.fraction.Fraction;

import java.util.ArrayList;

public class AList {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
       // list.add("Hello");
       // list.add(new Integer(5));
       // list.add(new Fraction(1,2));
        list.add(new Double (20.0));
        list.add (new Double (12.0));
        list.add(new Double (3));
        list.add(16.0);
       // list.add(12);

        System.out.println(list);
    }
}
