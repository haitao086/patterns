package patterns.behavior.command;

public class Main {
    public static void main(String[] args) {
        TV myTV = new TV() ;

        CommandOn on = new CommandOn(myTV) ;
        CommandOff off = new CommandOff(myTV) ;
        CommandChange change = new CommandChange(myTV, 66) ;

        Control control = new Control(on, off, change) ;

        control.turnOn();
        control.changeChannel();
        control.turnOff();
    }
}
