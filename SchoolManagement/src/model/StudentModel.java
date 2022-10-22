/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class StudentModel {
    public Student addStudent(Scanner sc){
//        System.out.println("Enter ID: ");
//        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        System.out.println("Enter year of birth: ");
        int yob = sc.nextInt();
        return new Student(name,yob, address);
    }
    public void showInforStudent(Student student){
        System.out.printf("|%-10s|%-10d|%-10s|%-10d|%-15s|\n",
                            "STUDENT",student.getId(),student.getName(),student.getYob(),student.getAddress());
    }
    
}
