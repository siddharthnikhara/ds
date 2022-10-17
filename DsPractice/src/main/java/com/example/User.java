package com.example;

import java.util.*;

public class User {

    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        int salary = list.stream().sorted(Comparator.comparing(User::getSalary)
                .reversed()).skip(6).findFirst().get().getSalary();

    }
}


//Stream.iterate(1, element->element+1)
//        .filter(element->element%5==0)
//        .limit(5)
//        //.collect(Collectors.toCollection())
//        .forEach(System.out::println);