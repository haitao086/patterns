package patterns.structural.proxy;

public class Proxy implements IPurchaseCar {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public void purchaseCar() {
        customer.purchaseCar();
    }
}
