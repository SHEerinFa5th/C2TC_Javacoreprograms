package abstractexample;

public class Demo {
    public static void main(String[] args) {
        // Create objects of child classes
        Trainer tech = new TechTrainer("Alice", "Java & AI");
        Trainer soft = new SoftSkillTrainer("Bob", "Leadership & Communication");

        // Show details + conduct session
        tech.showDetails();
        tech.conductSession();

        System.out.println();

        soft.showDetails();
        soft.conductSession();
    }
}
