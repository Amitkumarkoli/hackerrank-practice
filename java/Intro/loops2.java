import java.util.*;

class loops2 {
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        int result = a;
        for (int j = 0; j < n; j++) {
           result+=Math.pow(2,j)*b;
           System.out.print(result+" ");
        }
        System.out.println();
        }
    
        sc.close();

    }
}
