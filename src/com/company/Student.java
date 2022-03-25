package com.company;

public class Student {
     static    private    String name = "Jonh";
     static    private  String classes = "Co2";

    public Student(String n , String c) {
        name = n;
        classes = c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    void display(){
        System.out.println(name + " " + classes);
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(name + classes);
    }
}
