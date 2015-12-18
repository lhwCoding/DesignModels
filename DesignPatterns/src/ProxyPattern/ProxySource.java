package ProxyPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/14.
 */
public class ProxySource implements InterProxy {
    @Override
    public void method() {
        Utils.showStr("this si ProxySource!");
    }
}
