package abstractexample;

public abstract class Trainer {
    private String name;
    private String expertise;

    // Constructor
    public Trainer(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    // Abstract method (must be implemented by child classes)
    public abstract void conductSession();

    // Common method for all trainers
    public void showDetails() {
        System.out.println("Trainer Name: " + name + ", Expertise: " + expertise);
    }
}
