package interface_example;

public class CoderDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.codingWorks();   // call Student implementation

        Trainer t = new Trainer();
        t.codingWorks();   // call Trainer implementation
    }
}
