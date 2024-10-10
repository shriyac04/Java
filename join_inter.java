import java.sql.Array;
import java.util.*;
public class join_inter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> arr= new ArrayList<>();
        System.out.print("Enter the size: ");
        int size= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            String element=scan.nextLine();
            arr.add(element);
        }
        System.out.println("The modified array: ");

            String result=String.join("@",arr);
        System.out.println(result);
    }


}
