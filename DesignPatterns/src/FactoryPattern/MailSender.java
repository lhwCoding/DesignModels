package FactoryPattern;

/**
 * Created by smile on 2015/12/9.
 * ʵ����
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this si mailSender!");
    }
}
