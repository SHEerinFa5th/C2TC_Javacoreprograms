package day3;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating an object of OopsConceptDemo
        OopsConceptDemo obj = new OopsConceptDemo();

        // Setting values using setter methods
        obj.setSerialNum(101);
        obj.setName("Pooja");
        obj.setAge(20);

        // Printing object using the toString method
        System.out.println(obj);
    }
}
