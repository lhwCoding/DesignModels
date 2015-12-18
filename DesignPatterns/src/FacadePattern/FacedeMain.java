package FacadePattern;

/**
 * Created by smile on 2015/12/16.
 * 外观模式:
 * 为了解决类与类之间的依赖关系,像spring 一样,可以将类与类之间的关系配置到配置文件中,
 * 而外观模式就是将他们的关系放在一个Facade类中,降低了类与类之间的耦合度(该模式没有涉及到接口)
 *
 * 如果我们没有Computer类,那么CPU Mermory,Disk他们之间将会相互持有实例,产生关系,这样就会造成严重的依赖,
 * 修改一个类,可能会带来其他类的修改,有了Computer类,他们之间的关系被放在了Computer类里,这样就会起到了解耦的作用
 */
public class FacedeMain {

    public static  void main(String[] args){
        Computer computer=new Computer();
        computer.startup();
        computer.shutdown();
    }

}
