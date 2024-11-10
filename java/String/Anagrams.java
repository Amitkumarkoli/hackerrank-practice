import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {    
        // Convert both strings to lowercase    
        a = a.toLowerCase();
        b = b.toLowerCase();
        
       // Convert then to character arrays
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
         
        // Sort the character arrays
        java.util.Arrays.sort(ch1);
        java.util.Arrays.sort(ch2);
        
        // Check if the sorted arrays are equal
        return java.util.Arrays.equals(ch1,ch2);
    }

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
