package ExceptionHandling;
import java.util.*;
public class LearnException {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            getnum(a);
        }
        catch(Exception e){
            System.out.println("catched the exception: "+e.getMessage());
        }
    }
    static int getnum(int arr[]) throws ArithmeticException{
        return arr[8];
    }
}
