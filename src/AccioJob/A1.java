package AccioJob;

abstract public class
A1 {
    // abstract method
   abstract void sum(int a,int b);

}

 class B1 extends A1{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
}



