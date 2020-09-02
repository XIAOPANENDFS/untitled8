package Day20.te;

public class Usrer {
    private String name;
    private Integer age;
    private String sex;

    public Usrer() {

    }

    private Usrer(String name ,String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Usrer(String name , Integer age , String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Usrer{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
    }

    public Usrer(String name , Integer age) {
        this.name = name;
        this.age = age;
    }

    public Usrer(String name) {
        this.name = name;
    }
}
