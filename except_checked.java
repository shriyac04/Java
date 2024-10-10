import java.util.*;
public class except_checked {
public static void loadClass(String classname) throws ClassNotFoundException{
    Class.forName(classname);
    System.out.println("Class "+ classname + " loaded successfully.");

}

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the class: ");
        String classname= scan.next();
        try{
            loadClass(classname);
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found: "+ classname);
        }
    }
}
