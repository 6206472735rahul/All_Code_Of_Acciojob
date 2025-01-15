package AccioJob;

interface  I {
    int a=20; // by default public static final
    void fun(); // public abstract
}
class I1 implements I{
    public void fun(){
        System.out.println("interface");
    }

}
