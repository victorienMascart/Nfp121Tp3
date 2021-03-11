package question1;


public abstract class Observable {

    public abstract void add(Broker broker);
    public abstract void remove(Broker broker);
    public abstract int getObserverCount();
}
