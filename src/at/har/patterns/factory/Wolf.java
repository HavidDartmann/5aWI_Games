package at.har.patterns.factory;

public class Wolf extends AbstractActor {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Wolf says: " + name);
    }
}

