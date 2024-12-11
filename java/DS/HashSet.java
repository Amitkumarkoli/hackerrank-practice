import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashSet {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
 Set<String> uniquePairs = new HashSet<>();

        // Step 3: Process and print the count of unique pairs
        for (int i = 0; i < t; i++) {
            // Combine pair_left and pair_right into a single string as a unique pair
            String pair = pair_left[i] + " " + pair_right[i];

            // Add the pair to the HashSet
            uniquePairs.add(pair);

            // Print the size of the HashSet after each addition
            System.out.println(uniquePairs.size());
        }

        s.close();

   }
}