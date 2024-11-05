import java.util.*;

public class substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start,end)); 
        // substring(start,end) returns substring from a string
        // if end is not specify then it end at the end of the string.
    }
}
