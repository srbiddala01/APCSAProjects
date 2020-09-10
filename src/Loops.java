public class Loops {
    public static void main(String[] args) {
        for (int a = 0; a < 9; a++) {
            System.out.print(a + ", ");
        }
        System.out.println(" ");
        for (int b = 7; b < 13; b++) {
            System.out.print(b + ", ");
        }
        System.out.println(" ");
        for (int c = 12; c <= 30; c = c + 3) {
            System.out.print(c + ", ");
        }
        System.out.println(" ");
        for (int d = 100; d >= 0; d = d - 2) {
            System.out.print(d + ", ");
        }
        System.out.println(" ");
        System.out.println(" ");

        for (int e = 1; e <= 25; e++) {
            int s = (int) (Math.random() * 6 + 1);
            System.out.print(s + " ");
        }
        System.out.println(" ");
        System.out.println(" ");


        for (double t = 1; t <= 10; t++) {
            double r = (Math.random());
            if (r > 0.5) {
                System.out.print("heads ");
            } else if (r <= 0.5) {
                System.out.print("tails ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        double g = 0.0;
       do {
           g = Math.random();
           System.out.println(g);

       } while (g <= 0.9);

    }
}

