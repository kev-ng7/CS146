import java.sql.SQLOutput;

public class Fibonacci {

    // Will use dynamic programming to achieve optimized O(n) time complexity
    public static int fibonacci(int n) {
        // Initialize array to store fibonacci numbers
        int[] fibo = new int[n + 2];

        // Values in array we already know
        fibo[0] = 0;
        fibo[1] = 1;

        // Add previous 2 numbers to fibo array
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        // nth fibonacci number
        return fibo[n];
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("nth fibonacci number: " + n);
        System.out.println("Sequence of fibonacci numbers up to the nth fibonacci number:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
