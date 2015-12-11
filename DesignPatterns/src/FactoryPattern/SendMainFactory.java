package FactoryPattern;

/**
 * Created by smile on 2015/12/9.
 * ������
 *
 * Ӧ�ó���:
 *  ���ǳ��ִ����Ĳ�Ʒ��Ҫ����,���Ҿ��й�ͬ �Ľӿ�ʱ,����ͨ����������ģʽ���д���
 * ��ȱ�㣺
 *��һ�����������ַ�����,���ܴ�����ȷ�Ķ���
 *����������ڵڶ���,����Ҫʵ����������
 */
public class SendMainFactory {
    /**
     * ��ʽһ �������������ɶ�Ӧ�� ʵ����
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
            System.out.println("��������ȷ������!");
            return null;
        }

    }

    //�����������ģʽ
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

    //��̬����ģʽ
    public static Sender ProduceMail() {
        return new MailSender();
    }

    public static Sender ProduceSms() {
        return new SmsSender();
    }
}
