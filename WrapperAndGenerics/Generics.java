package WrapperAndGenerics;
import java.util.*;
class shrek <T>{
T a;
T b;
<T>void print(T a, T b){  //with or without T before void would work
    System.out.println("a: " +a+ " "+ "b: "+b);
}
}

public class Generics {
    public static void main(String[] args) {
        shrek<Integer> s= new shrek<>();
        s.print("sdfghj","asdfghj");
p(1);
p1("zxcvbn");
    }

    // for static methods
    static <T> void p1(T data){
        System.out.println(data);
    }

    //for static methods with specific datatype only using generics
    static <T extends Number> void p(T data){
        System.out.println(data);
    }
}
