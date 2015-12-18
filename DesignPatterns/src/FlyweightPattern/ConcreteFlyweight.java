package FlyweightPattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/18.
 * 具体享元角色
 */
public class ConcreteFlyweight implements InterFlyweight {

    private Character character = null;

    /**
     * 构造函数,内蕴状态作为参数传入
     *
     * @param character
     */
    public ConcreteFlyweight(Character character) {
        this.character = character;
    }

    /**
     * 外蕴状态作为参数传入方法中,改变方法的行为
     * 但是并不改变最想的内蕴状态.
     *
     * @param state
     */
    @Override
    public void operation(String state) {
        Utils.showStr("this in  State = " + this.character);
        Utils.showStr("this out State =" + state);
    }

}
