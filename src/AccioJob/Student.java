package AccioJob;
public class Student {

   String name;
   int roll_no;
   public Student(int roll_no){
       this.roll_no=roll_no;
       name="Shree Om Ranjan";
   }

   public Student(String name,int roll_no){
       this.name=name;
       this.roll_no=roll_no;
   }
   public  void fun(){
       System.out.println(name+" "+roll_no);
   }

    public static void main(String[] args) {
Student s1= new Student(10);
s1.fun();
Student s2= new Student("Shree",10);
s2.fun();




    }

}
