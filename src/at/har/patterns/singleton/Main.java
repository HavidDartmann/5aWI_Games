package at.har.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        CounterSingleton counter1 = CounterSingleton.getInstance();
        CounterSingleton counter2 = CounterSingleton.getInstance();
        System.out.println(counter1 == counter2);

        counter1.increment();
        counter1.increment();
        counter2.increment();
        System.out.println(counter1 == counter2);
    }
}

