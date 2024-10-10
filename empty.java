import java.util.*;
public class empty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s= scan.nextLine();
        if(s.trim().isEmpty()|| s.length()==0){
            System.out.println("it's empty");
        }
        else{
            System.out.println("it's not empty");
        }
    }

}
