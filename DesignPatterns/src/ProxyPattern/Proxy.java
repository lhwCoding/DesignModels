package ProxyPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/14.
 * 代理类
 */
public class Proxy implements InterProxy {
    private  ProxySource source;

    public Proxy(){
        super();
        this.source=new ProxySource();
    }
    @Override
    public void method() {
        getMethod();
        source.method();
    }

    private void getMethod() {
        Utils.showStr("this is Proxy getMenthod!");
    }
}
