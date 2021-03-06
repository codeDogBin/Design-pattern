package prototype.demo1;

import java.util.Date;
import java.util.Objects;

public class Dog implements Cloneable{
    private String name;
    private Date birthday;

    public Dog() {
    }

    public Dog(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

}
