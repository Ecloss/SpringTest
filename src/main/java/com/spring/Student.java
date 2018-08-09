package com.spring;

/**
 * @author 余修文
 * @date 2018/8/9 13:41
 */
public class Student {

    private Integer ID;

    private String name;

    public Student() {
    }

    public Student(Integer ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }

    public void saveMany(String name) throws Exception {
        System.out.println("保存了多个学生对象");
    }

}
