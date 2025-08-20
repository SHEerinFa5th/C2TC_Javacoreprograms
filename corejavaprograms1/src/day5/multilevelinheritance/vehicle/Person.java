package day5.multilevelinheritance.vehicle;

public class Person {
    private String name;
    private String city;

    public Person() {
        System.out.println("Person Class Default Constructor");
    }

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", city=" + city + "]";
    }
}
