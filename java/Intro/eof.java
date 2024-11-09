import java.io.*;
import java.util.*;

// End of file : take user input and print desire output until reach end of file;

public class eof {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
         
                  int n = 1;
                
              while (sc.hasNext()) {
                  
                String a = sc.nextLine();
                System.out.println(n+" "+a);
                n++;                       // for increment number(n)
        }
        sc.close();

    }
}
