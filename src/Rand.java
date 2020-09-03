public class Rand {
    public static void main(String[] args) {
        double r  = Math.random();
        System.out.println(r);

        double s = (Math.random() * 100.0);
        System.out.println(s);

        double a = (Math.random() * 1.0 + 5.0);
        System.out.println(a);

        double b = (Math.random() - 10.0 );
        System.out.println(b);

        double c = (int) (Math.random() * 100);
        System.out.println(c);

        double d  = (int)(Math.random()*52.0 + 1.0);
        System.out.println(d);

        System.out.println();


        double i = (int)(Math.random()*6.0 + 1.0);
        double m = (int)(Math.random()*6.0 + 1.0);
        double sum  = (int)(i + m);
        System.out.println(sum);

        }
    }

