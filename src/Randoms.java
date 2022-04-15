import java.util.Iterator;
import java.util.Random;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = ++max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max - min) + min;
            }

        };
        return it;

    }
}