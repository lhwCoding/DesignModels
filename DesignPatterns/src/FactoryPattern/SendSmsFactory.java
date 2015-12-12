package FactoryPattern;

/**
 * Created by smile on 2015/12/10.
 *
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
