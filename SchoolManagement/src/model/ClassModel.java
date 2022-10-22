/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class ClassModel {
    StudentModel sm = new StudentModel();

    public Class addClass(Scanner sc){
        System.out.println("Enter name's class: ");
        String name = sc.nextLine();
        System.out.println("Enter info student in class "+name);
        System.out.println("How many student in this class ? ");
        int nums = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        Student tmp = null;
        for (int i = 0; i < nums; i++) {
            System.out.println("Enter info student No :"+(i+1));
            tmp = sm.addStudent(sc);
            students.add(tmp);
        }
        return new Class(name, students);
    }
    public void displayInfoClass(Class c){
        System.out.println("Class: "+c.getName());
        for (Student s : c.getStudents()) {
            sm.showInforStudent(s);
        }
    }
}
