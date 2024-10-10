import java.util.*;

public class concatenate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String m = scan.nextLine();
        System.out.print("Enter the second string: ");
        String n= scan.nextLine();
        // appends at the bottom by default
        String s= m.concat(" ").concat(n).concat(" ").concat(n).concat("!!!");
        System.out.println(s);


    }
}
