package FlyweightPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by smile on 2015/12/18.
 * 享元工厂角色类
 * 提供两种不同的方法: 一种提供单纯的享元对象,另一种共测试复合的
 */
public class FlyweightFactory {
    private Map<Character,InterFlyweight> files=new HashMap<Character, InterFlyweight>();

    /**
     * 复合享元工厂方法
     * @param compositeState
     * @return
     */
    public  InterFlyweight factory(List<Character> compositeState){
        ConcreteCompositeFlyweight compositeFlyweight=new ConcreteCompositeFlyweight();
        for (Character state:compositeState) {
            compositeFlyweight.add(state,this.factory(state));
        }
        return compositeFlyweight;
    }
    /**
     * 单纯享元工厂方法
     * @param state
     * @return
     */
    public  InterFlyweight factory(Character state){
        //先从缓存中查找对象
        InterFlyweight fly=files.get(state);
        if (fly==null){
            //如果对象不存在就创建一个新的InterFlyweight对象
            fly=new ConcreteFlyweight(state);
            //把这新的InterFlyweight对象添加到缓存中
            files.put(state,fly);
        }
        return  fly;
    }
}
