package BridgePattern;

/**
 * Created by smile on 2015/12/16.
 */
public class MyBridge extends Bridge {
    public  void method(){
        getBridge().method();
    }
}
