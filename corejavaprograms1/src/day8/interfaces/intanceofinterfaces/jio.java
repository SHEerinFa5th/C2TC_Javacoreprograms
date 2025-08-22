package day8.interfaces.intanceofinterfaces;

public class jio implements Phone {

    @Override
    public void call() {
        System.out.println("Calling using Jio");
    }

    @Override
    public void sms() {
        System.out.println("Messaging using Jio");
    }
}
