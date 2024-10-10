package Recursion;

public class sum_of_digits {
    public static void main(String[] args) {
int ans = sum1(1234);
        System.out.println(ans);
    }
    static int sum1(int n){
        if(n==0){
            return 0;
        }
        return (n%10) +sum1(n/10);

    }
}
