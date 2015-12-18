package CommandPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/18.
 * 被调用者
 */
public class Receiver {
    public void action(){
        Utils.showStr("command received!");
    }
}
