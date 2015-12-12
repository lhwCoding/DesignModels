package FactoryPattern;

/**
 * Created by smile on 2015/12/9.
 * 工厂类
 *
 * 应用场景:
 *  凡是出现大量的产品需要创建,并且具有共同 的接口时,可以通过工厂方法模式进行创建
 * 优缺点：
 *第一种如果传入的字符错误,不能创建正确的对象
 *第三种相对于第二种,不需要实例化工厂类
 */
public class SendMainFactory {
    /**
     * 方式一 根据类型来生成对应的 实现类
     *
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }

    }

    //多个工厂方法模式
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

    //静态工厂模式
    public static Sender ProduceMail() {
        return new MailSender();
    }

    public static Sender ProduceSms() {
        return new SmsSender();
    }
}
