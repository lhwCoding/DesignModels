package FactoryPattern;

/**
 * Created by smile on 2015/12/9.
 * 邮箱实现类
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this si mailSender!");
    }
}
