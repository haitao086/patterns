package patterns.structural.proxy;

public class Customer implements IPurchaseCar {
    private int cash;
    private boolean vip;
    private String name ;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public boolean getVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void purchaseCar() {
        if (vip) {
            if (cash > 50000) {
                System.out.println(name + ", you deserve a car");
            } else {
                System.out.println(name + ", you need more money");
            }
        } else {
            System.out.println("Sorry, " + name + " not qualified");
        }
    }
}
