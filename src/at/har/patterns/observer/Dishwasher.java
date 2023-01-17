package at.har.patterns.observer;

public class Dishwasher implements Observer{
    @Override
    public void inform() {
        System.out.println("Dishwasher: inform");
    }
}
