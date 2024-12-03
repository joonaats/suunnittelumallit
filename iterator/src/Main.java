import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Fibonacci sequence.
        FibonacciSequence fibonacciSequence = new FibonacciSequence();

        // Obtain an iterator from the sequence.
        Iterator<Integer> iterator = fibonacciSequence.iterator();

        // Print the first 10 Fibonacci numbers.
        System.out.println("First 10 Fibonacci numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(iterator.next() + " ");
        }
    }
}