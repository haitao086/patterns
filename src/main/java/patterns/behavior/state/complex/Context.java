package patterns.behavior.state.complex;

public class Context {

    private State state = null;

    //setState是用来改变state的状态 使用setState实现状态的切换
    public void setState(State state) {
        this.state = state;
    }

    public void push() {
        //状态的切换的细节部分,在本例中是颜色的变化,已经封装在子类的handlepush中实现,这里无需关心
        state.handlepush(this);
        //假设sample要使用state中的一个切换结果,使用getColor()
        Sample sample = new Sample(state.getcolor());
        sample.operate();
    }

    public void pull() {
        state.handlepull(this);
        //假设sample要使用state中的一个切换结果,使用getColor()
        Sample sample2 = new Sample(state.getcolor());
        sample2.operate();
    }

}
