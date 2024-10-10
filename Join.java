import java.util.*;
public class Join {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string 1: ");
        String s1= scan.nextLine();
        System.out.print("Enter String 2: ");
        String s2=scan.nextLine();
        System.out.println(String.join("+",s1,s2));
    }
}
