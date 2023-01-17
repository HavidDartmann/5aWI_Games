package at.har.patterns.factory;

import java.util.Random;

public class RandomFactory {

    public static Actor getRandomActor() {
        Random random = new Random();
        // 0 = Ant, 1 = Bee, Wolf = 2
        int randomActor = random.nextInt(3);
        switch (randomActor) {
            case 0:
                return new Ant("Sepp " + random.nextInt(1000));
            case 1:
                return new Bee("Flo " + random.nextInt(1000));
            case 2:
                return new Wolf("Mario " + random.nextInt(1000));
            default:
                System.out.println("No actor found");
                return null;
        }
    }
}
