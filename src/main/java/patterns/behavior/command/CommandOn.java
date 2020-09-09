package patterns.behavior.command;

public class CommandOn implements ICommand {
    private TV myTV;

    public CommandOn(TV tv ) {
        this.myTV = tv ;
    }

    @Override
    public void execute() {
        myTV.turnOn();
    }
}
