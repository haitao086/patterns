package patterns.behavior.mediator;

public class Mediator extends AbstractMediator {

    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }

    @Override
    public void AaffectB() {
        int height = a.getHeight() ;
        b.setHeight(height * 10 );

    }

    @Override
    public void BaffectA() {
        int height = b.getHeight() ;
        a.setHeight(height / 10 );
    }
}
