package AdapterPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/14.
 */
public class SourceSubOne extends InterfaceAdapter {

    public void intermethod1() {
        Utils.showStr("this is SourceSubOne");
    }
}
