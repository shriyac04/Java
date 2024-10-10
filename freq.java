import java.util.*;

public class freq {
    public static void main(String[] args) {
//        String str="welcome to javatpoint";
        Scanner scan = new Scanner(System.in);
        String c= scan.nextLine();
        char m = scan.next().charAt(0); // charAt(0) reads the first character and next() reads the next token
        int count=0;
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)==m){
                count++;
            }
        }
        System.out.println("Frequency of "+ m+" :"+count);
    }
}
