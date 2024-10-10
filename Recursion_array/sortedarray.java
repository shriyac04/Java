package Recursion_array;
import java.util.*;
public class sortedarray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
int[] arr= new int[5];
for(int i=0;i<5;i++){
    arr[i]=scan.nextInt();
}
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(sort(arr,0));
    }
    static boolean sort(int[] arr,int index){
       //base condition
        if(index==arr.length-1){
          return true;
        }

return arr[index]<arr[index+1] && sort(arr,index+1);
    }
}
