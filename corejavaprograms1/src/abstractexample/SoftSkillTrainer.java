package abstractexample;

public class SoftSkillTrainer extends Trainer {

    public SoftSkillTrainer(String name, String expertise) {
        super(name, expertise);
    }

    @Override
    public void conductSession() {
        System.out.println("Conducting a Soft Skills Training Session on communication and leadership.");
    }
}
