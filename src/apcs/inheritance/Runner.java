package apcs.inheritance;

public class Runner {
    public static void main(String[] args) {
        Parent dad = new Parent();
        Parent mom = new Parent(5);

        Child brother = new Child();
        Child sister = new Child(6);
    }
}
