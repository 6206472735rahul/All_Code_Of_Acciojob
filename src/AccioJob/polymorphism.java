package AccioJob;

public class polymorphism {

    int sum(int a,int b,int c){
        return  a+b+c;
    }
    int sum(int a,int b,int c,int d){
        return  a*b*c*d;
    }


    public static void main(String[] args) {
        polymorphism p1= new polymorphism();
       int Ans1 =p1.sum(1,2,3);
       int Ans2 =p1.sum(1,2,3,4);
        System.out.println(Ans1+" "+Ans2);
    }
}
