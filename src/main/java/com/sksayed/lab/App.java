package com.sksayed.lab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //write a query where you get all the employees whose salary is below 2500 and sort them by name
        List<String> lessSalaryEmployeeNames =
                Employee.getEmployeeList()
                        .stream()
                        .filter(employee -> employee.getSalary() < 2500.0)
                        .map(Employee::getFirstName)
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println(lessSalaryEmployeeNames);

        //Three high Calorie dish Name
        List<String> highCalorieDishName = Dish
                .getDish()
                .stream()
                .filter(d -> {
                    return d.getCalories() >= 400;})
                .filter(Dish::isVegetarian)
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(highCalorieDishName);


    }
}
