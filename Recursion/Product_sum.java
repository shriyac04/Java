package Recursion;

public class Product_sum {
    public static void main(String[] args) {
int ans=product(99);
        System.out.println(ans);
    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
//        if(n%10==0){
//            return 0;
//        }
        return(n%10)*product(n/10);
    }
}
