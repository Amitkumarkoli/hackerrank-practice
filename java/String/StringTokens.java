import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();  // Trim leading and trailing whitespace from the input
        if(s.length() == 0){ // Check if the input string is empty after trimming
            System.out.println(0); // If empty, print 0 tokens and return (exit the program)
            return;
        }
        
        String[] words = s.split("[^a-zA-Z]+");// Split the string into words based on any non-alphabetic characters
        // [^a-zA-Z]+ matches one or more characters that are not letters
        System.out.println(words.length);
        for(String word:words){
            System.out.println(word);
        }
        scan.close();
    }
}

