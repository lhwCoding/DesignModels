package FacadePattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/16.
 */
public class Memory {
    public void startup(){
        Utils.showStr("Memory startup");
    }

    public void shutdown(){
        Utils.showStr("Memory shutdown");
    }
}
