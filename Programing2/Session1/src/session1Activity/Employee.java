package session1Activity;

import java.util.Objects;

public class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee() {
        name = "";
        age = 0;
        salary = 0;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean equals(Employee o) {
        if (age == o.age && o.salary == salary && name.contentEquals(o.name)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String st = "Name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
        return st;
    }
}
