package AccioJob;

public class FisrtA {
    void print(){
        System.out.println("firstA");
    }
}
class FirstB extends FisrtA{
    void print(){
        System.out.println("FirstB");
    }
}
class FirstC extends FirstB{
//    void print(){
//        System.out.println("FirstC");
//    }
//    in case if you try to call firstc but its not
    // present any function in first c then call other class
    // like firstb
}
