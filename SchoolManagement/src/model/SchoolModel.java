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
public class SchoolModel {
    ClassModel cm = new ClassModel();
//    School school = new School();
    public School addSchool(Scanner sc){
        System.out.println("Enter course: ");
        String course = sc.nextLine();
        System.out.println("Enter term: ");
        String term = sc.nextLine();
//        System.out.println("How many class you wanna add, eh? ");
//        int numClass = Integer.parseInt(sc.nextLine());
        model.Class cTest = cm.addClass(sc);
        return new School(course, term, cTest);
    }
    public void displaySchoolInfo(School school){
        System.out.println("Course: "+school.getCourse());
        System.out.println("Term: "+school.getTerm());
        cm.displayInfoClass(school.getClassO()); 
    }
    public void searchByYobAndAddress(School school){
        ArrayList<Student> students = school.getClassO().getStudents();
        StudentModel sm = new StudentModel();
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getYob() == 1985 && students.get(i).getAddress().equals("Thai Nguyen")){
                flag = true;
                sm.showInforStudent(students.get(i));
                break;
            }
        }
        if(flag==false){
            System.out.println("We dont have any student was born in 1985 and have address in Thai Nguyen!");
        }
        
    }
    public void searchByClass(School school){
        ClassModel cm = new ClassModel();
        cm.displayInfoClass(school.getClassO());  
    }
}
