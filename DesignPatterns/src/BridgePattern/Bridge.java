package BridgePattern;

/**
 * Created by smile on 2015/12/16.
 * 定义一个抽象的桥
 */
public abstract class Bridge {


    private  InterBridge bridge;

    public void  method(){
        bridge.method();
    }
    public InterBridge getBridge() {
        return bridge;
    }

    public void setBridge(InterBridge bridge) {
        this.bridge = bridge;
    }

}
