package AccioJob;

interface  I3 {
    void fun();
}
interface I4{
    void fun();
}

class I5 implements I3,I4{
   public void fun(){
       System.out.println("multiple inheritance");
    }
}
