import java.util.*;
public class exception {
    public static void main(String[] args) {
        // ArithmeticException
//        int data=50/0;
//        System.out.println("rest of the code");
try{
    int data=50/0;
    System.out.println("rest of the code");
}
catch(Exception e){
    System.out.println(e);
}
        System.out.println("rest");
    }

}
