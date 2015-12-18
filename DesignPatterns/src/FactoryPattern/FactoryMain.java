package FactoryPattern;

/**
 * Created by smile on 2015/12/9.
 */
public class FactoryMain {
    public static void main(String[] args) {
        // SendMainFactory factory = new SendMainFactory();
        //方式一: 类型工厂
        //  Sender sender = factory.produce("sms");
        //方式二:对象工厂
        //Sender sender=factory.produceMail();
        //方式三: 静态工厂
        //Sender sender = SendMainFactory.ProduceMail();
        //方式三:抽象工厂
        Provider   provider=new SendMailFactory();
        Sender  sender=provider.produce();
        sender.Send();

    }
}
