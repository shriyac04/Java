package Recursion;
//tail recursion- last statement is the function call
public class message {
    public static void main(String[] args) {
        msg();
    }
    static void msg(){
        System.out.println("hello world");
        msg1();
    }
    static void msg1(){
        System.out.println("hello world");
        msg2();
    }
    static void msg2(){
        System.out.println("hello world");
        msg3();
    }
    static void msg3(){
        System.out.println("hello world");
    }
}
