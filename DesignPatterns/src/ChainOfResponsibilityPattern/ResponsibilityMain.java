package ChainOfResponsibilityPattern;

/**
 * Created by smile on 2015/12/18.
 * 责任链模式
 * 应用场景:
 * 有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，
 * 请求在这条链上传递，直到某一对象决定处理该请求。但是发出者并不清楚到底最终
 * 那个对象会处理该请求，所以，责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整
 *
 * Abstracthandler类提供了get和set方法，方便MyHandle类设置和修改引用对象，
 * MyHandle类是核心，实例化后生成一系列相互持有的对象，构成一条链
 */
public class ResponsibilityMain {
    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");
        h1.setHandler(h2);
        h2.setHandler(h3);
        h1.method();
    }

}
