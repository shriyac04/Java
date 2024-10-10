import java.util.*;
public class interns {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s= scan.nextLine();
        String s2=s.intern();
        System.out.println(s==s2);
    }
}
