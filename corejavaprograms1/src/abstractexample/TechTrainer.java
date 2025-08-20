package abstractexample;

public class TechTrainer extends Trainer {

    public TechTrainer(String name, String expertise) {
        super(name, expertise);
    }

    @Override
    public void conductSession() {
        System.out.println("Conducting a Technical Training Session on advanced topics.");
    }
}
