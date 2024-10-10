import java.util.*;
public class length {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s= scan.nextLine();
        int original=s.length();
        s=s.replace(" ","");
        int mod=s.length();
        int result=original-mod;
        System.out.println(s);
        System.out.println("The no of white spaces: "+result);

    }

}
