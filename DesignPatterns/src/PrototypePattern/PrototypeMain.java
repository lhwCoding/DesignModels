package PrototypePattern;

/**
 * Created by smile on 2015/12/12.
 */
public class PrototypeMain {
    public static  void main(String[] args){
      Person person=new Person();
        try {
            Object test=person.clone();
            System.out.println(test.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
