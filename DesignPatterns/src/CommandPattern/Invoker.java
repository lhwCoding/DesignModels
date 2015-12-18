package CommandPattern;

/**
 * Created by smile on 2015/12/18.
 * 调用者
 */
public class Invoker {
    private  InterCommand command;
    public  Invoker(InterCommand command){
        this.command=command;
    }

    public  void action(){
        command.execute();
    }
}
