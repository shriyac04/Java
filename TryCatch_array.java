import java.util.*;
public class TryCatch_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size= scan.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        try {
            System.out.println("enter the index value: ");
            int index = scan.nextInt();
            System.out.println("Value at index "+ index+": "+arr[index]);
        }
        catch(Exception e){
            System.out.println("Exception caught: "+e);
        }


    }

}
