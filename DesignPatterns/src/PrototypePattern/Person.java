package PrototypePattern;

/**
 * Created by smile on 2015/12/12.
 * 集成一个克隆类
 */
public class Person extends Prototype{
    private String name;
    private int age;
    private String sex;
    private PersonTest test;

    public PersonTest getTest() {
        return test;
    }

    public void setTest(PersonTest test) {
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
