package day15.generics;

class GenericClass<T> {   // declare <T> here
    private T data;       // it's better to keep fields private

    void set(T data) {
        this.data = data;
    }

    T get() {
        return data;
    }
}
