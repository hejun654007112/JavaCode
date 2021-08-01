package sms;

import java.util.HashMap;
import java.util.Map;

public class StudentUtil {

    private static HashMap<String,Student> map;

    private static StudentUtil studentUtil;

    private StudentUtil() {
        this.map = new HashMap<>();
    }

    public static StudentUtil getInstance(){
        if (studentUtil == null){
            studentUtil = new StudentUtil();
        }
        return studentUtil;
    }

    //欢迎 mainInterface
    public  void mainInterface(){
        System.out.println();
        System.out.println("----------------------欢迎使用学生信息管理系统----------------------");
        System.out.println("****************************************************************");
        System.out.println("请选择功能序号:1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出系统");
        System.out.println("****************************************************************");
        System.out.println();
    }

    /**
     *  学生管理系统的添加学生功能实现
     * @param student 添加的学生对象
     */
    public void add(Student student){
        if (student == null){
            return;
        }
        if (map.containsKey(student.getId())){
            System.out.println("此学生信息已存在,添加失败!");
            return;
        }
        map.put(student.getId(),student);
        System.out.println("添加成功!");
    }

    /**
     * 根据学号删除学生信息
     * @param sId 学号
     */
    public void remove(String sId){
        if (map.containsKey(sId)){
            map.remove(sId);
            System.out.println("删除成功!");
        }else {
            System.out.println("此学生信息不存在!无法删除!");
        }
    }

    /**
     * 展示所有学生信息
     */
    public void showAllStu(){
        if (map.size() == 0){
            System.out.println("没有学生信息!");
            return;
        }
        for (Map.Entry<String, Student> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    /**
     * 根据学号查询学生信息
     * @param sid 学号
     * @return 返回查找到的值
     */
    public Student findBySid(String sid){
        return map.get(sid);
    }

    public boolean contains(String sid){
        return map.containsKey(sid);
    }

    /**
     * 修改学生信息
     * @param student 学生信息
     */
    public void update(Student student){
        map.put(student.getId(), student);
        System.out.println("修改成功!");
    }
}
