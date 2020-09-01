package creational.singleton;

public class SingletonHungry {
    private  static  SingletonHungry instance = new SingletonHungry();
    private  SingletonHungry() {
        System.out.println("Hungry Mode");
    }
    public static SingletonHungry getInstance() {
        return instance;
    }
}
