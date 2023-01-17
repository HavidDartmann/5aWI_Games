package at.har.patterns.factory;

public class Bee extends AbstractActor {

    public Bee(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Bee says: " + name);
    }
}

