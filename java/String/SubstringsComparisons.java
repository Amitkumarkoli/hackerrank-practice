import java.util.Scanner;

public class SubstringsComparisons {

    public static String getSmallestAndLargest(String s, int k) {        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        
                // Initialize smallest and largest with the first substring of length k
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Loop through each possible substring of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            
            // Compare and update smallest and largest if needed
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}