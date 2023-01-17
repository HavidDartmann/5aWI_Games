package at.har.patterns.observer;

public class Main {

        public static void main(String[] args) {
            Suncollector s1 = new Suncollector(10);
            Heating h1 = new Heating();
            Dishwasher d1 = new Dishwasher();
            ChargeController c1 = new ChargeController();
            s1.addObserver(h1);
            s1.addObserver(d1);
            s1.addObserver(c1);

            s1.setCurrVoltage(18);


        }
}
