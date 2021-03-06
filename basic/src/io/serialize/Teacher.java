package io.serialize;

import java.io.Serializable;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/1
 * @time 6:53 下午
 */
public class Teacher implements Serializable {
    String name;
    private Person student;

    public Teacher(String name, Person student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
