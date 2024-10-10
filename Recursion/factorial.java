package Recursion;

public class factorial {
    public static void main(String[] args) {
int a=factorial(3);
        System.out.println(a);

    }
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(--n);
    }
}
