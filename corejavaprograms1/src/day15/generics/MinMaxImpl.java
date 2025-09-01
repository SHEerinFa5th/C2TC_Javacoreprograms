package day15.generics;

// Implementation of MinMax
public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
    private T[] values;

    public MinMaxImpl(T[] values) {
        this.values = values;
    }

    @Override
    public T min() {
        T min = values[0];
        for (T val : values) {
            if (val.compareTo(min) < 0) {
                min = val;
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = values[0];
        for (T val : values) {
            if (val.compareTo(max) > 0) {
                max = val;
            }
        }
        return max;
    }
}
