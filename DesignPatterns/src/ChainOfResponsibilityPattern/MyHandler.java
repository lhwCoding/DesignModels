package ChainOfResponsibilityPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/18.
 */
public class MyHandler extends AbstractHandler implements Handler {
   private  String name;
    public  MyHandler(String name){
        this.name=name;
    }
    @Override
    public void method() {
        Utils.showStr("Get MyHandler"+name);
        if (getHandler()!=null){
            getHandler().method();
        }
    }
}
