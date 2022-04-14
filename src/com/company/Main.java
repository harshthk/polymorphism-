package com.company;
// here we build student class
class Student{
    String name;//define name variable
    int age;//define age variable
    String schoolname = "Divine Buds"; // define school name variable
    public void details(String name){
        System.out.println(name);
    }
    public void details(int age){
        System.out.println(age);
    }
    public void details(String name, int age, String schoolname){
        System.out.println(name + " " + age + " " + schoolname);
    }
    //copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        this.schoolname = s2.schoolname;
    }
    //this must be otherwise it will show an error
    Student() {

    }
    //copy constructor
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Student s1 = new Student();
        s1.name = "harsh";
        s1.age = 25;

        s1.details(s1.name);
        s1.details(s1.age);
        s1.details(s1.name,s1.age,s1.schoolname);

        Student s2 = new Student(s1);
        s2.details(s2.age);
    }
}
