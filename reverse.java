import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the string: ");
        String s=scan.nextLine();
        System.out.print("the reversed string: ");
//        for(int i=0;i<s.length();i++){
//            System.out.print(s.charAt(s.length()-i-1));
//        }
    for(int i=s.length()-1;i>=0;i--){
        System.out.print(s.charAt(i));
    }
    }
}
