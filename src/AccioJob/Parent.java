package AccioJob;

public class Parent {
    void print_parent(){
        System.out.println("Hii I am Parent class");
    }
}
class Child1 extends Parent{
    void printChild1(){
        System.out.println("Hii I am child 1 class");
    }
}

class Child2 extends Child1{
    void printChild2(){
        System.out.println("Hii I am child 2 class");
    }
}
