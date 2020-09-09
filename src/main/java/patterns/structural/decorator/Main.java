package patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        IHuman p = new Person();
        Decorator d = new Step3(new Step2(new Step1(p))) ;
        d.wearCloth();
        d.goSomewhere();
    }
}
