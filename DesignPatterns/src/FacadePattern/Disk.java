package FacadePattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/16.
 */
public class Disk {
    public void startup(){
        Utils.showStr("Disk startup");
    }

    public void shutdown(){
        Utils.showStr("Disk shutdown");
    }
}
