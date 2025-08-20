package day5.association.hasa;

public class Person {
    private String name;
    private Address address;  // HAS-A relationship

    // Constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Display person info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address); // calls Address.toString()
    }
}
