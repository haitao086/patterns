package patterns.behavior.mediator;


public class ColleagueA extends AbstractColleague {
    @Override
    public void setHeight(int height, AbstractMediator mediator) {
       this.height = height;
       mediator.AaffectB();
    }
}
