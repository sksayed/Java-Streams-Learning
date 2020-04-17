package com.sksayed.lab;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.sksayed.lab.Employee.Designation.*;

public class Employee {
    private String firstName;
    private String lastName;
    private Designation designamtion;
    private double salary;
    private Date birthdate;
    private Date joiningDate;

    public Employee(String firstName, String lastName, Designation designamtion, double salary, Date birthdate, Date joiningDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.designamtion = designamtion;
        this.salary = salary;
        this.birthdate = birthdate;
        this.joiningDate = joiningDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Designation getDesignamtion() {
        return designamtion;
    }

    public void setDesignamtion(Designation designamtion) {
        this.designamtion = designamtion;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public enum Designation {
        MANAGER, CLARK, SWEPER, ELECTRICIAN, CODER, ACCOUNTANT
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee emp = new Employee("sheikh", "sayed", MANAGER, 3600.00,
                new Date(1994, 04, 18), new Date(2019, 8, 01));

        employees.add(emp);

        emp = new Employee("sheikh", "zahid", CLARK, 2500.00,
                new Date(1990, 03, 21), new Date(2011, 8, 01));

        employees.add(emp);

        emp = new Employee("sheikh", "zayed", ELECTRICIAN, 1600.00,
                new Date(1984, 11, 2), new Date(2012, 9, 01));

        employees.add(emp);

        emp = new Employee("Md", "reza", CODER, 3600.00,
                new Date(1970, 1, 1), new Date(1998, 2, 01));

        employees.add(emp);

        emp = new Employee("Bob", "builder", CODER, 3600.00,
                new Date(1965, 02, 28), new Date(2002, 7, 19));

        employees.add(emp);

        emp = new Employee("Scott", "tiger", MANAGER, 5600.00,
                new Date(1960, 5, 15), new Date(2005, 6, 14));

        employees.add(emp);

        emp = new Employee("james", "goslin", SWEPER, 600.00,
                new Date(1910, 2, 8), new Date(1950, 2, 01));

        employees.add(emp);

        emp = new Employee("abedin", "islam", ACCOUNTANT, 2300.00,
                new Date(1996, 05, 12), new Date(2013, 11, 11));

        employees.add(emp);
        return employees;
    }
}
