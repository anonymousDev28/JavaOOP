/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;
/**
 *
 * @author Tommy
 */
public class StudentManagement {
    private ArrayList<Student> students;
    private StudentModel sm;
    public StudentManagement() {
        students = new ArrayList<>();
        sm = new StudentModel();
    }

    public StudentManagement(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    
    public void addStudent(Scanner sc){
        System.out.println("How many student you wanna add ?");
        int nums = Integer.parseInt(sc.nextLine());
        Student s;
        for (int i = 0; i < nums; i++) {
            System.out.println("Student no "+(i+1));
            s = sm.addStudent(sc);
            students.add(s);
        }
    }
    public void display(){
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
