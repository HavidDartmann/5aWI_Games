package at.har.patterns.factory;

public class Ant extends AbstractActor  {

    public Ant(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Ant says: " + name);
    }
}
