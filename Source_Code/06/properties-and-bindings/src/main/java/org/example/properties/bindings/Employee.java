package org.example.properties.bindings;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private StringProperty name;
    private DoubleProperty salary;

    public Employee(String name, double salary){
        this.name = new SimpleStringProperty(name);
        this.salary = new SimpleDoubleProperty(salary);
    }

    public String getName(){
        return name.getValue();
    }

    public double getSalary(){
        return salary.get();
    }

    public DoubleProperty getSalaryProperty(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary.set(salary);
    }
}
