import java.util.*;
class excepts extends Exception {
    public excepts(String str){
        super(str);
    }
}
public class except{
    public static void main(String args[]){
        try{
            Scanner scan=new Scanner(System.in);
            System.out.print("enter the exception: ");
            String s=scan.nextLine();
            throw new excepts(s);
        }
        catch(excepts e){
            System.out.println("caught the exception");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("bauu");
        }
    }
}
