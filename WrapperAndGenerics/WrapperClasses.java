package WrapperAndGenerics;
import java.util.*;
public class WrapperClasses {
    public static void main(String[] args) {
        //method-1
//        Integer obj = new Integer(12);
//        //m-2 : recommended as it is a method of Integer WrapperClass
//        Integer obj2 = Integer.valueOf(123);
//        //m-3:autoboxing
//        Integer obj3=1234;
//
//        System.out.println(obj);
//        System.out.println(obj2);
//        System.out.println(obj3);
//
//        int age=obj;
//        System.out.println(age);
        String s= "12";
        String s1="13";
        Integer i=Integer.valueOf(s);
        Integer i2= Integer.valueOf(s1);
        System.out.println(i+i2);

    }
}
