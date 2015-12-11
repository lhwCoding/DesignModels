package SingLetonPattern;

/**
 * Created by smile on 2015/12/10.
 *   ʵ������ǣ�����ģʽʹ���ڲ�����ά��������ʵ�֣�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ��
 *   �����ļ��ع������̻߳���ġ����������ǵ�һ�ε���getInstance��ʱ��JVM�ܹ������Ǳ�֤instanceֻ������һ�Σ�
 *   ���һᱣ֤�Ѹ�ֵ��instance���ڴ��ʼ����ϣ�
 *   �������ǾͲ��õ�����������⡣ͬʱ�÷���Ҳֻ���ڵ�һ�ε��õ�ʱ��ʹ�û�����ƣ�
 *   �����ͽ���˵��������⡣����������ʱ�ܽ�һ�������ĵ���ģʽ��
 */
public class SingletonIn {

    /* ˽�й��췽������ֹ��ʵ���� */
    private SingletonIn() {
    }

    /* �˴�ʹ��һ���ڲ�����ά������ */
    private static class SingletonFactory {
        private static SingletonIn instance = new SingletonIn();
    }

    /* ��ȡʵ�� */
    public static SingletonIn getInstance() {
        return SingletonFactory.instance;
    }

    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
    public Object readResolve() {
        return getInstance();
    }
}
