package AccioJob;

public class A {
    public A(){
        System.out.println("A");
    }
}

class B extends A{
    public B(int x){
        System.out.println("B");
    }
}
class C extends B{
    public C(){
        super(1);
        System.out.println("C");
    }
}
