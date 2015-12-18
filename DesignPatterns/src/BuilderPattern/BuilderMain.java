package BuilderPattern;

/**
 * Created by smile on 2015/12/12.
 * 结论:
 * 建造者模式将很多功能都集成到一个类里,这个类可以创造出比较复杂的东西
 * 工厂模式得到区别:
 * 工厂模式关注的是创建单个产品,而建造者模式则关注创建符合对象,对个部分
 * 因此,是选择工厂模式还是建造者模式,以实际情况而定
 *
 */
public class BuilderMain {
    public static  void main(String[] args){
        Builder builder=new Builder();
        builder.produceMailSender(5);
        System.out.println(builder.getList().get(0).getClass().getName()+""+"list size="+builder.getList().size());
    }
}
