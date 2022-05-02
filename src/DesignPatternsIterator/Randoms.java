package DesignPatternsIterator;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                    return true;
            }
            @Override
            public Integer next() {
                int diff = max - min;
                int i = random.nextInt(diff + 1) + min;
                return i;
            }
        };

    }

}