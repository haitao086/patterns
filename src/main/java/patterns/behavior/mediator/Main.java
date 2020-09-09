package patterns.behavior.mediator;

public class Main {
    public static void main(String[] args) {
        AbstractColleague colleagueA = new ColleagueA() ;
        AbstractColleague colleagueB = new ColleagueB() ;

        AbstractMediator mediator = new Mediator(colleagueA, colleagueB) ;

        System.out.println("A affect B");
        colleagueA.setHeight(123);
        mediator.AaffectB();
        System.out.println("A : " + colleagueA.getHeight());
        System.out.println("B : " + colleagueB.getHeight());

        System.out.println("B  affect A");
        colleagueB.setHeight(456);
        mediator.BaffectA();
        System.out.println("A : " + colleagueA.getHeight());
        System.out.println("B : " + colleagueB.getHeight());
    }
}
