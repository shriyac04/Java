import java.util.*;
public class contain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s1= scan.nextLine();
        System.out.print("Enter the keyword to be searched: ");
        String s2= scan.nextLine();
        if(s1.contains(s2)){
            System.out.println("true");
        }
        else{
        System.out.println("false");
    }
    }
}
