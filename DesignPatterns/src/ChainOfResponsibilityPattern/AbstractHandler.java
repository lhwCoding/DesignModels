package ChainOfResponsibilityPattern;

/**
 * Created by smile on 2015/12/18.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
