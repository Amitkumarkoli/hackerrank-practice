import java.util.*;

class Arrays{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    // take size 

        List<Integer> list = new ArrayList<>();  // initialize array list

        for(int i=0; i<n; i++){
            list.add(sc.nextInt());     // add some inputs
        } 

        Collections.reverse(list);

        for(int num:list){
            System.out.print(num+" ");
        }
    }
}