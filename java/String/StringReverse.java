import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversedStr = "";

        for (int i = 0; i < A.length(); i++) {
        reversedStr = A.charAt(i) + reversedStr;
        }
        
        // using string builder 
        // String reversedStr = new StringBuilder(A).reverse().toString();

                
        if(A.equals(reversedStr)){ // .equals used for compare the content of two strings      
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
