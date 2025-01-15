package AccioJob;

public class exception {
    public static void main(String[] args) {
        System.out.println("Start");
         // int a= 20/0; // invalid value for java
        //System.out.println("end");
        // using exception handling to run this code
        try { // any false statement in try the catch will run
            // there is a no error in try then catch will not run
            int a= 20/10; // no err
            System.out.println("life coding with java");
        }
        catch (ArithmeticException e){
            System.out.println("end");
        }
        //finally it will run 100% it does not check  err or not
  finally {
            System.out.println(" I am coder");
        }




    }
}
