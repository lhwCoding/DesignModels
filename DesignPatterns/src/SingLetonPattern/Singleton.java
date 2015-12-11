package SingLetonPattern;

/**
 * Created by smile on 2015/12/10.
 * ����ģʽ:
 * ��һ�ֳ��õ����ģʽ,��javaӦ����,���ж����ܱ�֤��һ��jvm ��,�ö���ֻ��һ��ʵ������
 * �ô�:
 * 1.ĳЩ�ഴ���Ƚ�Ƶ��,����һЩ���͵Ķ���,����һ�ʺܴ��ϵͳ����
 * 2.ʡȥ��new ������,������ϵͳ�ڴ��ʹ��Ƶ��,����GCѹ��
 * 3.��Щ���罻�����ĺ�������,�����Ž�������,���������Դ�������Ļ�,ϵͳ��ȫ����.(����һ�����ӳ����˶��˾��Աͬʱָ��,
 * �϶����ҳ�һ��),����ֻ��ʹ�õ���ģʽ,���ܱ�֤���Ľ��׷���������������������
 */
public class Singleton {
    /**
     * ����˽�о�̬ʵ��,��ֹ������,�˴���ֵΪnull,Ŀ����ʵ���ӳټ���
     */
    private static Singleton instance = null;

    /**
     * ˽�й��췽��,��ֹ��ʵ����
     */
    private Singleton() {
    }

    /**
     * ��̬����,����ʵ��
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * ����ڶ��߳������ ����sysnchronized
     */
    public static Singleton getSysInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * ��synchronized�ؼ��ּ������ڲ���Ҳ����˵�����õ�ʱ���ǲ���Ҫ�����ģ�ֻ����instanceΪnull��
     * �����������ʱ�����Ҫ������������һ�������������ǣ�����������������п���������ģ�
     * ��������������Javaָ���д�������͸�ֵ�����Ƿֿ����еģ�Ҳ����˵instance = new Singleton();
     * ����Ƿ�����ִ�еġ�����JVM������֤�������������Ⱥ�˳��Ҳ����˵�п���JVM��Ϊ�µ�Singletonʵ������ռ�
     * ��Ȼ��ֱ�Ӹ�ֵ��instance��Ա��Ȼ����ȥ��ʼ�����Singletonʵ���������Ϳ��ܳ�����
     * ��������A��B�����߳�Ϊ����
     a>A��B�߳�ͬʱ�����˵�һ��if�ж�

     b>A���Ƚ���synchronized�飬����instanceΪnull��������ִ��instance = new Singleton();

     c>����JVM�ڲ����Ż����ƣ�JVM�Ȼ�����һЩ�����Singletonʵ���Ŀհ��ڴ棬����ֵ��instance��Ա
     ��ע���ʱJVMû�п�ʼ��ʼ�����ʵ������Ȼ��A�뿪��synchronized�顣

     d>B����synchronized�飬����instance��ʱ����null������������뿪��synchronized�鲢��������ظ����ø÷����ĳ���

     e>��ʱB�̴߳���ʹ��Singletonʵ����ȴ������û�б���ʼ�������Ǵ������ˡ�

     ���Գ������п��ܷ���������ʵ���������й����Ǻܸ��ӵģ���������ǾͿ��Կ�����
     ��������д���̻߳����µĳ�������Ѷȣ�����ս�ԡ����ǶԸó�������һ���Ż���
     * */
     /** �˴�ʹ��һ���ڲ�����ά������ */
    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }
    /* ��ȡʵ�� */
    public static Singleton getInstance2(){
        return SingletonFactory.instance;
    }

    /**
     * ����ö����������л�,���Ա�֤���������л�ǰ�󱣳�һ��
     */
    public Object readResolve() {
        return instance;
    }
}
