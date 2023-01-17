package at.har.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Suncollector {
    private int currVoltage;
    private List<Observer> observers;

    public Suncollector(int currVoltage) {
        if(currVoltage >= 0 && currVoltage <= 19){
            this.currVoltage = currVoltage;
        } else {
            throw new IllegalArgumentException("Voltage must be between 0 and 19");
        }
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public int getCurrVoltage() {
        return currVoltage;
    }

    public void setCurrVoltage(int currVoltage) {
        if(currVoltage >= 0 && currVoltage <= 19){
            this.currVoltage = currVoltage;
        } else {
            informObserver();
        }
    }

    private void informObserver(){
            for(Observer observer : observers){
                observer.inform();
            }
    }
}
