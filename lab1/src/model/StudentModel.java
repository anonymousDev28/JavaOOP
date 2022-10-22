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
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        return new Student(name, address);
    }
}
