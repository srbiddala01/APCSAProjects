package apcs.project1;
import java.util.Scanner;
public class Project3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of Kilometers: ");
        int x = reader.nextInt();
        int y = ((x * 60 * 90)/10000);
        System.out.println("# of nautical miles: " + y);
    }
}
