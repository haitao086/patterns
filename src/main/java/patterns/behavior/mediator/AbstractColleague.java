package patterns.behavior.mediator;

public abstract class AbstractColleague {
    protected int height ;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height ;
    }

    public abstract void setHeight(int height, AbstractMediator mediator) ;
}
