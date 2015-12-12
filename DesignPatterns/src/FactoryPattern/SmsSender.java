package FactoryPattern;

/**
 * Created by smile on 2015/12/9.
 * 短信实现类
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is SmsSender!");
    }
}
