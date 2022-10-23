/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Tommy
 */
public class StudentModel extends UserModel<Student>{
    public Student addStudent(Scanner sc){
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Gender: ");
        String gender = sc.nextLine();
        System.out.println("Birthday: ");
        LocalDate BirthDay = LocalDate.parse(sc.nextLine());
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Background: ");
        String background = sc.nextLine();
        System.out.println("Is online ?: ");
        boolean isOnline = sc.nextBoolean();
        return new Student(name, gender, BirthDay, email, phoneNumber, background, isOnline);
    }
//    @Override
//    public void printInfo(Student s) {
//        System.out.printf("|STUDENT|%-10d|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s"
//                ,s.getId(),s.getName(),s.getGender(),s.getBirthDay().toString()
//                ,s.getEmail(),s.getPhoneNumber(),s.getBackground(),s.isIsOnline());
//    } 
}
