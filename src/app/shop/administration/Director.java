package app.shop.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private Manager manager;
    public void manageCompany()  {
        manager.giveOrders() ;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
