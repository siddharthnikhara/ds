package com.example.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public static int find_median(int[] v) {
        Arrays.sort(v);
        int median=0;
        if (v.length % 2 == 0) {
            median = (v[v.length / 2] + v[v.length / 2 - 1]) / 2;
        }
        else {
            median =v[v.length / 2];
        }
        return median;
    }

    public static void main(String[] args) {
        int v[] ={1,2,3,6,5,7,8};
//        System.out.println(find_median(v));
        String s= "afdafd";
        System.out.println(s.chars().filter(c -> c=='f').count());
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().collect(Collectors.toMap(Function.identity(), a -> a)));
//        System.out.println(list.stream().mapToInt(a -> a).max().getAsInt());
//        System.out.println(list.stream().max(Comparator.comparingInt(Integer::new)).get());
//        List<Student> list1 = new ArrayList<>();
//        Student student = new Student(1,"sid");
//        Student student1 = new Student(2,"si1d");
//        list1.add(student);
//        list1.add(student1);
//          list1.stream().collect(Collectors.groupingBy())
        
//        System.out.println(list1.stream().max(Comparator.comparingInt(Student::getSalary)).get().salary);
//        String s1=new String("abc");
//        String s2 = new String("abc");

    }
     static class Student{
        int salary;
        String name;
        Student(int salary,String name){
            this.salary=salary;
            this.name=name;
        }

         public int getSalary() {
             return salary;
         }

         public void setSalary(int salary) {
             this.salary = salary;
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }
     }
}