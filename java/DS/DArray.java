import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        // Input the 6x6 2D array
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int maxSum = Integer.MIN_VALUE;

        // Calculate the maximum hourglass sum
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                maxSum = Math.max(maxSum, sum);
            }
        }

        // Print the maximum hourglass sum
        System.out.println(maxSum);
    }
}
