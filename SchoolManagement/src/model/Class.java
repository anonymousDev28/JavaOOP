/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Tommy
 */
public class Class {
    private String name;
    private ArrayList<Student> students;

    public Class() {
        name = "10A1";
        students = new ArrayList<>();
        students.add(new Student("Quang",2000, "Bac Kan"));
        students.add(new Student("Ha",1985, "Thai Nguyen"));
    }

    public Class(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
}
