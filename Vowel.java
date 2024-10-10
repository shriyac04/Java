import java.util.*;
public class Vowel {
    ArrayList<Character>al;
    Vowel(){
        al=new ArrayList<Character>();
        al.add('A');al.add('a');
        al.add('E');al.add('e');
        al.add('I');al.add('i');
        al.add('O');al.add('o');
        al.add('U');al.add('u');
    }
    private boolean isVowel(char c){
        for(int i=0;i<al.size();i++){
            if(c==al.get(i)){
                return true;
            }
        }
        return false;
    }
    public int countVowels(String s){ //to restrict the access to it
        int countVowel=0;
        int size=s.length();
        for(int j=0;j<size;j++){
            char c=s.charAt(j);
            if(isVowel(c)){
                countVowel+=1;
            }
        }
        return countVowel;
    }

    public static void main(String[] args) {
        Vowel obj = new Vowel();
        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine();
        int noOfVowel=obj.countVowels(str);
        System.out.println("String: "+str);
        System.out.println("Total no of vowels in the string are: "+noOfVowel);
//        str="one apple ina day keeps doctor away.";
    }
}
