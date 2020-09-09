package patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer() ;
        c1.setCash(60000);
        c1.setName("Rose");
        c1.setVip(true);

        Customer c2 = new Customer();
        c2.setCash(100000 );
        c2.setName("Jack");
        c2.setVip(false);

        Customer c3 = new Customer();
        c3.setCash(30000);
        c3.setName("Tom");
        c3.setVip(true);

        Proxy p = new Proxy() ;
        p.setCustomer(c1);
        p.purchaseCar();
        p.setCustomer(c2);
        p.purchaseCar();
        p.setCustomer(c3);
        p.purchaseCar();
    }
}
