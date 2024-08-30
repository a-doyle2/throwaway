public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(fibonacci(i));
        }
        // A for loop is the only way to have each number in the sequence print;
        // inside the recursive function, it would print each time a base case
        // is reached, printing 0 or 1 much more than once.
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n-1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}