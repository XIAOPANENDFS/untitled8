package Day20;

public class Student {
    private String neme;
    private String sex;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" + "neme='" + neme + '\'' + ", sex='" + sex + '\'' + ", age=" + age + '}';
    }

    public Student(String neme , String sex , Integer age) {
        this.neme = neme;
        this.sex = sex;
        this.age = age;
    }
}
