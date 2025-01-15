package AccioJob;

public class Box {
    int length;
    int width;
    int height;

    void fun(){
        System.out.println(length*width*height);
    }

    public static void main(String[] args) {
        Box b= new Box();
        b.length=4;
        b.width=3;
        b.height=2;
        b.fun();
    }
}
