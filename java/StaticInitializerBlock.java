/**
 * Static block points: 
 * 
 * 1)You can print anything using static blocks , 
 * even without creating a main method ==> as static blocks are executed when the classes are loaded . 
 * 
 * 2) Static blocks are executed before the constructor of a class . 
 * 3) There can be many static blocks in a class and they are executed in the order of their appearance . 
 * 4) Static blocks cannot be used to initialize non static variables .
 */

import java.io.*;
import java.util.*;

public class StaticInitializerBlock {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int B = sc.nextInt();
       int H = sc.nextInt();
       
       if(B>0 && H>0){
           System.out.println(B*H);
           
       }else{
           System.out.println("java.lang.Exception: Breadth and height must be positive");
       }
    }
}



/** 
 * There is one more method to solve this using try catch 
*/

import java.io.*;
import java.util.*;

public class StaticInitializerBlock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        
        int area = B*H;
        
       try{
           if (B<=0 || H<=0) {
               throw new Exception("");
           } else {     
               System.out.println(area);
           }
       }catch(Exception e){
           System.out.println("java.lang.Exception: Breadth and height must be positive");
       }finally{
          sc.close();;
       }   
    }
}
