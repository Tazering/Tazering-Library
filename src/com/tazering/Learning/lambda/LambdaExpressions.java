package com.tazering.Learning.lambda;

import java.util.*;

public class LambdaExpressions {

    public static void main(String[] args) {
       new Thread(()-> {
           System.out.println("Printing from the Runnable");
           System.out.println("Line 2");
           System.out.format("This is line %d\n", 3);
       }).start();

       Employee john = new Employee("John doe", 30);
       Employee tim = new Employee("Tyler", 21);
       Employee jack = new Employee("Jack Hill", 40);
       Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });

        for(Employee xyz : employees) {
            System.out.println(xyz.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;

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

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
