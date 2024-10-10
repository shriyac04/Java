import java.util.*;
public class finals {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend=scan.nextInt();
        System.out.print("enter the divisor: ");
        int divisor=scan.nextInt();
        try{
            int result=dividend/divisor;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("It's executed yayyy!!!");
        }

    }
}
