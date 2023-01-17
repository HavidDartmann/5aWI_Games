package at.har.patterns.observer;

public class ChargeController implements Observer{
    @Override
    public void inform() {
        System.out.println("ChargeController: inform");
    }
}
