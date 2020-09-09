package patterns.behavior.mediator;


public class ColleagueB extends AbstractColleague {
    @Override
    public void setHeight(int height, AbstractMediator colleague) {
       this.height = height;
       colleague.BaffectA();
    }
}
