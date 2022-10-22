/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class StudentManagement {
    private ArrayList<Student> students;
    //them n student vao list

    public StudentManagement() {
        students = new ArrayList<>();
        students.add(new Student("Quang", 10, 10, 8));
        students.add(new Student("hehe1", 7, 8, 7));
        students.add(new Student("hehe2", 3, 4, 6));
    }
    
    public void addStudents(Scanner sc){
        System.out.println("How many student you want to add ?");
        int nums = Integer.parseInt(sc.nextLine());
        Student tmpStudent;
        for (int i = 0; i < nums; i++) {
            System.out.println("Student no "+(i+1));
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Math: ");
            double math = Double.parseDouble(sc.nextLine());
            System.out.println("Physic: ");
            double physic = Double.parseDouble(sc.nextLine());
            System.out.println("Chemistry: ");
            double chemistry = Double.parseDouble(sc.nextLine());
            tmpStudent = new Student(name, math, physic, chemistry);
            students.add(tmpStudent);
        }
    }
    //ti le cac loai A B C co trong list
    public void ratioAbility(){
        int ratioA = 0;
        int ratioB = 0;
        int ratioC = 0;
        for (Student student : students) {
            if(student.getAcademicPerformance().equals("A")){
                ++ratioA;
            }
            if(student.getAcademicPerformance().equals("B")){
                ++ratioB;
            }
            if(student.getAcademicPerformance().equals("C")){
                ++ratioC;
            } 
        }
        System.out.printf("A: %-5.1f%%\n",(double)ratioA*100/students.size());
        System.out.printf("B: %-5.1f%%\n",(double)ratioB*100/students.size());
        System.out.printf("C: %-5.1f%%\n",(double)ratioC*100/students.size());
    }
    public void display(){
        System.out.printf("|STUDENT|%-10s|%-10s|%-10s|%-10s|\n","ID","NAME","AVERAGE","ABILITY");
        for (Student student : students) {
            student.display();
        }
    }
}
