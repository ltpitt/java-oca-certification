package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// POJO (Plain Old Java Object)
public class Company {


    private String name;
    private List<String> employees = new ArrayList<>();

//    public Company() {}

    public void printSorted() {
        System.out.println("companyName= " + name);
        Collections.sort(employees);
        System.out.println("sorted= " + employees);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("name cant be null");
            return;
        }

        this.name = name;
    }

    public void addEmployee(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("cant add null employee");

        } else {
            employees.add(name);
        }
    }
}
