package sms;

/**
 * 学生类
 * 1. 定义学生类，包含以下成员变量
 *     学生类：Student成员变量：
 *         学号：sid
 *     姓名：name
 *         年龄：age
 *      生日：birthday
 *            构造方法：
 *      无参构造
 *            带四个参数的构造成员方法：
 *      每个成员变量对应给出get/set方法
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String id, String name, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return  "[学号:" + id + "\t" +
                "姓名:" + name + "\t" +
                "年龄:" + age +"岁"+"\t" +
                "出生日期:" + birthday +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (id != null ? !id.equals(student.id) : student.id != null) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return birthday != null ? birthday.equals(student.birthday) : student.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }
}
