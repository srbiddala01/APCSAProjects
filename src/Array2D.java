public class Array2D {
    public static void main(String[] args) {
        double[][] arrayOfDoubles = {{0.1, 0.2, 0.3, 0.5}, {1.1, 1.2, 1.3, 1.5}, {3.1, 3.2, 3.3, 3.5}};

        for (int r = 0; r < arrayOfDoubles.length; r++) {
            for (int c = 0; c < arrayOfDoubles[r].length; c++) {
                arrayOfDoubles[r][r] = arrayOfDoubles[r][c] * 2.0;
            }
        }
        for (int r = 0; r < arrayOfDoubles.length; r++) {
            for (int c = 0; c < arrayOfDoubles[r].length; c++){
                System.out.print(arrayOfDoubles[r][c] + " ");
            }
            System.out.println();
        }

        String[][] words = {{"this", "that"}, {"and", "the"}, {"other", "thing"}};
        for (int r = 0; r < arrayOfDoubles.length; r++){
            for (int c = 0; c < arrayOfDoubles[r].length; c++){
                String s = words[r][c];
                int length = s.length();
                System.out.print(s + " " + length);
            }
            System.out.println();
        }
    }
}
