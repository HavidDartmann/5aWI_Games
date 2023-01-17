package at.har.patterns.factory;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Actor actor = RandomFactory.getRandomActor();
            actor.sayHello();
        }
    }
}
