package AccioJob;

public class Final {
  final  int price=2000;
  final int number;
  static int roll_no;
  public Final(){

      this.number=345;
  }


    public static void main(String[] args) {
        Final f1= new Final();
       // f1.price=200; // can't modify value
        System.out.println(roll_no);
        System.out.println(f1.price);
        System.out.println(f1.number) ;
    }
}
