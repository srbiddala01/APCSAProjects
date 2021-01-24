import java.util.Arrays;

public class EnhancedFor {
    public static void main(String[] args) {
        double[] vals = new double[10];

        for (int i = 0; i < 10; i++) {
            vals[i] = Math.random();
        }
        System.out.println(Arrays.toString(vals));

       /* for (int i = 0; i < 10; i++){
            System.out.println(vals[i]);
        }
        */

        for(double val: vals){
            System.out.println(val);
        }
    }
}
