import java.io.*;
import java.math.*;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger a = new BigInteger(n);
        System.out.println(a.isProbablePrime(10) ? "prime" : "not prime");
         
        bufferedReader.close();
    }
}