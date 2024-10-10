import java.util.*;
public class equal {



        public static void main(String[] args) {
            ArrayList<String> words=   new ArrayList<>();
            System.out.print("Enter the no of strings you want to enter: ");
            Scanner scan = new Scanner(System.in);
            int n= scan.nextInt();
            scan.nextLine();
            boolean found= false;
            System.out.println("enter string: ");
            for(int i=0;i<n;i++){

                String word= scan.nextLine();
                words.add(word);
            }
            System.out.print("enter the word to be searched: ");
            String finds=scan.nextLine();
            for(String word: words){
                if(word.equals(finds)){
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

    }


