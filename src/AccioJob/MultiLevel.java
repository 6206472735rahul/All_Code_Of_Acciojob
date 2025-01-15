package AccioJob;

public class MultiLevel {
    public static void main(String[] args) {
        Child2 c2= new Child2();
        c2.print_parent();
        c2.printChild1();
        c2.printChild2();

    }
}
