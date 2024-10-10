import java.util.*;

public class lastindex {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s= scan.nextLine();
        System.out.println("enter the value to be searched: ");
        String find = scan.nextLine();
        System.out.print("enter the index value: ");
        String n= scan.nextLine();
        int index=-1;
//
        if(n.isEmpty()){
            System.out.println(s.lastIndexOf(find));
        }
        else{
            try{
                index=Integer.parseInt(n);

                if (index > s.length()) {
                    System.out.println("The provided index is larger than the string length.");
            }
                else{
                    System.out.println(s.lastIndexOf(find,index));
                }
            }

            catch(NumberFormatException e){
                //NumberFormatException: it is an exception that occurs when an attempt is made to convert a string into a numeric type like int,float,double,etc.
                System.out.println("invalid index format");
            }
        }

    }
}
