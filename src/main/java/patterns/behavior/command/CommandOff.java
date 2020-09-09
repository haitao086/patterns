package patterns.behavior.command;

public class CommandOff implements ICommand {
    private TV myTV;

    public CommandOff(TV tv ) {
        this.myTV = tv ;
    }

    @Override
    public void execute() {
        myTV.turnOff();
    }
}
