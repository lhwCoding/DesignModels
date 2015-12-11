package FactoryPattern;

/**
 * Created by smile on 2015/12/10.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
