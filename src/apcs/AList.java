package apcs;

import apcs.fraction.Fraction;

import java.util.ArrayList;

public class AList {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
       // list.add("Hello");
       // list.add(new Integer(5));
       // list.add(new Fraction(1,2));
       // list.add(new Double (20.0));
       // list.add (new Double (12.0));
       // list.add(new Double (3));
      //  list.add(16.0);
       // list.add(12);

        for (int i = 0; i <= 20; i++){
            list.add(Math.random());
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++){
            Double val = list.get(i);
            val = i * -1.0;
            list.set(i, val);
        }
        System.out.println(list);

        Double min = list.get(0);
        for(Double val: list){
            if (val < min){
                min = val;
            }
        }
        System.out.println("Minimum is: " + min);


        for(int i = 0; i < list.size(); i = i + 2){
            list.add(i, 0.0);
        }
        System.out.println(list);

        for(int i = list.size()-1; i >=0; i--){
            if (list.get(i) > -0.5){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
