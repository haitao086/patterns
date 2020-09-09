package patterns.behavior.command;

public class TV {
    public int currentChannel = 0 ;
    public void turnOn () {
        System.out.println("TV is on");
    }

    public void turnOff () {
        System.out.println("TV is off");
    }

    public void changeChannel (int channel) {
        this.currentChannel = channel ;
        System.out.println("TV is on channel " +  currentChannel);
    }
}
