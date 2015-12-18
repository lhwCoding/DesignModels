package CommandPattern;

/**
 * Created by smile on 2015/12/18.
 */
public class MyCommand implements InterCommand {
    private Receiver receiver;
    public MyCommand(Receiver receiver){
        this.receiver=receiver;
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
