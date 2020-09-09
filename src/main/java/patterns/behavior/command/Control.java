package patterns.behavior.command;

import javax.swing.*;

public class Control {
    private ICommand commandOn, commandOff, commandChange ;

    public Control(ICommand on, ICommand off, ICommand changeTo) {
        commandOn = on ;
        commandOff = off ;
        commandChange = changeTo ;
    }

    public void turnOn () {
        commandOn.execute();
    }

    public void turnOff () {
        commandOff.execute();
    }

    public void changeChannel () {
        commandChange.execute();
    }
}
