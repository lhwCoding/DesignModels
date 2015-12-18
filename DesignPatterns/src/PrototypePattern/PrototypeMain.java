package PrototypePattern;

/**
 * Created by smile on 2015/12/12.
 * 原型模式的优点
 * 　　原型模式允许在运行时动态改变具体的实现类型。原型模式可以在运行期间，由客户来注册符合原型接口的实现类型，
 * 也可以动态地改变具体的实现类型，看起来接口没有任何变化，但其实运行的已经是另外一个类实例了
 * 。因为克隆一个原型就类似于实例化一个类。
 *
 * 原型模式的缺点
 * 　　原型模式最主要的缺点是每一个类都必须配备一个克隆方法。配备克隆方法需要对类的功能进行通盘考虑，
 * 这对于全新的类来说不是很难，而对于已经有的类不一定很容易，特别是当一个类引用不支持序列化的间接对象，
 * 或者引用含有循环结构的时候。
 */
public class PrototypeMain {
    private Person person = new Person();

    public void getClone() {
        //克隆
        Person pClone = null;
        try {
            //浅复制
            //  pClone = (Person) person.clone();
            //深复制
            pClone = (Person) person.deepClone();
            System.out.println("Person和克隆的pClone是否为同一个对象" + (pClone == person));
            System.out.println("Person和克隆的pClone是否有同一个getTest()对象" + (pClone.getTest() == person.getTest()));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        PrototypeMain prototypeMain = new PrototypeMain();

        prototypeMain.getClone();

    }
}
