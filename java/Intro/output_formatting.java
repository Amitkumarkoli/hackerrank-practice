import java.util.Scanner;

public class output_formatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
//for left and right formatting , for string 15s and for int 03
                System.out.printf("%-15s%03d%n",s1,x);
            }                      
            System.out.println("================================");

    }
}