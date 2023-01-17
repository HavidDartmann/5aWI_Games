package at.har.patterns.observer;

public class Heating implements Observer{

    @Override
    public void inform() {
        System.out.println("Heating: inform");
    }
}
