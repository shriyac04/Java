import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String m=scan.nextLine();
        String n=scan.nextLine();
        System.out.println(m.compareTo(n));
//        if(m.compareTo(n)==0){
//            System.out.println("true");
//        }
//else{
//            System.out.println("false");
//        }
    }
}
