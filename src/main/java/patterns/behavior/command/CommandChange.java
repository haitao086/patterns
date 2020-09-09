package patterns.behavior.command;

public class CommandChange implements ICommand {
    private TV myTV;
    private int channel;

    public CommandChange(TV tv, int channel) {
        this.myTV = tv;
        this.channel = channel ;
    }

    @Override
    public void execute() {
        myTV.changeChannel(channel);
    }
}
