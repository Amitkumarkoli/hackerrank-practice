import java.io.*;
import java.util.*;
import java.math.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a;
        BigInteger b;
        
        a = new BigInteger(sc.nextLine());
        b = new BigInteger(sc.nextLine());
        
        BigInteger sum = BigInteger.valueOf(0);
        sum = sum.add(a);
        sum = sum.add(b);
        
        BigInteger product =  BigInteger.valueOf(0);
        product = a.multiply(b);
        
        System.out.println(sum);
        System.out.println(product);
        
        sc.close();
    }
}
