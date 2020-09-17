package apcs.pi;

import java.util.Scanner;
public class PiRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x;
        System.out.print("Enter a number: ");
        x = reader.nextInt();

        double a = 0.0;
        double b = 0.0;
        double c = 1.0;
        for (int i = 0; i < x; i++) {
            a = (double) (i * 2) + 1.0;
            b += (4 / a) * c;
            c = c * -1;
        }
        if (x == 1){
            System.out.print("Pi approximated to " + x + " term is " + b);
        } else{
            System.out.println("Pi approximated to " +  x + " terms is " + b);
        }
        System.out.println("");
        System.out.println("");

        reader = new Scanner(System.in);
        double thres;
        System.out.print("Enter a threshold: ");
        thres = reader.nextDouble();


        int i = 0;
        double pi = 0.0;
        double pres = 1.0;
        double g = 1.0;
        if (thres > 1) {
            System.out.println("Not a valid input");
            return;
        }
        while (pres >= thres) {
            pres = (double) 4/(i * 2+ 1);
            pi += (pres * g);
            g = g * -1;
            i++;
        }
            System.out.println("Pi approximated until a term is less than " + thres + " is " + pi);

        int count = i;
        System.out.print("It required " + count + " term(s) to make this approximation. ");

        System.out.println();
        System.out.println();

        reader = new Scanner(System.in);
        int o;
        System.out.print("Enter the preferred number of coordinate pairs: ");
        o = reader.nextInt();

        double ins = 0.0;
        for (int weird = 0; weird < o; weird++) {
            double v1  =(Math.random() *1) - 1;
            double v2 = (Math.random() *1) - 1;
            if ((Math.pow(v1,2) + Math.pow(v2,2)) < 1) {
              ins++;
            }
        }
        double pi4 = ins/o;
        double pi42 = 4 * pi4;
        System.out.println(o+ " were generated");
        System.out.println((int)ins + " fell inside the circle");
        System.out.println("Pi/4 is approximately "+ ins + "/" + o + " = " + pi4);
        System.out.println("Pi is approximately " + pi42);

    }
}