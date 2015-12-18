package FacadePattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/16.
 */
public class CPU {
    public void startup(){
        Utils.showStr("cpu startup");
    }

    public void shutdown(){
        Utils.showStr("cup shutdown");
    }
}
