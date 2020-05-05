package prototype.demo2;


import java.util.Date;

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
        Object clone = super.clone();
        Dog dog = (Dog) clone;
        Date time = (Date) this.birthday.clone();
        dog.setBirthday(time);
        return clone;
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
