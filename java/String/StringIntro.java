import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());// length() returns characters length
        
        if (A.compareTo(B) > 0) {// compareTo() used to compare two string's characters
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // substring() returns substring from the string
        // toUpperCase() returns uppercase letter
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" ");
        System.out.print(B.substring(0,1).toUpperCase()+B.substring(1));
        
        sc.close();
    }
}