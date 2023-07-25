import java.util.ArrayList;
import java.util.Scanner;

public class generateNumbers {
    public static ArrayList<Integer> generateRange(int minVal, int maxVal, int step) {
        ArrayList<Integer> result = new ArrayList<>();
        int current = minVal;
        while (current <= maxVal) {
            result.add(current);
            current += step;
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numTestCases = scanner.nextInt();
            for (int i = 0; i < numTestCases; i++) {
                int minVal = scanner.nextInt();
                int maxVal = scanner.nextInt();
                int step = scanner.nextInt();
                ArrayList<Integer> output = generateRange(minVal, maxVal, step);
                System.out.println(output);
            }
        }
    }
}