package com.sealedclass.example;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(51);
        list.add(21);
        List<Integer> n= (List<Integer>) list.stream().sorted().collect(Collectors.toList());
        System.out.println(n);
        List<Integer> n1= (List<Integer>) list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(n1);
        List<Employee> list1 =  new ArrayList();
        list1.add(new Employee(1,"",32));
        list1.add(new Employee(2,"",23));
        List<Employee> n2= list1.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println(n2);

    }
}
