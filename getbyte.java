import java.util.*;
public class getbyte {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s= scan.nextLine();
        byte[] barr=s.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.print(barr[i]+" ");
        }
    }

}