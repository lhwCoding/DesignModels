package PrototypePattern;

import java.io.*;

/**
 * Created by smile on 2015/12/12.
 * 原型模式:
 * 虽然是创建的模式,但是与工厂模式没有关系,该模式的思想就是将一个对象作为原型,对其进行复制, 克隆,产生一个
 * 和原对象类似的新对象 java中复制对象是通过clone()实现
 * 实现:
 * 一个原型类,只需要实现Cloneable接口,覆写clone方法,此处的clone方法可以改成任意的名称
 * 因为Cloneable接口是个空接口,你可以任意定义实现类的方法名,如cloneA或者cloneB,因此此处的中点是super.clone()
 * 这里调用得到是Object的clone() 方法,而在Object类中,clone()是nattive的
 * 对象的深 浅 复制的概念:
 * 浅复制:
 * 将一个对象复制后,基本数据类型的变量都会重新创建,而引用类型,指向的还是原对象所指向的
 * 深复制:
 * 将一个对象复制后,不论是基本数据类型还是引用数据类型,都是重新创建的,简单来说,就是深复制进行了完全彻底的复制
 * 而浅复制不彻底
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String string;

    private SerializableObject obj;

    /**
     * 浅复制
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 深复制
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        /**写入当前对象的二进制流*/
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /**读出二进制流产生的新对象*/
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }


    class SerializableObject implements Serializable {
        private static final long serialVersionUID = 1L;
    }
}
