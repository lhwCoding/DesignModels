package FactoryPattern;

/**
 * Created by smile on 2015/12/9.
 */
public class FactoryTest {
    public static void main(String[] args) {
        // SendMainFactory factory = new SendMainFactory();
        //��ʽһ: ���͹���
        //  Sender sender = factory.produce("sms");
        //��ʽ��:���󹤳�
        //Sender sender=factory.produceMail();
        //��ʽ��: ��̬����
        //Sender sender = SendMainFactory.ProduceMail();
         //��ʽ��:���󹤳�
        Provider   provider=new SendMailFactory();
        Sender  sender=provider.produce();
        sender.Send();

    }
}
