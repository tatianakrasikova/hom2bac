package app.code;

import app.shop.administration.Director;
import app.shop.administration.Manager;
import app.shop.personal.Cleaner;
import app.shop.personal.Receiver;
import app.shop.personal.Salesman;

public class Application {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Salesman salesman = new Salesman();
        Cleaner cleaner = new Cleaner();
        Manager manager = new Manager();
        manager.setReceiver(receiver);
        manager.setSalesman(salesman);
        manager.setCleaner(cleaner);
        Director director = new Director();
        director.setManager(manager);
        director.manageCompany();
    }
}
