package day5.multilevelinheritance.vehicle;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        LevelOneEmployee emp = new LevelOneEmployee(
                "Sheerin", "Coimbatore", 101, 50000, "IT", "Software Developer", "AI Project"
        );

        System.out.println(emp);
    }
}
