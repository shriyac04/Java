//this is for unchecked exceptions
import java.util.*;
public class except_throw {
    public static void validate(int age) {
        if(age<18){
            throw new ArithmeticException("person is not eligible to vote.");

        }
        else{
            System.out.println("person is eligible to vote!!");
        }
    }

    public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age= scan.nextInt();
        validate(age);
        System.out.println("rest.");
    }
}
