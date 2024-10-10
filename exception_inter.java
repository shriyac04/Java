import java.util.*;
public class exception_inter {
    public static void main(String[] args) {
        System.out.println("Enter the dividend: ");
        Scanner scan = new Scanner(System.in);
        int dividend= scan.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor=scan.nextInt();
        try{

            int result=dividend/divisor;
            System.out.println("The result is: "+result);
        }
        catch(Exception e){
            System.out.println("invalid division by zero!!");
            System.out.println("therefore adjust the value of divisor");
            System.out.println(dividend/(divisor+2));
        }
    }
}
