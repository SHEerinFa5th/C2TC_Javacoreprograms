package day5.association.hasa;

public class Executor {
    public static void main(String[] args) {
        Address address = new Address("Dubai Street, Dubai Colony", "India", "Pondy", "605009");
        Person person = new Person("Gokul Nath", address);
        person.displayInfo();
    }
}
