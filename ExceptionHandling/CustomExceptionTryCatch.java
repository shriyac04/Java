package ExceptionHandling;
import java.util.*;
public class CustomExceptionTryCatch {
    public static void main(String[] args) throws MyExceptions {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        try {
            int age = scan.nextInt();
            if (age > 100) {
                throw new MyExceptions("My error is this");
            }

        }
        catch(Exception e) {
            System.out.println("Throws an error ");
        }
    }
}
class MyExceptions extends Exception{
    public MyExceptions(String msg){
        super(msg);
    }
}
