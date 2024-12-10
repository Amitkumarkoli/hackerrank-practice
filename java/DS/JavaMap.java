// Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        // Step 1: Input the number of entries
        int n = in.nextInt();
        in.nextLine(); // Consume the leftover newline character

        // Step 2: Create a HashMap to store phone book entries
        Map<String, Integer> phoneBook = new HashMap<>();

        // Step 3: Populate the phone book
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine(); // Consume the leftover newline character
            phoneBook.put(name, phone);
        }

        // Step 4: Process queries
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
