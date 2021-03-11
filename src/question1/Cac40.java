package question1;

import java.util.ArrayList;
import java.util.List;

public class Cac40 extends Observable {

    private int value;
    List<Broker> brokers ;

    public Cac40(){
        this.brokers = new ArrayList<>();
    }

    @Override
    public void add(Broker broker) {
        this.brokers.add(broker);
    }

    @Override
    public void remove(Broker broker) {
        this.brokers.remove(broker);
    }

    @Override
    public int getObserverCount() {
        return brokers.size();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        for(Broker b : this.brokers){
            b.update();
        }
    }
}
