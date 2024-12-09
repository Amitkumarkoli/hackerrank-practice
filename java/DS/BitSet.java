import java.util.*;

public class BitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the size of BitSets and number of operations
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Initializing two BitSets of size n
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        // Processing the operations
        for (int i = 0; i < m; i++) {
            String operation = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Perform operations based on the input command
            switch (operation) {
                case "AND":
                    if (x == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                    break;
                case "OR":
                    if (x == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                    break;
                case "XOR":
                    if (x == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                    break;
                case "FLIP":
                    if (x == 1) {
                        b1.flip(y);
                    } else {
                        b2.flip(y);
                    }
                    break;
                case "SET":
                    if (x == 1) {
                        b1.set(y);
                    } else {
                        b2.set(y);
                    }
                    break;
            }

            // Print the number of set bits in both BitSets
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        sc.close();
    }
}
