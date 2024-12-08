import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Number of lines of integers
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        // Reading lines of integers
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // Number of integers in the current line
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(sc.nextInt());
            }
            list.add(line); // Add the line to the main list
        }
        
        // Number of queries
        int q = sc.nextInt();
        
        // Processing queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // Line number
            int y = sc.nextInt(); // Position in the line
            
            // Check if the query is valid
            if (x > 0 && x <= list.size() && y > 0 && y <= list.get(x - 1).size()) {
                System.out.println(list.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}
