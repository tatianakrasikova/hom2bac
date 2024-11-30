package app.shop.administration;

import app.shop.personal.Cleaner;
import app.shop.personal.Receiver;
import app.shop.personal.Salesman;
import org.springframework.beans.factory.annotation.Autowired;

public class Manager {
    @Autowired
    private Receiver receiver;
    @Autowired
    private Salesman salesman;
    @Autowired
    private Cleaner cleaner;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public Cleaner getCleaner() {
        return cleaner;
    }

    public void giveOrders(){
         receiver.work();
         salesman.work();
         cleaner.work();
     }
}
