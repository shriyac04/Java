import java.util.*;

public class intern_intermediate {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                // Create an ArrayList to store the user input strings
                ArrayList<String> words = new ArrayList<>();

                // Ask the user for the number of strings they want to input
                System.out.print("Enter the number of strings you want to input: ");
                int n = scan.nextInt();
                scan.nextLine();  // Consume the leftover newline character

                // Take user input and intern each string before adding it to the ArrayList
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter string " + (i + 1) + ": ");
                    String word = scan.nextLine();
                    // Intern the string before adding it to the ArrayList
                    words.add(word.intern());
                }

                // Display the content of the ArrayList
                System.out.println("\nArrayList content with interned strings:");
                for (String word : words) {
                    System.out.println(word);
                }

                // Check if identical strings share the same reference in the pool
                if (words.size() > 1) {
                    System.out.println("\nChecking reference equality of first two strings:");
                    if (words.get(0) == words.get(1)) {
                        System.out.println("The first and second strings point to the same memory location.");
                    } else {
                        System.out.println("The first and second strings do not point to the same memory location.");
                    }
                }
            }
        }


