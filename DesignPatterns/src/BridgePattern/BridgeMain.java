package BridgePattern;

/**
 * Created by smile on 2015/12/16.
 * 桥连模式:
 * 就是把事物和其具体实现分开,是他们可以各自独立的变化.
 * 桥连的用意是:
 * 将抽象画与是实现化解耦,使得二者可以独立变化,像我们常用的JDBC和DriverManager一样
 * JDBC进行连接数据库的时候,在各个数据库之间进行切换,基本不需要动太多的代码,甚至丝毫不用动
 * 原因就是JDBC提供统一接口,每个数据库提供各自的实现,用一个叫做数据库驱动的程序来桥连.
 */
public class BridgeMain {
    public  static  void main(String[] args){
        Bridge myBridge = new MyBridge();

        //调用第一个对象
        InterBridge bridgeOne=new BridgeOne();
        myBridge.setBridge(bridgeOne);
        myBridge.method();//this is the BridgeOne

        //调用第二个对象
        InterBridge bridgeTwo=new BridgeTwo();
        myBridge.setBridge(bridgeTwo);
        myBridge.method();//this is the BridgeTwo
    }
}
