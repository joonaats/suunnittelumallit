import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int prev = 0;
    private int current = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int nextValue = prev + current;
        prev = current;
        current = nextValue;
        return prev;
    }
}
