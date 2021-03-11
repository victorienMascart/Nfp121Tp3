package question1;

public class Broker implements Observer {

    private boolean changed;

    public Broker(){
        changed=false;
    }

    public boolean isChangeDetected() {
        this.update();
        return changed;
    }


    @Override
    public void update() {
        this.changed = true;
    }
}
