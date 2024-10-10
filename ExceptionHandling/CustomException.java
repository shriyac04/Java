package ExceptionHandling;
import java.util.*;
public class CustomException {
    public static void main(String[] args) throws MyException {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=scan.nextInt();
        if(age>100){
          throw new MyException("My error is this");
        }
    }
}
//custom exception

class MyException extends Exception{
public MyException(String msg){
super(msg);
}
}
