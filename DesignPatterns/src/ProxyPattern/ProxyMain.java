package ProxyPattern;

/**
 * Created by smile on 2015/12/14.
 * 代理模式:
 * 代理模式就是多出一个代理类出来,替原对象进行一些操作
 * 比如,我们租房子要找中介 ,打官司要找律师
 * 其实原理差不多就是你对该地区的房屋信息不了解,希望找一个更熟悉的人(代理类)
 * 去帮你做(实现你的需求)替我们进行操作
 *
 * 应用场景:
 * 如果已有的方法在使用的时候需要对原有的方法进行改进,此时有两种方法:
 * 1.修改原有的方法来适应.这样违反了"对扩展开放,对修改关闭"的原则
 * 2.就是采用一个代理类调用原有的方法,且对产生的结果进行控制,这种方法就是代理模式
 *
 * 好处:使用代理模式,可以将功能划分的更加清晰,有助于后期维护!
 */
public class ProxyMain {

    public static  void  main(String[] args){
        InterProxy proxySource=new Proxy();
        proxySource.method();// this is Proxy getMenthod! this si ProxySource!

    }
}
