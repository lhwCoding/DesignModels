package PrototypePattern;

/**
 * Created by smile on 2015/12/12.
 */
public class PersonTest  {
    private int id;
    private String test;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "PersonTest{" +
                "id=" + id +
                ", test='" + test + '\'' +
                '}';
    }
}
