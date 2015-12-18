package BridgePattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/16.
 */
public class BridgeOne implements InterBridge {
    @Override
    public void method() {
        Utils.showStr("this is the BridgeOne");
    }
}
