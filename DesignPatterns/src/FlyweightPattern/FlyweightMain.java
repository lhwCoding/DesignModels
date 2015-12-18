package FlyweightPattern;

import Utils.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smile on 2015/12/18.
 * 享元模式
 * 享元模式的主要目的是实现对象的共享,即共享池,当系统中对象多的时候可以减少内存的开销,
 * 通常与工厂模式一起使用
 * FlyweightFactory负责创建和管理享元单元,当一个客户端请求时,工厂需要检查当前对象池中是否有符合条件
 * 的对象,如果有,就返回已经存在的对象,如果没有,则创建一个新对象.
 * 享元模式的优缺点:
 * 享元模式的优点在于它大幅度的降低内存中对象的数量.但是,它做到这一点所付出的代价也是很高的:
 * 缺点:
 * 享元模式是系统更加复杂,为了是对象可以共享,需要将一些状态外部化,这使得程序的逻辑复杂化.
 * 享元模式将享元对象的状态外部化,而读取外部状态使得运行时间稍微变长
 *
 */
public class FlyweightMain {

    public static void main(String[] args){
      //单纯的享元模式
        FlyweightFactory factory=new FlyweightFactory();
        InterFlyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly=factory.factory(new Character('b'));
        fly.operation("Second Call");

        fly=factory.factory(new Character('a'));
        fly.operation("Third Call");
        Utils.showStr("-----------------------------------------------------");
        //复合的享元模式
        List<Character> characters=new ArrayList<Character>();
        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('a');
        characters.add('b');

        FlyweightFactory factory1=new FlyweightFactory();
        InterFlyweight interFlyweight=factory1.factory(characters);
        InterFlyweight interFlyweight1=factory1.factory(characters);
        //一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等的。即外运状态都等于Composite Call。
        //一个复合享元对象所含有的单纯享元对象的内蕴状态一般是不相等的。即内蕴状态分别为b、c、a。
        interFlyweight.operation("Composite Call");

        //复合享元对象是不能共享的。即使用相同的对象compositeState通过工厂分别两次创建出的对象不是同一个对象。
        Utils.showStr("复合享元模式是否可以共享对象: "+(interFlyweight==interFlyweight1));

        Character state='a';
        InterFlyweight fly1=factory1.factory(state);
        InterFlyweight fly2=factory1.factory(state);
        //单纯享元对象是可以共享的。即使用相同的对象state通过工厂分别两次创建出的对象是同一个对象。
        Utils.showStr("单纯享元模式是否可以共享对象: "+(fly1==fly2));


    }
}
