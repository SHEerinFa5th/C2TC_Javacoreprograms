package day15.generics;

// Generic interface with a type bound
public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
