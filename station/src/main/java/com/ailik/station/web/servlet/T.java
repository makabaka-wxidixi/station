package com.ailik.station.web.servlet;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-08 23:30
 */
public class T {
    String name;
    int age;
    String sex;

    @Override
    public String toString() {
        return "T{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public T() {
    }

    public T(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
