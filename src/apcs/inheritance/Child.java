package apcs.inheritance;

public class Child extends Parent {
    public Child() {
        super(7);
        System.out.println("Default Child Constructor");
    }
    public Child(int num) {
        System.out.println("Special Child Constructor " + num);
    }
}
