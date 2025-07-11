package com.example.arraySorting;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {

    void someMethod(Integer i) {
        System.out.println("integer");
    }
    void someMethod(String s) {
        System.out.println("String");
    }
    int age;
    String name;

    public Employee() {
    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(1,"sid"), 1);
        map.put(new Employee(2,"arthrosis"), 1);
        System.out.println(map.size());
        String s = "india is my country";
        long count = s.chars() // gives IntStream of Unicode values
                .filter(c -> c == 'i')
                .count();
        System.out.println(count);
        Employee e = new Employee();
    }
}

class Test extends Employee{
    void someMethod(Integer i)  {
        System.out.println("integer");
    }
    public Test(int age, String name) {
        super(age, name);
    }

}