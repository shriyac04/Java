package Recursion;

public class palindrome {
 public static void main(String[] args) {
  String str= "MAdam";
  str=str.toLowerCase();
  System.out.println(palindromes(str,0,str.length()-1));
 }
 public static boolean palindromes(String n,int start,int end){
  if(start>=end){
   return true;
  }
  if(n.charAt(start)!=n.charAt(end)){
   return false;
  }
  return palindromes(n,start+1,end-1);
 }
}
